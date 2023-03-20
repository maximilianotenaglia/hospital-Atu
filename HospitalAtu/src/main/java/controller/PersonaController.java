package controller;

import Entities.Persona;
import Services.*;
import dto.EnfermeroDto;
import dto.MedicoDto;
import dto.PacienteDto;
import dto.PersonaDto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Entities.Persona.Atributo.*;

public class PersonaController {
    private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    private PersonaService personaService = new PersonaServiceImpl();
    private EnfermeroService enfermeroService = new EnfermeroServiceImpl();
    private PacienteService pacienteService = new PacienteServiceImpl();
    private MedicoService medicoService = new MedicoServiceImpl();

    public void crearPersona() throws IOException {
        System.out.println("Atributo del nuevo usuario: \n1- PACIENTE \n2- ENFERMERO \n3- MEDICO");
        String atributo = buffer.readLine();
        int atributoSeleccionado = Integer.parseInt(atributo);
        Persona.Atributo opcionAtributo = null;
        switch (atributoSeleccionado) {
            case 1:
                opcionAtributo = PACIENTE;
                break;
            case 2:
                opcionAtributo = ENFERMERO;
                break;
            case 3:
                opcionAtributo = MEDICO;
                break;
        }
        System.out.println("Nombre completo: ");
        String nombre = buffer.readLine();
        System.out.println("Numero de DNI: ");
        String dni = buffer.readLine();
        System.out.println("Direccion: ");
        String direccion = buffer.readLine();
        System.out.println("nro Puerta: ");
        String puerta = buffer.readLine();
        int nroPuerta = Integer.parseInt(puerta);
        System.out.println("C.P.: ");
        String cpString = buffer.readLine();
        int cp = Integer.parseInt(cpString);
        System.out.println("Numero de telefono: ");
        String telefonoString = buffer.readLine();
        int telefono = Integer.parseInt(telefonoString);
        System.out.println("email: ");
        String email = buffer.readLine();
        System.out.println("defina su password: ");
        String password = buffer.readLine();

        PersonaDto result = personaService.crearPersona(new PersonaDto(
                1,
                opcionAtributo,
                nombre,
                dni,
                direccion,
                nroPuerta,
                cp,
                telefono,
                email,
                password
        ));
        System.out.println(result);


        if (opcionAtributo == ENFERMERO) {
            EnfermeroDto resultEnfermero = new EnfermeroDto(result);
            resultEnfermero = enfermeroService.crearEnfermero(resultEnfermero);

            System.out.println(resultEnfermero.toString());

        } else if (opcionAtributo == PACIENTE) {
            PacienteDto resultPaciente = new PacienteDto(result);
            resultPaciente = pacienteService.crearPaciente(resultPaciente);

            System.out.println(resultPaciente.toString());

        } else if (opcionAtributo == MEDICO) {
            MedicoDto resultMedico = new MedicoDto(result);
            resultMedico = medicoService.crearMedico(resultMedico);

            System.out.println(resultMedico.toString());
        }
    }
}
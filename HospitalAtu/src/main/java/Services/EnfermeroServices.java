package Services;

import Entities.Enfermero;
import Entities.Paciente;
import Repository.EnfermeroRepository;
import Repository.PacienteRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

import static Entities.Paciente.NivelUrgencia.*;
import static Entities.Persona.Atributo.ENFERMERO;
import static Repository.EnfermeroRepository.consultarEnfermeros;
import static Repository.PacienteRepository.consultarPacientes;

public class EnfermeroServices {
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static Enfermero usuarioActivoEnfermero;
    static int idEnfermero = 0;
    private static EnfermeroRepository enfermeroRepository = new EnfermeroRepository();

    public static Object crearNuevoEnfermero() throws IOException {

        System.out.println("Nombre completo: ");
        String textoRecoger1 = buffer.readLine();
        System.out.println("Numero de DNI: ");
        String textoRecoger2 = buffer.readLine();
        System.out.println("Direccion: ");
        String textoRecoger3 = buffer.readLine();
        System.out.println("nro Puerta: ");
        String textoRecoger4 = buffer.readLine();
        int nroPuerta = Integer.parseInt(textoRecoger4);
        System.out.println("C.P.: ");
        String textoRecoger5 = buffer.readLine();
        int cp = Integer.parseInt(textoRecoger5);
        System.out.println("Numero de telefono: ");
        String textoRecoger6 = buffer.readLine();
        int telefono = Integer.parseInt(textoRecoger6);
        System.out.println("email: ");
        String textoRecoger7 = buffer.readLine();
        System.out.println("defina su password: ");
        String textoRecoger8 = buffer.readLine();

        return enfermeroRepository.crearEnfermero(new Enfermero(ENFERMERO, textoRecoger1, textoRecoger2, textoRecoger3, nroPuerta, cp, telefono, textoRecoger7, textoRecoger8, idEnfermero++, true));
    }

    public static boolean validarUsuario(String textoRecoger1, String textoRecoger2) {
        boolean usuarioValido = false;
        for (int i = 0; i < EnfermeroRepository.enfermeros.size(); i++) {
            if (EnfermeroRepository.enfermeros.get(i).getDni().equals(textoRecoger1)
                    & EnfermeroRepository.enfermeros.get(i).getPassword().equals(textoRecoger2)) {
                usuarioActivoEnfermero = EnfermeroRepository.enfermeros.get(i);
                usuarioValido = true;
            }
        }
        return usuarioValido;
    }

    public static void consultarListaDePacientes() {
        System.out.println("ID - NOMBRE - DNI - ENFERMERO ASIGNADO - MEDICO ASIGNADO");
        for (int i = 0; i < PacienteRepository.pacientes.size(); i++) {
            consultarPacientes(i);
        }
    }

    public static void asignarEnfermero() throws IOException {
        System.out.println("Seleccione el paciente: ");
        consultarListaDePacientes();
        String textoRecoger1 = buffer.readLine();
        int opcionPaciente = Integer.parseInt(textoRecoger1);
        Paciente pacienteSeleccionado = PacienteRepository.pacientes.get(opcionPaciente);
        System.out.println("Asigne el Enfermero: ");
        consultarListaDeEnfermeros();
        String textoRecoger2 = buffer.readLine();
        int opcionEnfermero = Integer.parseInt(textoRecoger2);
        Enfermero enfermeroSeleccionado = EnfermeroRepository.enfermeros.get(opcionEnfermero);
        EnfermeroRepository.asignaElEnfermero(pacienteSeleccionado, enfermeroSeleccionado);
    }

    public static void consultarListaDeEnfermeros() {
        System.out.println("ID - NOMBRE - DNI");
        for (int i = 0; i < EnfermeroRepository.enfermeros.size(); i++) {
            consultarEnfermeros(i);
        }
    }

    public static void modificarHistorialPaciente() throws IOException {
        System.out.println("Seleccione el paciente: ");
        consultarListaDePacientes();
        String textoRecoger1 = buffer.readLine();
        int opcionPaciente = Integer.parseInt(textoRecoger1);
        Paciente pacienteSeleccionado = PacienteRepository.pacientes.get(opcionPaciente);
        PacienteRepository.modificaHistorial(pacienteSeleccionado);
    }

    public static void registrarEnfermedad() throws IOException {
        System.out.println("Seleccione el paciente: ");
        consultarListaDePacientes();
        String textoRecoger1 = buffer.readLine();
        int opcionPaciente = Integer.parseInt(textoRecoger1);
        Paciente pacienteSeleccionado = PacienteRepository.pacientes.get(opcionPaciente);
        PacienteRepository.registroDeEnfermedad(pacienteSeleccionado);
    }
}
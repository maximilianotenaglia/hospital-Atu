package controller;

import Entities.Persona;
import Services.PacienteService;
import Services.PacienteServiceImpl;
import dto.PersonaDto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PacienteController {

    private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    private static PacienteService pacienteService = new PacienteServiceImpl();

    public static PersonaDto menuPaciente(int idPersona) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("MENU PACIENTE\n1- Consultar historial medico \n2- Salir ");
        String textoRecoger1 = buffer.readLine();
        int opcionMenuPaciente = Integer.parseInt(textoRecoger1);
        try {
            while (opcionMenuPaciente != 2) {
                switch (opcionMenuPaciente) {
                    case 1:
                        String HistorialMedico = pacienteService.consultarHistorialMedico(idPersona);
                        System.out.println(HistorialMedico);
                        opcionMenuPaciente = 2;
                        break;
                    case 2:
                        //    loggOut();
                        break;
                    default:
                        System.out.println("Opcion incorrecta, intente nuevamente");
                        menuPaciente(idPersona);
                        break;
                }
            }
        } catch (NumberFormatException es) {
            System.out.println("Opcion incorrecta, intente nuevamente");
            menuPaciente(idPersona);
        }
        return null;
    }

}

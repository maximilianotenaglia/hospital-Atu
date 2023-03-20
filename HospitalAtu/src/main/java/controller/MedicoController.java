package controller;

import dto.PersonaDto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MedicoController {
    private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static PersonaDto menuMedico(int idPersona) throws IOException {
        System.out.println("MENU MEDICO \n1- Asignar Enfermero al Paciente." +
                "\n2- Crear nuevo paciente (USUARIO).\n3- Modificar historial paciente." +
                "\n4- Tratar paciente.\n5- Recetar a un paciente." +
                "\n6- Asignar un medico por especialidad.\n7- Listado de pacientes." +
                "\n8- Registros de enfermedad.\n9- Dar el alta al Paciente\n0- <-- Volver");
        String textoRecoger1 = buffer.readLine();
        int opcion = Integer.parseInt(textoRecoger1);
        try {
            switch (opcion) {
                case 1:
                    //  asignarEnfermero();
                    //  menuEnfermero();
                    break;
                case 2:
                    //  crearNuevoPaciente();
                    //  menuEnfermero();
                    break;
                case 3:
                    //modificarHistorialPaciente();
                    //menuEnfermero();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    //consultarListaDePacientes();
                    //menuEnfermero();
                    break;
                case 8:
                    //registrarEnfermedad();
                    //menuEnfermero();
                    break;
                case 9:

                    break;

                case 0:
                    //Enfermero.loggOut();
                    break;
                default:
                    System.out.println("Elija una opcion correcta.");
                    menuMedico(idPersona);
                    break;
            }
        } catch (NumberFormatException ex) {
            System.out.println("Elija una opcion correcta.");
            menuMedico(idPersona);
        }
        return null;
    }

}

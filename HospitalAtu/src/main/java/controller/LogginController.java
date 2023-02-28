package controller;

import Services.EnfermeroService;
import Services.EnfermeroServiceImpl;
import dto.EnfermeroDto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Entities.Persona.Atributo.ENFERMERO;

public class LogginController {

    private EnfermeroController enfermeroController = new EnfermeroController();

    private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    // VER LA POSIBILIDAD DE REALIZAR UN CONTROLLER LOGGIN

    public static void menuInicial() throws IOException {

        System.out.println("MENU INICIAL \n1- Nuevo usuario\n2- Ingresar\n3- Salir del sistema.");
        String textoRecoger1 = buffer.readLine();
        int opcion = Integer.parseInt(textoRecoger1);
        try {
            switch (opcion) {
                case 1:
                    crearUsuario();
                    break;
                case 2:
                //    ingresar();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema.");
                //    salirDeSistema = true;
                    break;
                default:
                    System.out.println("Elija una opcion correcta.");
                    menuInicial();
                    break;
            }
        } catch (NumberFormatException ex) {
            System.out.println("Elija una opcion correcta.");
            menuInicial();
        }
    }

// VER LA POSIBILIDAD DE METER ESTE CODIGO EN UN CONTROLLER LOGGIN


    public void ingresar() throws IOException {
        System.out.println("INDIQUE COMO DESEA LOGUEARSE: \n1- Paciente\n2- Enfermero\n3- Medico \n4- <-- Volver .");
        String textoRecoger = buffer.readLine();
        int opcionAtributo = Integer.parseInt(textoRecoger);
        try {
            while (opcionAtributo != 4) {
                switch (opcionAtributo) {
                    case 1:
                    //    validaLogginPaciente();
                        opcionAtributo = 4;
                        break;
                    case 2:
                        EnfermeroController.validaLogginEnfermero();
                        opcionAtributo = 4;
                        break;
                    case 3:

                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Elija una opcion correcta.");
                        menuInicial();
                        break;
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Elija una opcion correcta.");
            ingresar();
        }
    }

    public static void crearUsuario() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ELIJA UNA OPCION \n1- Paciente\n2- Enfermero\n3- Medico \n4- <-- Volver .");
        String textoRecoger1 = buffer.readLine();
        int opcionAtributo = Integer.parseInt(textoRecoger1);
        try {
            while (opcionAtributo != 4) {
                switch (opcionAtributo) {
                    case 1:
                    //    crearNuevoPaciente();   // Debe crearse desde Repositoty, no aqui
                        opcionAtributo = 4;
                        break;
                    case 2:
                    //    crearNuevoEnfermero();  // Debe crearse desde Repositoty, no aqui
                        opcionAtributo = 4;
                        break;
                    case 3:
                    //    crearNuevoMedico();     // Debe crearse desde Repositoty, no aqui
                        opcionAtributo = 4;
                        break;
                    case 4:
                        opcionAtributo = 4;
                        break;
                    default:
                        System.out.println("Elija una opcion correcta.");
                        crearUsuario();
                        break;
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Elija una opcion correcta.");
            crearUsuario();
        }
    }
    // ESTO NO DEBE ESTAR ACA, VER SI SE CREA UN CONTROLLER DE LOGGIN




    public static void logginUsuario() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("INGRESAR COMO: \n1- Paciente\n2- Enfermero\n3- Medico \n4- <-- Volver .");
        String textoRecoger1 = buffer.readLine();
        int opcionAtributo = Integer.parseInt(textoRecoger1);
        try {
            while (opcionAtributo != 4) {
                switch (opcionAtributo) {
                    case 1:
                        //     listaDePacientes.add(crearNuevoPaciente());
                        opcionAtributo = 4;
                        break;
                    case 2:
                        //     listaDeEnfermeros.add(crearNuevoEnfermero());
                        opcionAtributo = 4;
                        break;
                    case 3:

                        opcionAtributo = 4;
                        break;
                    case 4:
                        opcionAtributo = 4;
                        break;
                    default:
                        System.out.println("Elija una opcion correcta.");
                        crearUsuario();
                        break;
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Elija una opcion correcta.");
            crearUsuario();
        }}
}

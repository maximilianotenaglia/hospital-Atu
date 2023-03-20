package controller;

import Entities.Persona;
import Services.EnfermeroService;
import Services.EnfermeroServiceImpl;
import Services.PersonaService;
import Services.PersonaServiceImpl;
import dto.EnfermeroDto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Entities.Persona.Atributo.*;

public class LogginController {
    public static int opcionMenuInicial;

    private EnfermeroController enfermeroController = new EnfermeroController();
    private PersonaController personaController = new PersonaController();
    private PersonaService personaService = new PersonaServiceImpl();
    private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public void menuInicial() throws IOException {
        System.out.println("MENU INICIAL \n1- Nuevo usuario\n2- Ingresar\n3- Salir del sistema.");
        String textoRecoger1 = buffer.readLine();
        opcionMenuInicial = Integer.parseInt(textoRecoger1);
        try {
            switch (opcionMenuInicial) {
                case 1:
                    personaController.crearPersona();
                    break;
                case 2:
                    ingresar();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema.");
                    salirDelSistema(opcionMenuInicial);
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

    public void ingresar() throws IOException {
        System.out.println("ELIJA UNA OPCION \n1- PACIENTE\n2- ENFERMERO\n3- MEDICO");
        String textoRecoger1 = buffer.readLine();
        int opcionAtributo = Integer.parseInt(textoRecoger1);
        Persona.Atributo atributo = PACIENTE;
        try {
            switch (opcionAtributo) {
                case 1:
                    atributo = PACIENTE;
                    break;
                case 2:
                    atributo = ENFERMERO;
                    break;
                case 3:
                    atributo = MEDICO;
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

        System.out.println("INDIQUE USUARIO: ");
        String usuario = buffer.readLine();
        System.out.println("INDIQUE PASSWORD: ");
        String password = buffer.readLine();
        personaService.logginUsuario(atributo, usuario, password);
    }

    public boolean salirDelSistema(int opcion) {
        if (opcion == 3) {
            boolean salirDelSistema = true;

            return salirDelSistema;
        }return false;
    }
}

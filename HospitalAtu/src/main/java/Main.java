import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Entities.Enfermero.validaLogginEnfermero;
import static Entities.Paciente.validaLogginPaciente;
import static Entities.Persona.crearUsuario;

/*
Hospital
El ejercicio consiste en crear el sistema informatico de un hospital.

caracteristicas: / 1000 habitaciones (individuales). / 300 camillas. / 50 medicos y 200 enfermer@s.
Sala de espera de hasta 50 personas.

funcionalidades de usuarios:
Pacientes
Acceder a su historial medico

Enfermer@s
Dar de alta un paciente
Modificar historial paciente
Tratar paciente
Recetar a un paciente
Asignar un medico por especialidad
consultar pacientes
Registrar enfermedad

Medico
Operar
Tratar un paciente
Recetar
Dar de alta
consultar pacientes
asignar enfermer@s
Registrar enfermedad

Otras funciones:
Los pacientes tendran diferentes niveles de urgencia
Los pacientes pueden tener diferentes enfermedades (repartidas por especialidad)
Los pacientes seran asignados segun especialidad
Los pacientes se generaran automaticamente y manualmente.
Podran ocurrir desastres que generen entre 100 y 3000 pacientes.
Cada enfermedad requiere especialistas y tiempos diferentes.
Los pacientes solo se podran tratar cada X tiempo segun su enfermedad.
Se iran explicando y añadiendo funcionalidades, no os preocupes, os dare mas herramientas para poder realizar la implementacion de este ejercicio
y podreis consultar conmigo las dudas que tengais en cualquier momento.
 */
public class Main {
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static boolean salirDeSistema = false;

    public static void main(String[] args) throws IOException {
        try {
            while (salirDeSistema == false) {
                menuInicial();
            }
        } catch (NumberFormatException ex) {
            System.out.println("Elija una opcion correcta.");
            menuInicial();
        }
    }

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
                    ingresar();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema.");
                    salirDeSistema = true;
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

    public static void ingresar() throws IOException {
        System.out.println("INDIQUE COMO DESEA LOGUEARSE: \n1- Paciente\n2- Enfermero\n3- Medico \n4- <-- Volver .");
        String textoRecoger = buffer.readLine();
        int opcionAtributo = Integer.parseInt(textoRecoger);
        try {
            while (opcionAtributo != 4) {
                switch (opcionAtributo) {
                    case 1:
                        validaLogginPaciente();
                        opcionAtributo = 4;
                        break;
                    case 2:
                        validaLogginEnfermero();
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
}
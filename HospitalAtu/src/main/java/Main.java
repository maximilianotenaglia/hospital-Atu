import controller.LogginController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static controller.LogginController.opcionMenuInicial;

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
    private static LogginController logginController = new LogginController();

    public static void main(String[] args) throws IOException {
        try {
            while (salirDeSistema == false) {
                logginController.menuInicial();
                salirDeSistema = logginController.salirDelSistema(opcionMenuInicial);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Elija una opcion correcta.");
            logginController.menuInicial();
        }
    }
}
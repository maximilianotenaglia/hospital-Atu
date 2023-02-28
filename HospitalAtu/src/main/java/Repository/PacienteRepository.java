package Repository;

import Entities.Paciente;
import Services.EnfermeroServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static Entities.Paciente.NivelUrgencia.*;

public class PacienteRepository {
    // Lista de pacientes debe ser PRIVADA
    // al agregar un paciente en la lista, se le agregara un ID que debe ser unico.
    public static List<Paciente> pacientes = new ArrayList<>();

    public Paciente crearPaciente(Paciente obj1) {
        pacientes.add(obj1);
        return obj1;
    }

    /*
    public static void consultarPacientes(int val1) {
        System.out.println(pacientes.get(val1).getId() + " - " + pacientes.get(val1).getNombre() + " - " + pacientes.get(val1).getDni() +
                " - " + pacientes.get(val1).getEnfermeroAsignado());

    }

    public static void modificaHistorial(Paciente paciente1) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("HISTORIAL MEDICO");
        String historialModificado = buffer.readLine();
        Paciente.historialMedico.add(historialModificado);
    }

    public static void registroDeEnfermedad(Paciente paciente1) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Defina nivel de urgencia \n1- Bajo\n2- Medio\n3- Alto");
        String textoRecoger2 = buffer.readLine();
        int opcionUrgencia = Integer.parseInt(textoRecoger2);
        Enum urgenciaEnfermedad = BAJO;
        try {
            switch (opcionUrgencia) {
                case 1:
                    urgenciaEnfermedad = BAJO;
                    break;
                case 2:
                    urgenciaEnfermedad = MEDIO;
                    break;
                case 3:
                    urgenciaEnfermedad = ALTO;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    registroDeEnfermedad(paciente1);
                    break;
            }
        } catch (NumberFormatException exception) {
            System.out.println("Opcion incorrecta");
            registroDeEnfermedad(paciente1);
        }
        System.out.println("REGISTRO DE ENFERNEDAD");
        String enfermedadRegistrada = buffer.readLine();
        pacientes.get(paciente1.getId()).registroEnfermedad.add("Nivel Urgencia: " + urgenciaEnfermedad + " Enfermedad " + enfermedadRegistrada);
        Paciente.historialMedico.add("El Enfermero " + EnfermeroServiceImpl.usuarioActivoEnfermero.getNombre()
                + " ha diagnosticado la enfermedad " + enfermedadRegistrada);
    }

    public static void consultarEnfermedad(Paciente paciente1) {
        for (int i=0; i<paciente1.registroEnfermedad.size();i++){
            System.out.print(i + " --> ");
            System.out.println(paciente1.registroEnfermedad.get(i));
        }
    }

    public static void borrarRegistroDeEnfermedad(Paciente paciente1) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<paciente1.registroEnfermedad.size();i++){
            System.out.print(i + " --> ");
            System.out.println(paciente1.registroEnfermedad.get(i));
        }
        System.out.println("Seleccione el registro que desea borrar");
        String textoRecoger1 = buffer.readLine();
        int opcionBorrar = Integer.parseInt(textoRecoger1);
        Paciente.historialMedico.add("El Enfermero " + EnfermeroServiceImpl.usuarioActivoEnfermero.getNombre()
                + " confirma que el paciente ya no padece de  " + paciente1.registroEnfermedad.get(opcionBorrar));
        paciente1.getRegistroEnfermedad().remove(opcionBorrar);
    }

     */
}
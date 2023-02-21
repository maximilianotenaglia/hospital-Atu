package Entities;

import Services.PacienteServices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static Entities.Enfermero.buffer;
import static Services.PacienteServices.*;


public class Paciente extends Persona {
    int id = 0;
    static String usuarioActivo;
    boolean altaMedica;
    public static List<String> historialMedico = new ArrayList<>();
    List<String> recetas = new ArrayList<>();
    List<String> enfermeroAsignado = new ArrayList<>();
    HashMap<Enum, String> medicosPorEspecialidad = new HashMap<>();
    public static HashMap<Enum, String> registroEnfermedad = new HashMap<>(); // se utilizara para poder asignar la urgencia y la enfermedad

    public static enum NivelUrgencia {
        BAJO, MEDIO, ALTO;
    }

    public Paciente(Atributo atributoPersona, String nombre, String dni, String direccion, int nroPuerta, int cp, int telefono, String email, String password, boolean altaMedica, int id) {
        super(atributoPersona, nombre, dni, direccion, nroPuerta, cp, telefono, email, password);
        this.altaMedica = altaMedica;
        this.id = id;
    }

    public HashMap<Enum, String> getRegistroEnfermedad() {
        return registroEnfermedad;
    }

    public void setRegistroEnfermedad(HashMap<Enum, String> registroEnfermedad) {
        this.registroEnfermedad = registroEnfermedad;
    }

    public List<String> getEnfermeroAsignado() {
        return enfermeroAsignado;
    }

    public void setEnfermeroAsignado(List<String> enfermeroAsignado) {
        this.enfermeroAsignado = enfermeroAsignado;
    }

    public boolean isAltaMedica() {
        return altaMedica;
    }

    public void setAltaMedica(boolean altaMedica) {
        this.altaMedica = altaMedica;
    }


    public static List<String> getHistorialMedico(int i) {
        return Collections.singletonList(historialMedico.get(i));
    }

    public static void setHistorialMedico(List<String> historialMedico) {
        Paciente.historialMedico = historialMedico;
    }

    public List<String> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<String> recetas) {
        this.recetas = recetas;
    }

    public HashMap<Enum, String> getMedicosPorEspecialidad() {
        return medicosPorEspecialidad;
    }

    public void setMedicosPorEspecialidad(HashMap<Enum, String> medicosPorEspecialidad) {
        this.medicosPorEspecialidad = medicosPorEspecialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public static void menuPaciente() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("MENU PACIENTE\n1- Consultar historial medico \n2- Salir ");
        String textoRecoger1 = buffer.readLine();
        int opcionMenuPaciente = Integer.parseInt(textoRecoger1);
        try {
            while (opcionMenuPaciente != 2) {
                switch (opcionMenuPaciente) {
                    case 1:
                        consultarHistorialMedico();
                        opcionMenuPaciente = 2;
                        break;
                    case 2:
                        loggOut();
                        break;
                    default:
                        System.out.println("Opcion incorrecta, intente nuevamente");
                        menuPaciente();
                        break;
                }
            }
        } catch (NumberFormatException es) {
            System.out.println("Opcion incorrecta, intente nuevamente");
            menuPaciente();
        }
    }

    public static void validaLogginPaciente() throws IOException {
        int intentos = 0;
            System.out.println("Usuario: ");
            String textoRecoger1 = buffer.readLine();
            System.out.println("Password: ");
            String textoRecoger2 = buffer.readLine();
            if (PacienteServices.validarUsuario(textoRecoger1, textoRecoger2) == true) {
                //usuarioActivo = textoRecoger1;
                menuPaciente();
            } else {
                System.out.println("Usuario y/o contraseña incorrectos");
        }
        Paciente.loggOut();
    }

    public static void loggOut() throws IOException {
        usuarioActivoPaciente = null;
    }
}

package Entities;

import Services.PacienteServices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import static Services.PacienteServices.*;


public class Paciente {

    Persona persona;
    int id = 0;
    static String usuarioActivo;
    boolean altaMedica;
    public static List<String> historialMedico = new ArrayList<>();
    List<String> recetas = new ArrayList<>();
    List<String> enfermeroAsignado = new ArrayList<>();
    HashMap<Enum, String> medicosPorEspecialidad = new HashMap<>();
    public static List<String> registroEnfermedad = new ArrayList<>();

    public static enum NivelUrgencia {
        BAJO, MEDIO, ALTO;
    }

    public Paciente(Persona persona, int id, boolean altaMedica, List<String> recetas, List<String> enfermeroAsignado, HashMap<Enum, String> medicosPorEspecialidad) {
        this.persona = persona;
        this.id = id;
        this.altaMedica = altaMedica;
        this.recetas = recetas;
        this.enfermeroAsignado = enfermeroAsignado;
        this.medicosPorEspecialidad = medicosPorEspecialidad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getUsuarioActivo() {
        return usuarioActivo;
    }

    public static void setUsuarioActivo(String usuarioActivo) {
        Paciente.usuarioActivo = usuarioActivo;
    }

    public boolean isAltaMedica() {
        return altaMedica;
    }

    public void setAltaMedica(boolean altaMedica) {
        this.altaMedica = altaMedica;
    }

    public static List<String> getHistorialMedico() {
        return historialMedico;
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

    public List<String> getEnfermeroAsignado() {
        return enfermeroAsignado;
    }

    public void setEnfermeroAsignado(List<String> enfermeroAsignado) {
        this.enfermeroAsignado = enfermeroAsignado;
    }

    public HashMap<Enum, String> getMedicosPorEspecialidad() {
        return medicosPorEspecialidad;
    }

    public void setMedicosPorEspecialidad(HashMap<Enum, String> medicosPorEspecialidad) {
        this.medicosPorEspecialidad = medicosPorEspecialidad;
    }

    public static List<String> getRegistroEnfermedad() {
        return registroEnfermedad;
    }

    public static void setRegistroEnfermedad(List<String> registroEnfermedad) {
        Paciente.registroEnfermedad = registroEnfermedad;
    }
/*
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

 */
}

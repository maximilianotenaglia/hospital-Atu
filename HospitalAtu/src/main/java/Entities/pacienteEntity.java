package Entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static Services.pacienteServices.consultarHistorialMedico;


public class pacienteEntity extends persona {
    boolean altaMedica;
    HashMap<Date, String> historialMedico = new HashMap<>();
    List<String> recetas = new ArrayList<>();
    HashMap<Enum, String> medicosPorEspecialidad = new HashMap<>();
    List<String> registroEnfermedad = new ArrayList<>();

    public pacienteEntity(Atributo atributoPersona, String nombre, String dni, String direccion, int nroPuerta, int cp, int telefono, String email, String password, boolean altaMedica, HashMap<Date, String> historialMedico, List<String> recetas, HashMap<Enum, String> medicosPorEspecialidad, List<String> registroEnfermedad) {
        super(atributoPersona, nombre, dni, direccion, nroPuerta, cp, telefono, email, password);
        this.altaMedica = altaMedica;
        this.historialMedico = historialMedico;
        this.recetas = recetas;
        this.medicosPorEspecialidad = medicosPorEspecialidad;
        this.registroEnfermedad = registroEnfermedad;
    }

    public boolean isAltaMedica() {
        return altaMedica;
    }

    public void setAltaMedica(boolean altaMedica) {
        this.altaMedica = altaMedica;
    }

    public HashMap<Date, String> getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HashMap<Date, String> historialMedico) {
        this.historialMedico = historialMedico;
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

    public List<String> getRegistroEnfermedad() {
        return registroEnfermedad;
    }

    public void setRegistroEnfermedad(List<String> registroEnfermedad) {
        this.registroEnfermedad = registroEnfermedad;
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
                        break;
                    case 2:
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
}

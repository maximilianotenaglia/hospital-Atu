package Entities;

import Services.EnfermeroServices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static Services.EnfermeroServices.*;
import static Services.PacienteServices.crearNuevoPaciente;


public class Enfermero extends Persona {
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    int idEnfermero;
    boolean alta;
    List<String> pacientesAsignadosAlEnfermero = new ArrayList<>();

    public Enfermero(Atributo atributoPersona, String nombre, String dni, String direccion, int nroPuerta, int cp, int telefono, String email, String password, int idEnfermero, boolean alta) {
        super(atributoPersona, nombre, dni, direccion, nroPuerta, cp, telefono, email, password);
        this.idEnfermero = idEnfermero;
        this.alta = alta;
    }

    public int getIdEnfermero() {
        return idEnfermero;
    }

    public void setIdEnfermero(int idEnfermero) {
        this.idEnfermero = idEnfermero;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public List<String> getPacientesAsignadosAlEnfermero() {
        return pacientesAsignadosAlEnfermero;
    }

    public void setPacientesAsignadosAlEnfermero(List<String> pacientesAsignadosAlEnfermero) {
        this.pacientesAsignadosAlEnfermero = pacientesAsignadosAlEnfermero;
    }

    public static void menuEnfermero() throws IOException {
        System.out.println("MENU ENFERMERO \n1- Asignar Enfermero al Paciente." +
                "\n2- Crear nuevo paciente (USUARIO).\n3- Modificar historial paciente." +
                "\n4- Tratar paciente.\n5- Recetar a un paciente." +
                "\n6- Asignar un medico por especialidad.\n7- Listado de pacientes." +
                "\n8- Registros de enfermedad.\n9- Dar el alta al Paciente\n0- <-- Volver");
        String textoRecoger1 = buffer.readLine();
        int opcion = Integer.parseInt(textoRecoger1);
        try {
            switch (opcion) {
                case 1:
                    asignarEnfermero();
                    menuEnfermero();
                    break;
                case 2:
                    crearNuevoPaciente();
                    menuEnfermero();
                    break;
                case 3:
                    modificarHistorialPaciente();
                    menuEnfermero();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    consultarListaDePacientes();
                    menuEnfermero();
                    break;
                case 8:
                    registrarEnfermedad();
                    menuEnfermero();
                    break;
                case 9:

                    break;

                case 0:
                    Enfermero.loggOut();
                    break;
                default:
                    System.out.println("Elija una opcion correcta.");
                    menuEnfermero();
                    break;
            }
        } catch (NumberFormatException ex) {
            System.out.println("Elija una opcion correcta.");
            menuEnfermero();
        }
    }

    public static void validaLogginEnfermero() throws IOException {
        System.out.println("Usuario: ");
        String textoRecoger1 = buffer.readLine();
        System.out.println("Password: ");
        String textoRecoger2 = buffer.readLine();
        if (EnfermeroServices.validarUsuario(textoRecoger1, textoRecoger2) == true) {
                        menuEnfermero();
            Enfermero.loggOut();
        } else {
            System.out.println("Usuario y/o contraseña incorrectos");
        }

        Enfermero.loggOut();
    }

    public static void loggOut() throws IOException {
        EnfermeroServices.usuarioActivoEnfermero = null;
    }
}
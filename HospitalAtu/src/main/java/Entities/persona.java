package Entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class persona {

    Atributo atributoPersona;
    String nombre;
    String dni;
    String direccion;
    int NroPuerta;
    int cp;
    int telefono;
    String email;
    String password;

    public persona(Atributo atributoPersona, String nombre, String dni, String direccion, int nroPuerta, int cp, int telefono, String email, String password) {
        this.atributoPersona = atributoPersona;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        NroPuerta = nroPuerta;
        this.cp = cp;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
    }

    public Atributo getAtributoPersona() {
        return atributoPersona;
    }

    public void setAtributoPersona(Atributo atributoPersona) {
        this.atributoPersona = atributoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNroPuerta() {
        return NroPuerta;
    }

    public void setNroPuerta(int nroPuerta) {
        NroPuerta = nroPuerta;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    enum Atributo {
        MEDICO, ENFERMERO, PACIENTE
    }

    public static void crearUsuario() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ELIJA UNA OPCION \n1- Paciente\n2- Enfermero\n3- Medico \n4- Salir del sistema.");
        String textoRecoger1 = buffer.readLine();
        int opcionAtributo = Integer.parseInt(textoRecoger1);
        try {
            while (opcionAtributo != 4) {
                switch (opcionAtributo) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:


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
}
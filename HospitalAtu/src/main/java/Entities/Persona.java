package Entities;

public class Persona {

    Atributo atributoPersona;
    String nombre;
    String dni;
    String direccion;
    int nroPuerta;
    int cp;
    int telefono;
    String email;
    String password;

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
        return nroPuerta;
    }

    public void setNroPuerta(int nroPuerta) {
        this.nroPuerta = nroPuerta;
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

    public Persona(Atributo atributoPersona, String nombre,
                   String dni, String direccion,
                   int nroPuerta, int cp, int telefono,
                   String email, String password) {
        this.atributoPersona = atributoPersona;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.nroPuerta = nroPuerta;
        this.cp = cp;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
    }

    public enum Atributo {
        MEDICO, ENFERMERO, PACIENTE
    }
}

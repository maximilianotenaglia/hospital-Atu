package Entities;

public class Paciente {

    private Persona persona;
    private int personaId;

    private int id = 0;
    private static String usuarioActivo;
    private boolean altaMedica;
    private String historialMedico;
    private String recetas;
    private Enfermero enfermeroAsignado;
    private Medico medicosPorEspecialidad;
    public static enum NivelUrgencia {
        BAJO, MEDIO, ALTO;
    }

    public Paciente(Persona persona, int personaId, int id, boolean altaMedica, String historialMedico, String recetas, Enfermero enfermeroAsignado, Medico medicosPorEspecialidad) {
        this.persona = persona;
        this.personaId = personaId;
        this.id = id;
        this.altaMedica = altaMedica;
        this.historialMedico = historialMedico;
        this.recetas = recetas;
        this.enfermeroAsignado = enfermeroAsignado;
        this.medicosPorEspecialidad = medicosPorEspecialidad;
    }
    public Paciente(int personaId, int id) {
        this.personaId = personaId;
        this.id = id;
    }

    public Paciente(int personaId, String historialMedico ) {
        this.personaId = personaId;
        this.historialMedico = historialMedico;
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
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

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public String getRecetas() {
        return recetas;
    }

    public void setRecetas(String recetas) {
        this.recetas = recetas;
    }

    public Enfermero getEnfermeroAsignado() {
        return enfermeroAsignado;
    }

    public void setEnfermeroAsignado(Enfermero enfermeroAsignado) {
        this.enfermeroAsignado = enfermeroAsignado;
    }

    public Medico getMedicosPorEspecialidad() {
        return medicosPorEspecialidad;
    }

    public void setMedicosPorEspecialidad(Medico medicosPorEspecialidad) {
        this.medicosPorEspecialidad = medicosPorEspecialidad;
    }
/*
    public static void validaLogginPaciente() throws IOException {
        int intentos = 0;
            System.out.println("Usuario: ");
            String textoRecoger1 = buffer.readLine();
            System.out.println("Password: ");
            String textoRecoger2 = buffer.readLine();
            if (PacienteServiceImpl.validarUsuario(textoRecoger1, textoRecoger2) == true) {
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

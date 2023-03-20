package Entities;

public class Medico  {
    private int personaId;
    private int id;
    String especialidadMedica;

    public Medico(int personaId, int id) {
        this.personaId = personaId;
        this.id = id;

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

    public String getEspecialidadMedica() {
        return especialidadMedica;
    }

    public void setEspecialidadMedica(String especialidadMedica) {
        this.especialidadMedica = especialidadMedica;
    }
}
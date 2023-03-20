package dto;

public class PacienteDto {
    private PersonaDto persona;

    private int id = 0;

    public PacienteDto(PersonaDto persona, int id) {
        this.persona = persona;
        this.id = id;
    }
    public PacienteDto(PersonaDto persona) {
        this.persona = persona;
    }



    public PersonaDto getPersona() {
        return persona;
    }

    public void setPersona(PersonaDto persona) {
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PacienteDto{" +
                "persona=" + persona +
                ", id=" + id +
                '}';
    }
}

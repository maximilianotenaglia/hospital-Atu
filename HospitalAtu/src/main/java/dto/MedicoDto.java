package dto;

public class MedicoDto {
    private int id;
    private PersonaDto persona;

    public MedicoDto(int id, PersonaDto persona) {
        this.id = id;
        this.persona = persona;
    }

    public MedicoDto(PersonaDto persona) {
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonaDto getPersona() {
        return persona;
    }

    public void setPersona(PersonaDto persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "MedicoDto{" +
                "id=" + id +
                ", persona=" + persona +
                '}';
    }
}

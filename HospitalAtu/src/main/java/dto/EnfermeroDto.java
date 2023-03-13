package dto;

public class EnfermeroDto {

    private int id;

    private PersonaDto persona;

    public EnfermeroDto(int id, PersonaDto persona) {
        this.id = id;
        this.persona = persona;
    }

    public EnfermeroDto(PersonaDto persona) {
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
        return "EnfermeroDto{" +
                "id=" + id +
                ", persona=" + persona +
                '}';
    }
}
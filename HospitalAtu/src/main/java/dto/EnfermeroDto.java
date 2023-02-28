package dto;

import java.util.ArrayList;
import java.util.List;

public class EnfermeroDto {

    private int id;
    private boolean alta;
    private PersonaDto persona;

    public EnfermeroDto() {
    }

    public EnfermeroDto(int id, boolean alta, PersonaDto persona) {
        this.id = id;
        this.alta = alta;
        this.persona = persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public PersonaDto getPersona() {
        return persona;
    }

    public void setPersona(PersonaDto persona) {
        this.persona = persona;
    }
}

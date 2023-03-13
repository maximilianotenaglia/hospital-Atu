package Entities;

import java.util.ArrayList;
import java.util.List;


public class Enfermero {

    private int personaId;
    private int id;

    private List<String> pacientesAsignadosAlEnfermero = new ArrayList<>();

    public Enfermero(int personaId, int id)
                      {
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


    public List<String> getPacientesAsignadosAlEnfermero() {
        return pacientesAsignadosAlEnfermero;
    }

    public void setPacientesAsignadosAlEnfermero(List<String> pacientesAsignadosAlEnfermero) {
        this.pacientesAsignadosAlEnfermero = pacientesAsignadosAlEnfermero;
    }
}
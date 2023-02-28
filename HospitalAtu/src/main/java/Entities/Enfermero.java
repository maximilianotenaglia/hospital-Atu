package Entities;

import java.util.ArrayList;
import java.util.List;


public class Enfermero {

    private int personaId;
    private int id;
    private boolean alta;
    private List<String> pacientesAsignadosAlEnfermero = new ArrayList<>();

    public Enfermero(int personaId, int id, boolean alta)
                      {
        this.personaId = personaId;
        this.id = id;
        this.alta = alta;

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
}
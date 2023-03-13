package Entities;

import java.util.ArrayList;
import java.util.List;

public class Medico  {
    int idMedico;
    Especialidad especialidadMedica;
    List<Object> pacientesAsignadosAlMedico = new ArrayList<>();

    boolean alta;

    public Medico(int idMedico, Especialidad especialidadMedica, List<Object> pacientesAsignadosAlMedico, boolean alta) {
        this.idMedico = idMedico;
        this.especialidadMedica = especialidadMedica;
        this.pacientesAsignadosAlMedico = pacientesAsignadosAlMedico;
        this.alta = alta;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public Especialidad getEspecialidadMedica() {
        return especialidadMedica;
    }

    public void setEspecialidadMedica(Especialidad especialidadMedica) {
        this.especialidadMedica = especialidadMedica;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public enum Especialidad {
        MEDICODEFAMILIA, PEDIATRIA, ONCOLOGIA, DERMATOLOGIA, GINECOLOGIA
    }

}
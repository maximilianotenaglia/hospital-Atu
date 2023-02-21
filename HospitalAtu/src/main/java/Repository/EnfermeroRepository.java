package Repository;

import Entities.Enfermero;
import Entities.Paciente;

import java.util.ArrayList;
import java.util.List;

public class EnfermeroRepository {
    public static List<Enfermero> enfermeros = new ArrayList<>();

    public Enfermero crearEnfermero(Enfermero obj1) {
        enfermeros.add(obj1);
        return obj1;
    }

    public static void consultarEnfermeros(int val1) {
        System.out.println(enfermeros.get(val1).getIdEnfermero() + " - " + enfermeros.get(val1).getNombre() + " - " + enfermeros.get(val1).getDni());
    }

    public static void asignaElEnfermero(Paciente val1, Enfermero val2) {
        PacienteRepository.pacientes.get(val1.getId()).getEnfermeroAsignado().add(val2.getNombre());
        EnfermeroRepository.enfermeros.get(val2.getIdEnfermero()).getPacientesAsignadosAlEnfermero().add(val1.getNombre());

    }
}
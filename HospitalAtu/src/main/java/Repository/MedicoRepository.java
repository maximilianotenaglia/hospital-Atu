package Repository;

import Entities.Medico;
import java.util.ArrayList;
import java.util.List;

public class MedicoRepository {
    private static List<Medico> medicos = new ArrayList<>();

    public Medico crearMedico(Medico obj1){
        medicos.add(obj1);
        return obj1;
    }
}

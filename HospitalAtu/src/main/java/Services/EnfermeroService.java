package Services;

import dto.EnfermeroDto;

public interface EnfermeroService {
    EnfermeroDto crearEnfermero(EnfermeroDto nuevoEnfermero);

    String modificarHistorialPaciente(int id);

   // EnfermeroDto validaLogginEnfermero(EnfermeroDto nuevoEnfermero);

}

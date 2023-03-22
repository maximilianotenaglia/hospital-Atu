package Services;
import dto.PacienteDto;
import dto.PersonaDto;

public interface PacienteService {
    PacienteDto crearPaciente(PacienteDto nuevoPaciente);
    String consultarHistorialMedico(int id);
}

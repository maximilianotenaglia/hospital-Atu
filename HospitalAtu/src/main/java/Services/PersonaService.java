package Services;

import Entities.Persona;
import dto.MedicoDto;
import dto.PersonaDto;

import java.io.IOException;

public interface PersonaService {
    PersonaDto crearPersona(PersonaDto nuevaPersonaDto);

    PersonaDto getPersonaById(int id);
    PersonaDto ListarPacientes();

    PersonaDto logginUsuario (Persona.Atributo atributo, String dni, String password) throws IOException;


}

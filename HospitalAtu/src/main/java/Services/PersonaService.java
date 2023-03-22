package Services;

import Entities.Persona;
import dto.PersonaDto;

import java.io.IOException;

public interface PersonaService {
    PersonaDto crearPersona(PersonaDto nuevaPersonaDto);

    PersonaDto getPersonaById(int id);

    PersonaDto logginUsuario (Persona.Atributo atributo, String dni, String password) throws IOException;


}

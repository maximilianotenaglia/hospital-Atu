package Services;

import dto.PersonaDto;

public interface PersonaService {
    PersonaDto crearPersona(PersonaDto nuevaPersonaDto);
    PersonaDto getPersonaById (int id);
}

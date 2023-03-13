package Services;

import Entities.Persona;
import Repository.EnfermeroRepository;
import Repository.PersonaRepository;
import dto.PersonaDto;

public class PersonaServiceImpl implements PersonaService {
    private PersonaRepository repository = new PersonaRepository();

    @Override
    public PersonaDto crearPersona(PersonaDto nuevaPersonaDto) {
        Persona persona = repository.save(dtoToEntity(nuevaPersonaDto));
        return entityToDto(persona);
    }

    @Override
    public PersonaDto getPersonaById(int id) {
        //implementar esta parte de la funcion, para que me lea los valores de la tabla personas
        Persona persona = repository.findById(id);
        return entityToDto(persona);

    }

    private Persona dtoToEntity(PersonaDto personaDto) {
        return new Persona(
                personaDto.getId(),
                personaDto.getAtributoPersona(),
                personaDto.getNombre(),
                personaDto.getDni(),
                personaDto.getDireccion(),
                personaDto.getNroPuerta(),
                personaDto.getCp(),
                personaDto.getTelefono(),
                personaDto.getEmail(),
                personaDto.getPassword()
        );
    }

    private PersonaDto entityToDto(Persona persona) {
        return new PersonaDto(
                persona.getId(),
                persona.getAtributoPersona(),
                persona.getNombre(),
                persona.getDni(),
                persona.getDireccion(),
                persona.getNroPuerta(),
                persona.getCp(),
                persona.getTelefono(),
                persona.getEmail(),
                persona.getPassword()
        );
    }
}

package Services;

import Entities.Paciente;
import Entities.Persona;
import Repository.PersonaRepository;
import controller.EnfermeroController;
import controller.MedicoController;
import controller.PacienteController;
import dto.PersonaDto;

import java.io.IOException;

import static Entities.Persona.Atributo.*;

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

    @Override
    public PersonaDto logginUsuario(Persona.Atributo atributo, String dni, String password) throws IOException {
        Persona persona = repository.logginUsuario(atributo, dni, password);

        if (persona != null) {
            if (persona.getAtributoPersona() == PACIENTE) {
                return PacienteController.menuPaciente(persona.getId());
            } else if (persona.getAtributoPersona() == ENFERMERO) {
                return EnfermeroController.menuEnfermero(persona.getId());
            } else if (persona.getAtributoPersona() == MEDICO) {
                return MedicoController.menuMedico (persona.getId());
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
        return null;

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

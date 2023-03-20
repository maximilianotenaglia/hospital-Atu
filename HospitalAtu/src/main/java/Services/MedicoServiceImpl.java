package Services;

import Entities.Enfermero;
import Entities.Medico;
import Repository.EnfermeroRepository;
import Repository.MedicoRepository;
import dto.EnfermeroDto;
import dto.MedicoDto;

public class MedicoServiceImpl implements MedicoService {

    private MedicoRepository repository = new MedicoRepository();
    private PersonaService personaService = new PersonaServiceImpl();

    @Override
    public MedicoDto crearMedico(MedicoDto nuevoMedico) {
        Medico medico = repository.save(dtoToEntiy(nuevoMedico));
        return entityToDto(medico);
    }

    private Medico dtoToEntiy(MedicoDto medicoDto) {

        return new Medico(
                medicoDto.getPersona().getId(),
                medicoDto.getId()
        );
    }

    private MedicoDto entityToDto(Medico medico) {
        return new MedicoDto(
                medico.getId(),
                personaService.getPersonaById(medico.getPersonaId())
        );
    }

}

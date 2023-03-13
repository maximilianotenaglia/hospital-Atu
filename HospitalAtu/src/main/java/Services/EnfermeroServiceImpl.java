package Services;

import Entities.Enfermero;
import Repository.EnfermeroRepository;
import dto.EnfermeroDto;

public class EnfermeroServiceImpl implements EnfermeroService {
    // comunicacion con el repository
    private EnfermeroRepository repository = new EnfermeroRepository();
    private PersonaService personaService = new PersonaServiceImpl();

    public static Enfermero usuarioActivoEnfermero;

    @Override
    public EnfermeroDto crearEnfermero(EnfermeroDto nuevoEnfermero) {
        Enfermero enfermero = repository.save(dtoToEntiy(nuevoEnfermero));
        return entityToDto(enfermero);
    }


    private Enfermero dtoToEntiy(EnfermeroDto enfermeroDto) {

        return new Enfermero(
                enfermeroDto.getPersona().getId(),
                enfermeroDto.getId());
    }

    private EnfermeroDto entityToDto(Enfermero enfermero) {
        return new EnfermeroDto(
                enfermero.getId(),
                personaService.getPersonaById(enfermero.getPersonaId())
        );
    }
}

/*
    @Override
    public EnfermeroDto validaLogginEnfermero(EnfermeroDto nuevoEnfermero) {
        repository.validaLogginEnfermero
        return null;
    }


 */

/*

    public static void validarUsuario(String textoRecoger1, String textoRecoger2) {
        boolean usuarioValido = false;
        for (int i = 0; i < EnfermeroRepository.enfermeros.size(); i++) {
            if (EnfermeroRepository.enfermeros.get(i).getDni().equals(textoRecoger1)
                    & EnfermeroRepository.enfermeros.get(i).getPassword().equals(textoRecoger2)) {
                usuarioActivoEnfermero = EnfermeroRepository.enfermeros.get(i);
                usuarioValido = true;
            }
        }
        return usuarioValido;
    }

*/
















   /*
    public static void consultarListaDePacientes() {
        System.out.println("ID - NOMBRE - DNI - ENFERMERO ASIGNADO - MEDICO ASIGNADO");
        for (int i = 0; i < PacienteRepository.pacientes.size(); i++) {
            consultarPacientes(i);
        }
    }

    public static void asignarEnfermero() throws IOException {
        System.out.println("Seleccione el paciente: ");
        consultarListaDePacientes();
        String textoRecoger1 = buffer.readLine();
        int opcionPaciente = Integer.parseInt(textoRecoger1);
        Paciente pacienteSeleccionado = PacienteRepository.pacientes.get(opcionPaciente);
        System.out.println("Asigne el Enfermero: ");
        consultarListaDeEnfermeros();
        String textoRecoger2 = buffer.readLine();
        int opcionEnfermero = Integer.parseInt(textoRecoger2);
        Enfermero enfermeroSeleccionado = EnfermeroRepository.enfermeros.get(opcionEnfermero);
        EnfermeroRepository.asignaElEnfermero(pacienteSeleccionado, enfermeroSeleccionado);
    }

    public static void consultarListaDeEnfermeros() {
        System.out.println("ID - NOMBRE - DNI");
        for (int i = 0; i < EnfermeroRepository.enfermeros.size(); i++) {
            consultarEnfermeros(i);
        }
    }

    public static void modificarHistorialPaciente() throws IOException {
        System.out.println("Seleccione el paciente: ");
        consultarListaDePacientes();
        String textoRecoger1 = buffer.readLine();
        int opcionPaciente = Integer.parseInt(textoRecoger1);
        Paciente pacienteSeleccionado = PacienteRepository.pacientes.get(opcionPaciente);
        PacienteRepository.modificaHistorial(pacienteSeleccionado);
    }

    public static void registrarEnfermedad() throws IOException {
        System.out.println("Seleccione el paciente: ");
        consultarListaDePacientes();
        String textoRecoger1 = buffer.readLine();
        int opcionPaciente = Integer.parseInt(textoRecoger1);
        Paciente pacienteSeleccionado = PacienteRepository.pacientes.get(opcionPaciente);
        System.out.println("Que desea realizar \n1 - Registrar nueva enfermedad. \n2 - Consultar Enfermedades \n3 - Borrar Enfermedad");
        String textoRecoger2 = buffer.readLine();
        int opcionRegistro = Integer.parseInt(textoRecoger2);
        try {
            switch (opcionRegistro) {
                case 1:
                    PacienteRepository.registroDeEnfermedad(pacienteSeleccionado);
                    break;
                case 2:
                    PacienteRepository.consultarEnfermedad(pacienteSeleccionado);
                    break;
                case 3:
                    PacienteRepository.borrarRegistroDeEnfermedad(pacienteSeleccionado);
                    break;
                default:
                    System.out.println("Elija una opcion correcta.");
                    registrarEnfermedad();
                    break;
            }
        } catch (NumberFormatException ex) {
            System.out.println("Elija una opcion correcta.");
            registrarEnfermedad();
        }
    }
*/
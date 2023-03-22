package Services;

import Entities.Enfermero;
import Entities.Paciente;
import Repository.EnfermeroRepository;
import Repository.PacienteRepository;
import dto.EnfermeroDto;
import dto.PacienteDto;

public class PacienteServiceImpl implements PacienteService {
    private PacienteRepository repository = new PacienteRepository();
    private PersonaService personaService = new PersonaServiceImpl();

    @Override
    public PacienteDto crearPaciente(PacienteDto nuevoPaciente) {
        Paciente paciente = repository.save(dtoToEntity(nuevoPaciente));
        return entityToDto(paciente);
    }

    @Override
    public String consultarHistorialMedico(int id) {
        String historialMedico = repository.consultarHistorialMedico(id);
        return historialMedico;
    }

    private Paciente dtoToEntity(PacienteDto pacienteDto) {

        return new Paciente(
                pacienteDto.getPersona().getId(),
                pacienteDto.getId());
    }

    private PacienteDto entityToDto(Paciente paciente) {
        return new PacienteDto(
                personaService.getPersonaById(paciente.getPersonaId()),
                paciente.getId()
        );
    }
}

    /*
    public static Object crearNuevoPaciente() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        boolean grabarUsuario = true;
        System.out.println("Nombre completo: ");
        String textoRecoger1 = buffer.readLine();
        System.out.println("Numero de DNI: ");
        String textoRecoger2 = buffer.readLine();
        for (int i = 0; i < PacienteRepository.pacientes.size(); i++) {
            if (PacienteRepository.pacientes.get(i).getDni().equals(textoRecoger2)) {
                System.out.println("El Paciente ya existe en la base de datos.");
                grabarUsuario = false;
            }
        }
        System.out.println("Direccion: ");
        String textoRecoger3 = buffer.readLine();
        System.out.println("nro Puerta: ");
        String textoRecoger4 = buffer.readLine();
        int nroPuerta = Integer.parseInt(textoRecoger4);
        System.out.println("C.P.: ");
        String textoRecoger5 = buffer.readLine();
        int cp = Integer.parseInt(textoRecoger5);
        System.out.println("Numero de telefono: ");
        String textoRecoger6 = buffer.readLine();
        int telefono = Integer.parseInt(textoRecoger6);
        System.out.println("email: ");
        String textoRecoger7 = buffer.readLine();
        System.out.println("defina su password: ");
        String textoRecoger8 = buffer.readLine();
        if (grabarUsuario) {
            return null;
            // return pacienteRepository.crearPaciente(new Paciente(PACIENTE, textoRecoger1, textoRecoger2, textoRecoger3, nroPuerta, cp, telefono, textoRecoger7, textoRecoger8, false, id++));
        }else {
            return "";
        }
    }




    public static void consultarHistorialMedico() {
        for (int i=0; i<Paciente.historialMedico.size();i++){
        System.out.println(usuarioActivoPaciente.getHistorialMedico(i));
    }}


    public static boolean validarUsuario(String textoRecoger1, String textoRecoger2) {
        boolean usuarioValido = false;
        for (int i = 0; i < PacienteRepository.pacientes.size(); i++) {
            if (PacienteRepository.pacientes.get(i).getDni().equals(textoRecoger1)
                    & PacienteRepository.pacientes.get(i).getPassword().equals(textoRecoger2)) {
                usuarioActivoPaciente = PacienteRepository.pacientes.get(i);
                usuarioValido = true;
            }
        }
        return usuarioValido;
    }

     */


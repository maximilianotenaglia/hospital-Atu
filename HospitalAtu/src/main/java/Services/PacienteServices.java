package Services;

import Entities.Paciente;
import Entities.Persona;
import Repository.PacienteRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Entities.Persona.Atributo.PACIENTE;


public class PacienteServices {
    public static Paciente usuarioActivoPaciente;
    static int id = 0;
    private static PacienteRepository pacienteRepository = new PacienteRepository();

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
            return pacienteRepository.crearPaciente(new Paciente(PACIENTE, textoRecoger1, textoRecoger2, textoRecoger3, nroPuerta, cp, telefono, textoRecoger7, textoRecoger8, false, id++));
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
}

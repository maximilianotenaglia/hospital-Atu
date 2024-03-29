package controller;

import Services.EnfermeroService;
import Services.EnfermeroServiceImpl;
import Services.PersonaService;
import Services.PersonaServiceImpl;
import dto.PersonaDto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnfermeroController {

    private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    // comunicacion con el Services(impl)
    private EnfermeroService enfermeroService = new EnfermeroServiceImpl();
    private PersonaService personaService = new PersonaServiceImpl();
/*
    public void crearNuevoEnfermero() throws IOException {

        System.out.println("Nombre completo: ");
        String nombre = buffer.readLine();
        System.out.println("Numero de DNI: ");
        String dni = buffer.readLine();
        System.out.println("Direccion: ");
        String direccion = buffer.readLine();
        System.out.println("nro Puerta: ");
        String puerta = buffer.readLine();
        int nroPuerta = Integer.parseInt(puerta);
        System.out.println("C.P.: ");
        String cpString = buffer.readLine();
        int cp = Integer.parseInt(cpString);
        System.out.println("Numero de telefono: ");
        String telefonoString = buffer.readLine();
        int telefono = Integer.parseInt(telefonoString);
        System.out.println("email: ");
        String email = buffer.readLine();
        System.out.println("defina su password: ");
        String password = buffer.readLine();

        EnfermeroDto result = enfermeroService.crearEnfermero(new EnfermeroDto(
                0,
                new PersonaDto(1,
                         ENFERMERO,
                        nombre,
                        dni,
                        direccion,
                        nroPuerta,
                        cp,
                        telefono,
                        email,
                        password)
        ));
        System.out.println(result);

        // return enfermeroRepository.crearEnfermero(new Enfermero(ENFERMERO, textoRecoger1, textoRecoger2, textoRecoger3, nroPuerta, cp, telefono, textoRecoger7, textoRecoger8, idEnfermero++, true));
    }


 */

    public PersonaDto menuEnfermero(int idPersona) throws IOException {

        System.out.println("MENU ENFERMERO \n1- Asignar Enfermero al Paciente." +
                "\n2- Crear nuevo paciente (USUARIO).\n3- Modificar historial paciente." +
                "\n4- Tratar paciente.\n5- Recetar a un paciente." +
                "\n6- Asignar un medico por especialidad.\n7- Listado de pacientes." +
                "\n8- Registros de enfermedad.\n9- Dar el alta al Paciente\n0- <-- Volver");
        String textoRecoger1 = buffer.readLine();
        int opcion = Integer.parseInt(textoRecoger1);
        try {
            switch (opcion) {
                case 1:
                    //  asignarEnfermero();
                    //  menuEnfermero();
                    break;
                case 2:
                    //  crearNuevoPaciente();
                    //  menuEnfermero();
                    break;
                case 3:
                    System.out.println("Seleccione el paciente");

                    String TextoRecoger = buffer.readLine();
                    int opcionSeleccionada = Integer.parseInt(TextoRecoger);
                    enfermeroService.modificarHistorialPaciente(opcionSeleccionada);
                    menuEnfermero(idPersona);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    personaService.ListarPacientes();
                    //menuEnfermero();
                    break;
                case 8:
                    //registrarEnfermedad();
                    //menuEnfermero();
                    break;
                case 9:

                    break;

                case 0:
                    //Enfermero.loggOut();
                    break;
                default:
                    System.out.println("Elija una opcion correcta.");
                    menuEnfermero(idPersona);
                    break;
            }
        } catch (NumberFormatException ex) {
            System.out.println("Elija una opcion correcta.");
            menuEnfermero(idPersona);
        }
        return null;
    }

    // ESTO HAY QUE VER SI TIENE QUE ESTAR ACA, O CREAR UN CONTROLADOR PARA LOGGIN
/*
     public static void validaLogginEnfermero() throws IOException {
        System.out.println("Usuario: ");
        String textoRecoger1 = buffer.readLine();
        System.out.println("Password: ");
        String textoRecoger2 = buffer.readLine();
        if (EnfermeroServiceImpl.validarUsuario(textoRecoger1, textoRecoger2) == true) {
            menuEnfermero();
            Enfermero.loggOut();
        } else {
            System.out.println("Usuario y/o contraseña incorrectos");
        }

        Enfermero.loggOut();
    }


 */
    public static void loggOut() throws IOException {
        EnfermeroServiceImpl.usuarioActivoEnfermero = null;
    }

}

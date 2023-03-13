package Services;

import Entities.Medico;
import Repository.MedicoRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static Entities.Medico.Especialidad.*;
import static Entities.Persona.Atributo.MEDICO;

public class MedicoServices {
    static int idMedico;
    private static MedicoRepository medicoRepository = new MedicoRepository();

    public static Object crearNuevoMedico() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Medico.Especialidad especialidadMedica = null;
        System.out.println("Nombre completo: ");
        String textoRecoger1 = buffer.readLine();
        System.out.println("Numero de DNI: ");
        String textoRecoger2 = buffer.readLine();
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
        idMedico++;
        System.out.println("defina su ESPECIALIDAD MEDICA: \n1- MEDICODEFAMILIA \n2- PEDIATRIA " +
                "\n3- ONCOLOGIA\n4- DERMATOLOGIAn\5- GINECOLOGIA");
        String textoRecoger9 = buffer.readLine();
        int opcion = Integer.parseInt(textoRecoger9);
        switch (opcion) {
            case 1:
                especialidadMedica = MEDICODEFAMILIA;
                break;
            case 2:
                especialidadMedica = PEDIATRIA;
                break;
            case 3:
                especialidadMedica = ONCOLOGIA;
                break;
            case 4:
                especialidadMedica = DERMATOLOGIA;
                break;
            case 5:
                especialidadMedica = GINECOLOGIA;
                break;
        }

        return medicoRepository.crearMedico(new Medico(idMedico, especialidadMedica, new ArrayList<>(),true));

    }

}

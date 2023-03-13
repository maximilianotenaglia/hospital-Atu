package Repository;

import Entities.Enfermero;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EnfermeroRepository {

    public Enfermero save(Enfermero enfermero) {
        String query = "INSERT INTO ENFERMEROS (personaId) " +
                "VALUES (?)";
        try (PreparedStatement preparedStatement = H2Configuration.getConection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setInt(1, enfermero.getPersonaId());

            preparedStatement.executeUpdate();
            ResultSet result = preparedStatement.getGeneratedKeys();

            if (result.next()) {
                int id = result.getInt(1);
                enfermero.setId(id);
            }

            return enfermero;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


    /*
    public static void consultarEnfermeros(int val1) {
        System.out.println(enfermeros.get(val1).getIdEnfermero() + " - " + enfermeros.get(val1).getNombre() + " - " + enfermeros.get(val1).getDni());
    }

    public static void asignaElEnfermero(Paciente val1, Enfermero val2) {
        PacienteRepository.pacientes.get(val1.getId()).getEnfermeroAsignado().add(val2.getNombre());
        EnfermeroRepository.enfermeros.get(val2.getIdEnfermero()).getPacientesAsignadosAlEnfermero().add(val1.getNombre());

    }

    */



package Repository;

import Entities.Medico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MedicoRepository {
    public Medico save(Medico medico) {
        String query = "INSERT INTO MEDICOS (personaId) " +
                "VALUES (?)";
        try (PreparedStatement preparedStatement = H2Configuration.getConection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setInt(1, medico.getPersonaId());

            preparedStatement.executeUpdate();
            ResultSet result = preparedStatement.getGeneratedKeys();

            if (result.next()) {
                int id = result.getInt(1);
                medico.setId(id);
            }

            return medico;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

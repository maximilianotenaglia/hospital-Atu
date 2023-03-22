package Repository;

import Entities.Persona;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class PersonaRepository {


    public Persona save(Persona persona) {
        String query = "INSERT INTO PERSONAS (atributoPersona, nombre, dni, direccion, nroPuerta, cp, telefono, email, password) " +
                "VALUES (?,?,?,?,?,?,?,?,?)";

        try (PreparedStatement preparedStatement = H2Configuration.getConection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, persona.getAtributoPersona().toString());
            preparedStatement.setString(2, persona.getNombre());
            preparedStatement.setString(3, persona.getDni());
            preparedStatement.setString(4, persona.getDireccion());
            preparedStatement.setInt(5, persona.getNroPuerta());
            preparedStatement.setInt(6, persona.getCp());
            preparedStatement.setInt(7, persona.getTelefono());
            preparedStatement.setString(8, persona.getEmail());
            preparedStatement.setString(9, persona.getPassword());

            preparedStatement.executeUpdate();
            ResultSet result = preparedStatement.getGeneratedKeys();

            if (result.next()) {
                int id = result.getInt(1);
                persona.setId(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return persona;
    }

    public Persona findById(int id) {

        String query = "SELECT * FROM PERSONAS WHERE id = ?";
        try (PreparedStatement preparedStatement = H2Configuration.getConection().prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                int idResult = result.getInt("id");
                Persona.Atributo atributoPersona = Persona.Atributo.valueOf(result.getString("atributoPersona"));
                String nombre = result.getString("nombre");
                String dni = result.getString("dni");
                String direccion = result.getString("direccion");
                int nroPuerta = result.getInt("nroPuerta");
                int cp = result.getInt("cp");
                int telefono = result.getInt("telefono");
                String email = result.getString("email");
                String password = result.getString("password");

                return new Persona(
                        idResult,
                        atributoPersona,
                        nombre,
                        dni,
                        direccion,
                        nroPuerta,
                        cp,
                        telefono,
                        email,
                        password
                );
            }

            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Persona logginUsuario(Persona.Atributo atributoPersona, String dni, String password) {
        String query = "SELECT * FROM PERSONAS WHERE atributoPersona = ? AND dni = ? AND password = ? ";
        try (PreparedStatement preparedStatement = H2Configuration.getConection().prepareStatement(query)) {
            preparedStatement.setString(1, String.valueOf(atributoPersona));
            preparedStatement.setString(2, dni);
            preparedStatement.setString(3, password);

            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                int idResult = result.getInt("id");
                atributoPersona = Persona.Atributo.valueOf(result.getString("atributoPersona"));
                dni = result.getString("dni");
                password = result.getString("password");

                return new Persona(
                        idResult,
                        atributoPersona
                );
            }

            return null;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }



}

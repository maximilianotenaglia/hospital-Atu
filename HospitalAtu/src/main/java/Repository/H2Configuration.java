package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Configuration {
    private static Connection conection;

    {
        conection = initializeConnection();
    }

    public static Connection getConection() {
        if (conection != null) {
            return conection;
        } else {
            conection = initializeConnection();
            return conection;
        }
    }

    private static Connection initializeConnection() {
        String password = "1234";
        String username = "sa";
        String url = "jdbc:h2:file:~/db/h2/testdb;INIT=runscript from 'HospitalAtu/src/main/resources/sql/create.sql'\\;runscript from 'HospitalAtu/src/main/resources/sql/init.sql'";
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

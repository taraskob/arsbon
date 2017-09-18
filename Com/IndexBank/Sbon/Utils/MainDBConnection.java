package Com.IndexBank.Sbon.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainDBConnection implements DBConnection {

    @Override
    public Connection connect() {
        Connection Conn = null;
        try {
            Conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/?useSSL=false", "root", "12345");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Conn;
    }
}

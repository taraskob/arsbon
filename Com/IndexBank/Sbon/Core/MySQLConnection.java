package Com.IndexBank.Sbon.Core;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements Connection{

    @Override
    public void connect() {
java.sql.Connection Conn = null;
        try {
            Conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/?useSSL=false", "root", "12345");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

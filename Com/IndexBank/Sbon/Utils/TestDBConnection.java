package Com.IndexBank.Sbon.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBConnection implements DBConnection {
    @Override
    public Connection connect() {
        Connection connTest = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connTest = DriverManager.getConnection("jdbc:sqlite:D:/Arsbon/src/Com/IndexBank/Sbon/DB/PersonalData.db");
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connTest;
    }
}

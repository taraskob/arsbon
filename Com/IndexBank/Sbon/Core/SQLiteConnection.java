package Com.IndexBank.Sbon.Core;

import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection implements Connection {
    @Override
    public void connect() {
        java.sql.Connection connTest = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connTest = DriverManager.getConnection("jdbc:sqlite:D:/Arsbon/src/Com/IndexBank/Sbon/DB/PersonalData.db");
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

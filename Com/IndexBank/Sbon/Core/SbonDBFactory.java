package Com.IndexBank.Sbon.Core;

import java.sql.Connection;

public class SbonDBFactory {
    public static void main(String[] args) {
        dbconn(new MySQLFactory());
        dbconn(new SQLiteFactory());
    }

    private static Connection dbconn(DBFactory db) {
        DBConnection con;
        con = db.createConnection();
        return con.connect();
    }
}

package Com.IndexBank.Sbon.Core;

public class SbonDBFactory {
    public static void main(String[] args) {
        dbconn(new MySQLFactory());
        dbconn(new SQLiteFactory());
    }

    private static void dbconn(DBFactory db) {
        Connection con;
        con = db.createConnection();
        con.connect();
    }
}

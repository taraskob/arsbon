package Com.IndexBank.Sbon.Utils;

import java.sql.Connection;
import java.text.ParseException;

public class SbonDBFactory {
    public static void main(String[] args)  {
        try {
            SbonDate.setSbonDate("01.01.2018");
            dbconn(new MainDBFactory());
            dbconn(new TestDBFactory());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static Connection dbconn(DBFactory db) {
        DBConnection con;
        con = db.createConnection();
        return con.connect();
    }
}

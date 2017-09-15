package Com.IndexBank.Sbon.Core;

public class SQLiteFactory implements DBFactory {
    @Override
    public DBConnection createConnection() {
        return new SQLiteConnection();
    }
}

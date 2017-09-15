package Com.IndexBank.Sbon.Core;

public class SQLiteFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new SQLiteConnection();
    }
}

package Com.IndexBank.Sbon.Core;

public class MySQLFactory implements DBFactory {
    @Override
    public DBConnection createConnection() {
        return new MySQLConnection();
    }
}

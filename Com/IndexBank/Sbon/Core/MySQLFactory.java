package Com.IndexBank.Sbon.Core;

public class MySQLFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }
}

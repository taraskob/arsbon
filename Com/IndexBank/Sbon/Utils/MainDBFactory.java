package Com.IndexBank.Sbon.Utils;

public class MainDBFactory implements DBFactory {
    @Override
    public DBConnection createConnection() {
        return new MainDBConnection();
    }
}

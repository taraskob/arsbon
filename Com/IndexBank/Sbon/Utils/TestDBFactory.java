package Com.IndexBank.Sbon.Utils;

public class TestDBFactory implements DBFactory {
    @Override
    public DBConnection createConnection() {
        return new TestDBConnection();
    }
}

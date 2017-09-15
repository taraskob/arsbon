package Com.IndexBank.Sbon.Core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SbonDate {
    static String getSbonDate() {
        return new SimpleDateFormat("dd.MM.yyyy").format(new Date()).toString();
    }
}

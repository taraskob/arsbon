package Com.IndexBank.Sbon.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SbonDate {
    static Date sbonDate;

    static void setSbonDate(String sbonDareStr) throws ParseException {
        sbonDate = new SimpleDateFormat("dd.MM.yyyy").parse(sbonDareStr);

    }
}

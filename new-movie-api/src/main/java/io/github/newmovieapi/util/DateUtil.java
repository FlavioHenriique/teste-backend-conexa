package io.github.newmovieapi.util;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateUtil {
    public static String returnDateFormatted(Date date){
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        return fmt.format(date);
    }
}

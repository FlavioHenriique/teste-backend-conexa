package io.github.newmovieapi.util;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class DateUtilTest {

    @Test
    public void shouldFormatDate(){
        String expectedDate = "10/09/2023";
        Date date = Date.valueOf("2023-09-10");
        String dateFormatted = DateUtil.returnDateFormatted(date);

        Assert.assertEquals(expectedDate, dateFormatted);
    }
}

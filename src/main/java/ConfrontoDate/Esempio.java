package ConfrontoDate;

import org.joda.time.Days;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Esempio {

    public static void main(String[] args) throws Exception {

        LocalDate d1 = LocalDate.parse("2020-02-01", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.parse("2020-03-01", DateTimeFormatter.ISO_LOCAL_DATE);

        Duration diff_d = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());

        System.out.println("La Differenza è: " + diff_d.toDays());


    }
}

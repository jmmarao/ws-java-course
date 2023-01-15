package section11.examples.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date = simpleDateFormat.parse("25/02/2023");
        Date dateTime = simpleDateTimeFormat.parse("25/02/2023 15:42:07");

        System.out.println("Date format: " + date);
        System.out.println("Date time format: " + dateTime);
        System.out.println("-------------------\n");

        System.out.println("Date format: " + simpleDateFormat.format(date));
        System.out.println("Date time format: " + simpleDateTimeFormat.format(dateTime));
        System.out.println("-------------------\n");

        Date now1 = new Date();
        Date now2 = new Date(System.currentTimeMillis());
        System.out.println("Now1: " + simpleDateFormat.format(now1));
        System.out.println("Now2: " + simpleDateTimeFormat.format(now2));
    }
}

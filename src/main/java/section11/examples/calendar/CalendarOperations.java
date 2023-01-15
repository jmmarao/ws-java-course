package section11.examples.calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarOperations {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = Date.from(Instant.parse("2023-02-25T15:42:07Z"));

        System.out.println("Format: " + simpleDateFormat.format(date));
        System.out.println("-------------------\n");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, 4);
        date = calendar.getTime();

        System.out.println("Format add 4 hours: " + simpleDateFormat.format(date));
        System.out.println("-------------------\n");

        int minutes = calendar.get(Calendar.MINUTE);
        int month = calendar.get(Calendar.MONTH);

        System.out.println("Calendar get minutes: " + minutes);

        // Calendar start months at zero, need to add 1 to get the correct month
        System.out.println("Calendar get month: " + month);
        System.out.println("Calendar get month: " + (month + 1));
    }
}

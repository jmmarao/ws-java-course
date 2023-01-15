package section11.examples.localdate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class CustomDate {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        LocalDate localDateParse = LocalDate.parse("2023-02-25");
        LocalDateTime localDateTimeParse = LocalDateTime.parse("2023-02-25T01:30:26");
        Instant instantParse = Instant.parse("2023-02-25T01:30:26Z");

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // To format global time, as Instant, need to define a time zone
        DateTimeFormatter instantFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("Local date parse: " + localDateParse);
        System.out.println("Local date parse formatted: " + localDateParse.format(dateFormatter));
        System.out.println("Date time formatter: " + dateFormatter.format(localDateParse));
        System.out.println("-------------------\n");

        System.out.println("Local date time parse (date formatter): " + localDateTimeParse.format(dateFormatter));
        System.out.println("Local date time parse (date time formatter): " + localDateTimeParse.format(dateTimeFormatter));
        System.out.println("Instant parse formatted: " + instantFormatter.format(instantParse));
    }
}

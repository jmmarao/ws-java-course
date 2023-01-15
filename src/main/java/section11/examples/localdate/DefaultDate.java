package section11.examples.localdate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DefaultDate {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        LocalDate localDateNow = LocalDate.now();
        LocalDateTime localDateTimeNow = LocalDateTime.now();

        // Global time
        Instant instantNow = Instant.now();

        System.out.println("Local date: " + localDateNow);
        System.out.println("Local date time: " + localDateTimeNow);
        System.out.println("Instant: " + instantNow);
        System.out.println("-------------------\n");

        LocalDate localDateParse = LocalDate.parse("2023-02-25");
        LocalDateTime localDateTimeParse = LocalDateTime.parse("2023-02-25T01:30:26");
        Instant instantParse = Instant.parse("2023-02-25T01:30:26Z");

        System.out.println("Local date parse: " + localDateParse);
        System.out.println("Local date time parse: " + localDateTimeParse);
        System.out.println("Instant parse: " + instantParse);
        System.out.println("-------------------\n");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeHourFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate localDateFormatted = LocalDate.parse("14/01/2023", dateTimeFormatter);
        LocalDateTime localDateTimeFormatted = LocalDateTime.parse("14/01/2023 23:39", dateTimeHourFormatter);
        LocalDate localDateOf = LocalDate.of(2023, 1, 14);
        LocalDateTime localDateTimeOf = LocalDateTime.of(2023, 1, 14, 20, 55);

        System.out.println("Local date formatted: " + localDateFormatted);
        System.out.println("Local date time formatted: " + localDateTimeFormatted);
        System.out.println("Local date of: " + localDateOf);
        System.out.println("Local date time of: " + localDateTimeOf);
    }
}

package section11.examples.localdate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalToLocalTime {
    public static void main(String[] args) {
        Instant instant = Instant.parse("2023-02-25T01:30:26Z");

        LocalDate localDateToConvert = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        LocalDate localDateToConvertPortugal = LocalDate.ofInstant(instant, ZoneId.of("Portugal"));

        System.out.println("Local date converted: " + localDateToConvert);
        System.out.println("Local date converted to Portugal zone: " + localDateToConvertPortugal);
        System.out.println("-------------------\n");

        LocalDateTime localDateTimeToConvert = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        LocalDateTime localDateTimeToConvertPortugal = LocalDateTime.ofInstant(instant, ZoneId.of("Portugal"));

        System.out.println("Local date time converted: " + localDateTimeToConvert);
        System.out.println("Local date time converted to Portugal zone: " + localDateTimeToConvertPortugal);
        System.out.println("-------------------\n");

        System.out.println("Local date to convert:");
        System.out.printf("\tDay: %d\n\tMonth: %d\n\tYear: %d",
                localDateToConvert.getDayOfMonth(), localDateToConvert.getMonthValue(), localDateToConvert.getYear());
    }
}

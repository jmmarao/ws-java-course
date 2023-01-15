package section11.examples.localdate;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeOperations {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2023-02-25");
        LocalDateTime localDateTime = LocalDateTime.parse("2023-02-25T01:30:26");
        Instant instant = Instant.parse("2023-02-25T01:30:26Z");

        LocalDate pastWeekLocalDate = localDate.minusDays(7);
        LocalDate nextWeekLocalDate = localDate.plusDays(7);

        System.out.println("Past week: " + pastWeekLocalDate);
        System.out.println("Next week: " + nextWeekLocalDate);
        System.out.println("-------------------\n");

        LocalDateTime pastWeekLocalDateTime = localDateTime.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = localDateTime.plusDays(7);

        System.out.println("Past week local date time: " + pastWeekLocalDateTime);
        System.out.println("Next week local date time: " + nextWeekLocalDateTime);
        System.out.println("-------------------\n");

        Instant pastWeekInstant = instant.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = instant.plus(7, ChronoUnit.DAYS);

        System.out.println("Past week instant: " + pastWeekInstant);
        System.out.println("Next week instant: " + nextWeekInstant);
        System.out.println("-------------------\n");

        // Duration is applied ONLY on LocalDateTime, so it is required to convert LocalDate to LocalDateTime
        Duration localDateTimeConverted = Duration.between(pastWeekLocalDate.atStartOfDay(), localDate.atStartOfDay());
        // Duration localDateTimeConverted = Duration.between(pastWeekLocalDate.atTime(0, 0), localDate.atTime(0, 0));
        Duration localDateTimeDuration = Duration.between(pastWeekLocalDateTime, localDateTime);
        Duration instantDuration = Duration.between(pastWeekInstant, instant);

        System.out.println("Local date duration: " + localDateTimeConverted.toDays() + " days");
        System.out.println("Local date time duration: " + localDateTimeDuration.toDays() + " days");
        System.out.println("Instant duration: " + instantDuration.toDays() + " days");
    }
}

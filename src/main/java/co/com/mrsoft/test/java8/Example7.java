package co.com.mrsoft.test.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * Samples of new Date and Time APIs.
 */
public class Example7 {
    public static void main(String[] args) {
        // Current LocalDate
        LocalDate todayLocalDate = LocalDate.now();
        System.out.println("Current LocalDate = " + todayLocalDate);

        // Creating LocalDate by providing input arguments
        LocalDate specificLocalDate = LocalDate.of(2014, Month.JANUARY, 1);
        System.out.println("Specific LocalDate = " + specificLocalDate);

        // Current LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("Current LocalTime = " + localTime);

        // Creating LocalTime by providing input arguments
        LocalTime specificLocalTime = LocalTime.of(12,20,25,40);
        System.out.println("Specific LocalTime = " + specificLocalTime);

        // Current LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current LocalDateTime = " + localDateTime);

        // Creating LocalDateTime by providing input arguments
        LocalDateTime specificLocalDateTime = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
        System.out.println("Specific LocalDateTime = " + specificLocalDateTime);

        // Current ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Current ZonedDateTime = " + zonedDateTime);

        // Creating ZonedDateTime by providing input arguments
        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(2014, 1, 1, 10, 10, 30, 987, ZoneId.of("America/Bogota"));
        System.out.println("Specific ZonedDateTime = " + specificZonedDateTime);

        // Current timestamp from Instant
        Instant instant = Instant.now();
        System.out.println("Current Instant = " + instant);

        // Creating custom timestamp from Instant
        Instant specificInstant = Instant.ofEpochSecond(specificZonedDateTime.toEpochSecond());
        System.out.println("Specific Instant = " + specificInstant);

        // Duration using specific days
        Duration thirtyDayDuration = Duration.ofDays(30);
        System.out.println("Thirty day duration in seconds = " + thirtyDayDuration.getSeconds());

        // Duration using between
        Duration betweenDuration = Duration.between(specificZonedDateTime, zonedDateTime);
        System.out.println("Between duration in nanoseconds = " + betweenDuration.getNano());

        // Period using specific days
        Period tenDaysPeriod = Period.ofDays(10);
        System.out.println("Ten days period = " + tenDaysPeriod);

        // Period using between
        Period betweenPeriod = Period.between(todayLocalDate, specificLocalDate);
        System.out.println("Between period = " + betweenPeriod);

        // Temporal adjusters
        LocalDate with = todayLocalDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First Day Of Month = " + with);

        // Current OffsetDateTime
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("Current OffsetDateTime = " + offsetDateTime);

        // Creating OffsetDateTime by providing input arguments
        OffsetDateTime specificOffsetDateTime = OffsetDateTime.of(2014, 1, 1, 10, 10, 30, 987, ZoneOffset.ofHours(-5));
        System.out.println("Specific OffsetDateTime = " + specificOffsetDateTime);

        // Date Format usage
        System.out.println("Format specific pattern = " + localDateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println("Format basic ISO date = " + localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

        // Date Parse examples
        LocalDateTime parseDate = LocalDateTime.parse("27::Apr::2014 21::39::48", DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("Parse specific pattern = " + parseDate);
    }
}

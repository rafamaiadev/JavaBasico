package app4;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2023-06-28");
        LocalDateTime d05 = LocalDateTime.parse("2023-06-28T14:49:25");
        Instant d06 = Instant.parse("2023-06-28T14:49:25Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastHourLocalDateTime = d05.minusHours(7);
        LocalDateTime nextHourLocalDateTime = d05.plusHours(7);

        System.out.println("pastWeekLocalDateTime = " + pastHourLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextHourLocalDateTime);

        Instant pastWeekInstant = d06.minus(5, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(5, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastHourLocalDateTime, d05);

        System.out.println("t1 = " + t1.toHours());
    }
}

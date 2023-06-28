package app2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-06-28");
        LocalDateTime d05 = LocalDateTime.parse("2023-06-28T14:49:25");
        Instant d06 = Instant.parse("2023-06-28T14:49:25Z");
        Instant d07 = Instant.parse("2023-06-28T14:49:25-03:00");

        LocalDateTime d08 = LocalDateTime.parse("28/06/2023 15:09", fmt1);

        LocalDate d09 = LocalDate.of(2023, 06, 28);
        LocalDateTime d10 = LocalDateTime.of(2023, 06, 28, 15, 21);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
    }
}

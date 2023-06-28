package app3;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2023-06-28");
        LocalDateTime d05 = LocalDateTime.parse("2023-06-28T14:49:25");
        Instant d06 = Instant.parse("2023-06-28T14:49:25Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
    }
}

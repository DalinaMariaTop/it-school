package homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ex9 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.of(2024, 1, 1);
        long calculateDays = ChronoUnit.DAYS.between(today, yesterday);
        long a = Math.abs(calculateDays);
        System.out.println(a);
    }
}

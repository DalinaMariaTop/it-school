package homework;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ex8 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.of(1995,8,31);
        DayOfWeek dayofweek = today.getDayOfWeek();
        System.out.println("The day I was born is: " + dayofweek);
    }
}

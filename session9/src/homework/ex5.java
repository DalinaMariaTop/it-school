package homework;

import java.time.LocalDate;

public class ex5 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate verifyDate = LocalDate.of(2019, 12, 10);
        if (verifyDate == today) {
            System.out.println("It is true");
        } else {
            System.out.println("It is false");
        }
    }
}

package homework;

import java.time.LocalDate;

import java.util.Calendar;

public class ex2 {
    public static void main(String[] args) {
        LocalDate displayDateComponents = LocalDate.now();
        System.out.println("Current date is: " + displayDateComponents);

        Calendar c = Calendar.getInstance();
        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + c.get(Calendar.MONTH));
        System.out.println("Day: " + c.get(Calendar.DAY_OF_MONTH));
    }

}

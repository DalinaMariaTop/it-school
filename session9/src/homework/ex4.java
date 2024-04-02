package homework;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter the first date: ");
        String date1 = a.next().toString();
        System.out.println("First inserted date is: " + date1);

        System.out.println("Please enter the second date: ");
        String date2 = a.next().toString();
        System.out.println("The second date is: " + date2);

        if (date1.equals(date2)) {
            System.out.println("The dates are equal");
        } else {
            System.out.println("The date are different");
        }
    }
}
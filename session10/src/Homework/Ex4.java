package Homework;

public class Ex4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int even_count = 0;
        int odd_count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                odd_count++;
            } else {
                even_count++;
            }
        }
        System.out.println("Number of even numbers: " + even_count);
        System.out.println("Number of odd numbers: " + odd_count);
    }
}


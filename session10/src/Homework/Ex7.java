package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex7 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("mere", "pere", "banane"));
        System.out.println("Unsorted arraylist: " + fruits);
        Collections.sort(fruits);
        System.out.println("Sorted arraylist: " + fruits);
        Collections.sort(fruits, Collections.reverseOrder());
        Collections.sort(fruits, Comparator.comparing(String::length));

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println("Sorted arraylist in descending order based on length: " + fruits);
    }
}

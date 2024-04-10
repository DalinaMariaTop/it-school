package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Arad", "Timisoara", "Cluj"));
        System.out.println(cities);
        if (cities.contains("Bucuresti")) {
            System.out.println("It is a duplicate.");
        } else {
            cities.add("Bucuresti");
        }
        System.out.println(cities);
    }
}

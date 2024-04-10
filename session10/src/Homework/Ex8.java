package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex8 {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Cloudy", "Tormented", "The Godfather"));
        Collections.sort(movies);
        System.out.println(movies);
        System.out.println("Search for a movie title.");
        if (movies.contains("Cloudy")) {
            System.out.println("The movie title is written in the list already and the INDEX of the movie title is: ");
            System.out.println(movies.indexOf("Cloudy"));
        } else {
            movies.add("Cloudy");
        }
    }
}

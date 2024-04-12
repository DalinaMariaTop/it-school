package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ex6 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Alin", "Andrei", "Thomas"));
        System.out.println(linkedList);
        if (linkedList.contains("Anda")) {
            System.out.println("Student is already written in the list.");
        } else {
            linkedList.add("Anda");
        }
        System.out.println(linkedList);
    }
}


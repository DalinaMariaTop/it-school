package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();
        System.out.println(studentList);
        System.out.println(graduateStudentList);
        Collections.addAll(studentList, "Tom", "John", "Tommy", "Maria", "Madalin", "Alia", "Dalina", "Calin", "Vlad", "Delia");
        System.out.println(studentList);

        graduateStudentList.addAll(studentList);
        System.out.println(graduateStudentList);

        for (String element:graduateStudentList) {
            System.out.println(element);
        }
    }
}

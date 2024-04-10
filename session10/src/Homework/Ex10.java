package Homework;

import java.util.ArrayList;
import java.util.Collections;

public class Ex10 {

    public static void main(String[] args) {
        ArrayList<String> diary = new ArrayList<>();
        diary.add("2023-01-01");
        diary.add("2021-01-01");
        diary.add("2020-01-01");
        System.out.println(diary);
        diary.set(0, "2000-01-01");
        System.out.println("Edit diary:" + diary);
        diary.remove(1);
        System.out.println("Remove item from diary" + diary);
        Collections.sort(diary);
        System.out.println("Sorted diary: " + diary);
        Collections.sort(diary, Collections.reverseOrder());
        System.out.println("Reverse sorted diary: " + diary);
    }
}

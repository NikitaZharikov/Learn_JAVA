package org.example.homework004.task001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static <T> List<T> reverseList(List<T> list) {

        List<T> reverseList = new ArrayList<>(list);
        Collections.reverse(reverseList);
        return reverseList;
    }

    public static void main(String[] args) {
        List<Integer> simpleList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Изначальный массив " + simpleList);
        List<Integer> reverseList = reverseList(simpleList);
        System.out.println("Перевернутый массив " + reverseList);
    }
}

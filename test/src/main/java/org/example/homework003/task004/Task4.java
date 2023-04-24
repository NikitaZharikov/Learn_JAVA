package org.example.homework003.task004;

import java.util.ArrayList;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrIntList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrIntList.add(random.nextInt(0, 100));
        }
        System.out.println(arrIntList);
        int max = arrIntList.get(0);
        int min = arrIntList.get(0);
        int sum = 0;
        for (int i = 0; i < arrIntList.size(); i++) {
            if (arrIntList.get(i) > max) max = arrIntList.get(i);
            if (arrIntList.get(i) < min) min = arrIntList.get(i);
            sum = sum + arrIntList.get(i);
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Среднее арифметическое: " + ((float) sum / arrIntList.size()));
    }
}

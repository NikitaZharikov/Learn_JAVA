package org.example.homework002.task002;

import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] ar1 = new int[10];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(10);
            System.out.print(ar1[i] + "  ");
        }
        System.out.println(" ");

        if (ar1[0] == ar1[1]) {
            System.out.println("Первые два элемента равны");
        }
        boolean ascend = ar1[0] < ar1[1];

        System.out.println(ascend ? "Восходящий" : "Нисходящий");

        for (int i = 1; i < ar1.length; i++) {
            if ((ar1[i-1] >= ar1[i] && ascend) || (ar1[i-1] <= ar1[i] && !ascend)) {
                System.out.println(i + " не последовательности");
            }
            else {
                System.out.println( i + " последовательны");
            }
        }
    }
}


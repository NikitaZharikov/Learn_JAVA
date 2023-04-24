package org.example.homework002.task001;

import java.util.Random;


public class task1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] ar1 = new int[5];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(10);
            System.out.println(ar1[i] + "  ");
        }

        int sum = 0;

        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] % 2 != 0){
                sum += ar1[i];
            }
        }
        System.out.println(sum);
    }

}

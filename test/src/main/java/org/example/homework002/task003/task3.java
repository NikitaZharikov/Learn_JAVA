package org.example.homework002.task003;

import java.util.Arrays;
import java.util.Random;

public class task3 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] ar1 = new int[10];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(-20, 20);
            System.out.print(ar1[i] + "  ");
        }
        System.out.println(" ");

        int sum = 0;

        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] > 9 || ar1[i] < -9) {
                sum += i;
            }
        }

        System.out.println(sum);

        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] < 0){
                ar1[i] = sum;
            }
        }
        System.out.println(Arrays.toString(ar1));

    }
}


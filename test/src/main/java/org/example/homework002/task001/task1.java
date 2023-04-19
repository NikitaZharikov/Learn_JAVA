package org.example.homework002.task001;

import java.util.Random;


public class task1 {
    public static void main(String[] args) {
//        int count = 5;
//        int sum = 0;
//        int n = 2;
//        for (int i = 0; i < count; i++) {
//            if (n == 2) {
//                sum += n;
//                n++;
//            } else {
//                while (!isPrime(n)) {
//                    n += 2;
//                }
//                sum += n;
//                n = n + 2;
//            }
//        }
//        System.out.println(sum);
//    }
//
//        public static boolean isPrime ( int i){
//            if (i != 2 && i != 3) {
//                if (i % 2 == 0) return false;
//                for (int j = 3; j <= (i / 2) + 1; j = j + 2) {
//                    if (i % j == 0) return false;
//                }
//            }
//            return true;
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

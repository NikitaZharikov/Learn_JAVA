package org.example.homework001.task002;

import java.util.Scanner;

public class task002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int a = scanner.nextInt();
        while (a != 0) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                sum += a;
            }
            a = b;
        }
        System.out.println(sum);
    }
}

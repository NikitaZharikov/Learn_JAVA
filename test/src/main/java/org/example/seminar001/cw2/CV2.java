package org.example.seminar001.cw2;

import java.util.Scanner;

public class CV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDiff(n, scanner));
        scanner.close();
    }

    /**
     *
     * @param n количество чисел в последовательности
     * @return кол-во положит числе идущих перед отриц.
     */
    public static int countDiff(int n, Scanner scanner){
        int count = 0;
        int a = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0){
                count++;
            }
            a = b;
        }
        return count;
    }
}
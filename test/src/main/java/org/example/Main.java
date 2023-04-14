package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo gg");
        int a = scanner.nextInt();
        System.out.println(subtractProductAndSum(a));
        scanner.close();
    }

    /**
     * @param a input int
     * @return out sum
     */
    public static int subtractProductAndSum(int a){
        int product = 1;
        int sum = 0;
        while (a != 0)
        {
            product *= a % 10;
            sum += a % 10;
            a /= 10;
        }
        return product - sum;
    }
}
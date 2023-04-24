package org.example.homework003.task002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Product1 product1 = new Product1("Арбуз", "Абхазия", 12, 300, "1 Высший");
        Product1 product2 = new Product1("Дыня", "Казахстан", 20, 500, "2");
        Product1 product3 = new Product1("Яблоки", "Россия", 50, 200, "2");
        Product1 product4 = new Product1("Виноград", "Грузия", 18, 150, "1 Высший");
        Product1 product5 = new Product1("Бананы", "Малайзия", 10, 80, "1 Высший");

        List<Product1> productList1 = new ArrayList<>();
        productList1.add(product1);
        productList1.add(product2);
        productList1.add(product3);
        productList1.add(product4);
        productList1.add(product5);

        List<String> names = new ArrayList<>();
        List<Integer> minPrice = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        String getVariety = scanner.nextLine();

        int min1PriceFinal = 0;
        int min2PriceFinal = 0;

        for (int i = 0; i < productList1.size(); i++) {
            if (productList1.get(i).variety.contains(getVariety)) {
                names.add(productList1.get(i).name);
                minPrice.add(productList1.get(i).price);
                if (minPrice.size() > 1) {
                    Collections.sort(minPrice);
                    min1PriceFinal = minPrice.get(0);
                    min2PriceFinal = minPrice.get(1);
                    if (min1PriceFinal == productList1.get(i).price) {
                        System.out.println("Найден товар " + productList1.get(i).name + " с ценой " + min1PriceFinal);
                    }
                    if (min2PriceFinal == productList1.get(i).price) {
                        System.out.println("Найден товар " + productList1.get(i).name + " с ценой " + min2PriceFinal);
                    }
                }
            }
        }

    }
}

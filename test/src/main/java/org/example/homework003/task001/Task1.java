package org.example.homework003.task001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Product product1 = new Product("Арбуз", 300, "2 Высший");
        Product product2 = new Product("Дыня", 500, "2 Высший");
        Product product3 = new Product("Яблоки", 200, "1");

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        List<Integer> priceList = new ArrayList<>();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).variety.contains("Высший")) {
                priceList.add(productList.get(i).price);
                if (priceList.size() > 1) {
                    priceList.sort(Collections.reverseOrder());
                }
            }
        }
        System.out.println("Найбольшая цена: " + priceList.get(0));
    }
}

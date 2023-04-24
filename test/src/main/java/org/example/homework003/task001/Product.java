package org.example.homework003.task001;

public class Product {
    String name;
    Integer price;
    String variety;

    public Product(String name, int price, String variety) {
        this.name = name;
        this.price = price;
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", variety='" + variety + '\'' +
                '}';
    }
}

package org.example.homework003.task002;

public class Product1 {
    String name;
    String country;
    Integer weight;
    Integer price;
    String variety;


    public Product1(String name, String country, int weight, int price, String variety) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", variety='" + variety + '\'' +
                '}';
    }
}
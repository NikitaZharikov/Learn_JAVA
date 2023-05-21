package org.example.homework006;

public class laptop {
    private String color;
    private Integer RAM;
    private String OS;
    private Integer HDD;
    private Integer id;
    private String brand;
    private String model;
    private boolean isBooked = false;

    public laptop(String model, Integer id, String brand) {
        this.model = model;
        this.brand = brand;
        this.id = id;
        System.out.println("Ноутбук марки " + "'" + this.brand + "'" + " Модель " + this.model + " С id " + Integer.toString(this.id));
    }

    public String getColor() {
        return this.color;
    }

    public Integer getRAM() {
        return this.RAM;
    }

    public String getOS() {
        return this.OS;
    }

    public Integer getHDD() {
        return this.HDD;
    }

    public Integer getId() {
        return this.id;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public Boolean getBooking() {
        return this.isBooked;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public void Book() {
        if (!isBooked) {
            this.isBooked = true;
        } else System.out.println("Этот ноутбук уже зарезервирован");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ноутбук ");
        sb.append(this.brand);
        sb.append(System.lineSeparator());
        sb.append(this.model);
        sb.append(" ");
        sb.append(this.id);
        sb.append(" ");
        sb.append(this.color);
        sb.append(System.lineSeparator());
        sb.append("OS ").append(this.OS);
        sb.append(System.lineSeparator());
        sb.append("HDD ").append(this.HDD);
        sb.append(System.lineSeparator());
        sb.append("RAM ").append(this.RAM);
        sb.append(System.lineSeparator());
        if (!this.isBooked) sb.append("Не зарезервирован");
        else sb.append("Зарезервирован");


        return (sb.toString());
    }


}

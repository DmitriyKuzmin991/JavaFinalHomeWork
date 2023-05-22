package org.example;

import java.util.Objects;

public class Laptop {
    private String brand;
    private String operatingSystem;
    private int ramSize;
    private int hardDriveCapacity;
    private String color;

    public Laptop(String brand,  String operatingSystem, int ramSize, int hardDriveCapacity, String color) {
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.ramSize = ramSize;
        this.hardDriveCapacity = hardDriveCapacity;
        this.color = color;
    }
    public void start(){
        System.out.println("Laptop is work");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ramSize == laptop.ramSize && hardDriveCapacity == laptop.hardDriveCapacity
                &&  Objects.equals(brand, laptop.brand)
                && Objects.equals(operatingSystem, laptop.operatingSystem)
                && Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand,  operatingSystem, ramSize, hardDriveCapacity, color);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", ramSize=" + ramSize +
                ", hardDriveCapacity=" + hardDriveCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public String getColor() {
        return color;
    }
}

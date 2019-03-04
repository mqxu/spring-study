package com.spring.ioc;

/**
 * Car类
 *
 * @author 莫淇
 * 2019.3.4
 */
public class Car {
    private String brand;
    private String color;
    private String parameter;

    public Car(String brand, String color, String parameter) {
        this.brand = brand;
        this.color = color;
        this.parameter = parameter;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", parameter='" + parameter + '\'' +
                '}';
    }
}

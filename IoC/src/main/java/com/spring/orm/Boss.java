package com.spring.orm;

import java.util.List;
/**
 * Boss类
 * @author 莫淇
 * 2019.3.4
 */
public class Boss {
    private String name;
    private String Company;
    private Car car;
    private List<String> hobbies;

    public Boss(String name, String company, Car car, List<String> hobbies) {
        this.name = name;
        Company = company;
        this.car = car;
        this.hobbies = hobbies;
    }

    public Boss() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", Company='" + Company + '\'' +
                ", car=" + car +
                ", hobbies=" + hobbies +
                '}';
    }
}

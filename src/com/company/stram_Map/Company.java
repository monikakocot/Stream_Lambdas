package com.company.stram_Map;

public class Company {

    String name;
    String city;

    public Company(String name, String city) {
        this.name = name;
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

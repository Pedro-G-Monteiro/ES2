package com.es2.factorymethod;

public class Software implements Product{

    String brand = null;
    protected Software(){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

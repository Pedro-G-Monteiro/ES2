package com.es2.factorymethod;
public class Computer implements Product{

    String brand = null;

    protected Computer(){}

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
}

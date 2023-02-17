package com.es2.factorymethod;

public class UndefinedProductException extends Exception{
    public UndefinedProductException(){
        System.out.println("Error in the Product creation.");
    }
}

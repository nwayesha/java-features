package com.api.java.features.javafeatures.javafeatures.java8.interfaces;

public interface DefaultInterface2 {
    public default void printName(String name){
        System.out.println("Name is : " + name);
    }
}

package com.api.java.features.javafeatures.javafeatures.java8.interfaces;

class ImplementingInterfaces implements DefaultAndStaticInterfaces, DefaultInterface2{
    @Override
    public void getDefaultAndStaticInterface(String name) {
        System.out.println("inside getDefaultAndStaticInterface ... abstract" + name);
    }

    @Override
    public void printName(String name){
        System.out.println("Name is in implementInterface : " + name);
        DefaultAndStaticInterfaces.super.printName("aaa");
        DefaultInterface2.super.printName("bbbb");
    }

}

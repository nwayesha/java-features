package com.api.java.features.javafeatures.javafeatures.java8.interfaces;

@FunctionalInterface
interface DefaultAndStaticInterfaces {
    public void getDefaultAndStaticInterface(String name);
/*
We can override default in the subclass or we can ignore it if the subclass implements only one interface. If we are implementing
more ifterfaces and if all the interfaces are having same default method then we have to override it.
 */
    public default void printName(String name){
        System.out.println("Name is : " + name);
    }

    static void getName(String name){
        System.out.println("getName : " + name);
    }
// we can not override Object class member
//    default String toString(){
//        return 11;
//    }
}
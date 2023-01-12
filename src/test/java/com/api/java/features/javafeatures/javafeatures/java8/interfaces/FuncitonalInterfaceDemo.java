package com.api.java.features.javafeatures.javafeatures.java8.interfaces;

import org.testng.annotations.Test;

public class FuncitonalInterfaceDemo {

    @Test
    public void checkFunctionalInterface(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("this is run method....");
            }
        };
        runnable.run();

        Runnable runnable1 = () ->{
            System.out.println("this is runnable1...");
        };

        runnable1.run();

        // if single statement in method implementation, then no need curly brackets. can use lambda as follows.
        DefaultAndStaticInterfaces defaultAndStaticInterfaces = (s) -> System.out.println(s);
        defaultAndStaticInterfaces.printName("abcdef");

    }

    @Test
    public void testFunctionalInterface(){
        FunctionalInterfaceTwoParams functionalInterfaceTwoParams = ((val1, val2) -> System.out.println(val1 +"--"+ val2));
        functionalInterfaceTwoParams.haveTwoParameters(10, 12);

        FunctionalInterfaceTwoParams functionalInterfaceTwoParams1 = ((val1, val2) -> System.out.println("value--  "+ val1 * val2));
        functionalInterfaceTwoParams1.haveTwoParameters(8, 10);
    }
}

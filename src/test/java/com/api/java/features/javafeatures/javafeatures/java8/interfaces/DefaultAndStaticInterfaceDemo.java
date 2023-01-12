package com.api.java.features.javafeatures.javafeatures.java8.interfaces;


import com.api.java.features.javafeatures.javafeatures.BaseIT;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

public class DefaultAndStaticInterfaceDemo extends BaseIT {
    @Test
    public void test() {
        ImplementingInterfaces implementingInterfaces = new ImplementingInterfaces();
        implementingInterfaces.getDefaultAndStaticInterface("zzzzzz");
        System.out.println("aaaaaaaaaaaaaaaaa");
        DefaultAndStaticInterfaces.getName("static abc");
        System.out.println("aaaaaaaaaaaaaaaaa");
        implementingInterfaces.printName("default pqr");
    }

}
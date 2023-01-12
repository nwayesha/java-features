package com.api.java.features.javafeatures.javafeatures.java8.streamapi;

import com.api.java.features.javafeatures.javafeatures.BaseIT;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberOperations extends BaseIT {

    @Test
    public void getSumOfNumbers(){
        List<Integer> numberLists = new ArrayList<>();
        for(int i = 0; i < 10; i++) numberLists.add(i);
        //Assert.assertEquals(2*2, 4, "2*2 = 4");
        int numberSum =  numberLists.stream().filter(i -> i < 10).mapToInt(i -> i).sum();
        System.out.println("sum -- " + numberSum);

        int numberReduce = numberLists.stream().filter(i -> i<5).mapToInt(p -> p).reduce(10, (sub,fin) -> sub + fin);
        System.out.println("reduce -- " + numberReduce);
    }
}

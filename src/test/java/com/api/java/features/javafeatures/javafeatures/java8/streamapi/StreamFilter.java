package com.api.java.features.javafeatures.javafeatures.java8.streamapi;

import com.api.java.features.javafeatures.javafeatures.BaseIT;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter extends BaseIT {
    @Test
    public void streamFilter() {
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 100; i++) myList.add(i);
        Stream<Integer> sequentialStream = myList.stream();

        Stream<Integer> highNums = sequentialStream.filter(p -> p > 90); //filter numbers greater than 90
        System.out.print("High Nums greater than 90=");
        highNums.forEach(p -> System.out.print(p + " "));

    }
}

package com.api.java.features.javafeatures.javafeatures.java8.streamapi;

import com.api.java.features.javafeatures.javafeatures.BaseIT;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo extends BaseIT {
    @Test
    public void maintest() {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
        //using lambda in forEach
        highNums.forEach(p -> System.out.println("High Nums parallel=" + p));

        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        highNumsSeq.forEach(p -> System.out.println("High Nums sequential=" + p));


        List<Integer> numberLists = new ArrayList<>();
        for (int j = 0; j < 50; j++) numberLists.add(j);

        numberLists.stream()
                .filter(p -> p > 35)
                .forEach(print -> System.out.println("seq stream > 35 ---" + print));

        numberLists.parallelStream()
                .filter(q -> q>1)
               // .collect(Collectors.toList())
                .forEach(printQ -> System.out.println("paralal steam > 1 ----" + printQ));
    }

}

package com.api.java.features.javafeatures.javafeatures.java8.streamapi;

import com.api.java.features.javafeatures.javafeatures.BaseIT;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StatefulParallelStream extends BaseIT {
    /**
     * if you are using parallel stream and lambda expressions are stateful, it can result in random responses.
     */
    @Test
    public void streamReduce() {
        List<Integer> ss = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        List<Integer> result = new ArrayList<Integer>();

        Stream<Integer> stream = ss.parallelStream();

        stream.map(s -> {
            synchronized (result) {
                if (result.size() < 10) {
                    result.add(s);
                }
            }
            return s;
        }).forEach( e -> {});
        System.out.println(result);
    }
}

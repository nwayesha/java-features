package com.api.java.features.javafeatures.javafeatures.java8.streamapi;

import com.api.java.features.javafeatures.javafeatures.BaseIT;
import org.testng.annotations.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap extends BaseIT {
    /**
     * We can use map() to apply functions to an stream.
     */
    @Test
    public void streamMap() {
        Stream<String> names = Stream.of("aBc", "de", "efe");
//        System.out.println(names.map(s -> {
//            return s.toUpperCase();
//        }).collect(Collectors.toList()));

        System.out.println(names.map(s -> s.concat("p")).filter(a -> a.contains("ep")).collect(Collectors.toList()));

    }
}

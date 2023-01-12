package com.api.java.features.javafeatures.javafeatures.java8.streamapi;

import com.api.java.features.javafeatures.javafeatures.BaseIT;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMap extends BaseIT {
    /**
     * use flatMap() to create a stream from the stream of list.
     */
    @Test
    public void streamFlatMap() {
        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj", "Sunil"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Amit"));
        //flat the stream from List<String> to String stream
        Stream<String> flatStream = namesOriginalList
                .flatMap(strList -> strList.stream());

        flatStream.forEach(System.out::println);
    }
}

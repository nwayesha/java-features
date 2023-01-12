package com.api.java.features.javafeatures.javafeatures.java8.streamapi;

import com.api.java.features.javafeatures.javafeatures.BaseIT;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSorted extends BaseIT {
    @Test
    public void streamSorted() {
        Stream<String> names3 = Stream.of("aBc", "d", "54", "aef", "22", "17");
        List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
        System.out.println("naturalSorted>>> " + naturalSorted); //[123456, aBc, d, ef]

        Stream<String> names2 = Stream.of("aBc", "123", "d", "ef", "78");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("reverseSorted>>> " + reverseSorted); // [ef, d, aBc, 123456]
    }
}

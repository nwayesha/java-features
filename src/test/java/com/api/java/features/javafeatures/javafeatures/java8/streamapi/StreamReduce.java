package com.api.java.features.javafeatures.javafeatures.java8.streamapi;

import com.api.java.features.javafeatures.javafeatures.BaseIT;
import org.testng.annotations.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduce  extends BaseIT {
    /**
     * use reduce() to perform a reduction on the elements of the stream, using an associative accumulation function, and return an Optional.
     */
    @Test
    public void streamReduce() {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);

        Optional<Integer> intOptional = numbers.reduce((i, j) -> {return i*j;});
        if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get()); //120
    }
}

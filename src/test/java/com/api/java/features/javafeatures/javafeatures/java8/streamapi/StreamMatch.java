package com.api.java.features.javafeatures.javafeatures.java8.streamapi;

import com.api.java.features.javafeatures.javafeatures.BaseIT;
import org.testng.annotations.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamMatch extends BaseIT {

    @Test
    public void streamMatch() {
        Stream<Integer> numbers3 = Stream.of(1, 2, 3, 4, 5);
        System.out.println("Stream contains 4? " + numbers3.anyMatch(i -> i == 4));
        //Stream contains 4? true

        Stream<Integer> numbers4 = Stream.of(1, 2, 3, 4, 5);
        System.out.println("Stream contains all elements less than 10? " + numbers4.allMatch(i -> i < 10));
        //Stream contains all elements less than 10? true

        Stream<Integer> numbers5 = Stream.of(1, 2, 3, 4, 5);
        System.out.println("Stream doesn't contain 10? " + numbers5.noneMatch(i -> i == 10));
        //Stream doesn't contain 10? true
    }

    @Test
    public void findFirst(){
        Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa");
        Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
        if(firstNameWithD.isPresent()){
            System.out.println("First Name starting with D="+firstNameWithD.get()); //David
        }
    }
}

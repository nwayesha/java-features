package com.api.java.features.javafeatures.javafeatures.java8.streamapi;

import com.api.java.features.javafeatures.javafeatures.BaseIT;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class GenerateStreams extends BaseIT {
/*
* Generating Streams
* */
    @Test
    public void generateStreams(){
        Stream<Integer> st1 = Stream.of(1, 2, 3, 4, 5);
        //  st1.forEach(p -> System.out.println("new stream - Stream.of " + p));
        Stream<Integer> st2 = Stream.of(new Integer[]{1, 2, 3, 4, 5});
        //  st2.forEach(p -> System.out.println("new stream - Stream.of(array object) " + p));
        // Stream<Integer> st3 = Stream.of(new int[]{1, 2, 3, 4, 5}); // compile error

        Set<Integer> set = new HashSet<Integer>();
        for(int i=1; i<15; i=i+2) set.add(i);

        Stream<Integer> st4 = set.stream();
        // st4.forEach(p -> System.out.println("new stream - Collector stream() " + p));

        Stream<Integer> st5 = set.parallelStream();
        // st5.forEach(p -> System.out.println("new stream - Collector parallelStream() " + p));
        /*we can eassily convert List or Set into Stream using stream(), parallelStream().
        To convert Map into a Stream we can use one of below ways.
        *** convert Map<Key, Value> into Set<Key> using Map.entrySet() method.
        *** convert Map<Key, Value> into Set<Key> using Map.keySet() method.
        *** convert Map<Key, Value> into Set<Value> using Map.values() method.
        * */

        Map<Integer, String> ageNameMap = new HashMap<Integer, String>();
        ageNameMap.put(20,"a");
        ageNameMap.put(17,"b");
        ageNameMap.put(23,"c");

        Stream<Map.Entry<Integer,String>> streamUsingEntrySEtOfMap = ageNameMap.entrySet().stream();
        //streamUsingEntrySEtOfMap.forEach(p -> System.out.println("new stream - EntrySEtOfMap " + p));
        //streamUsingEntrySEtOfMap.forEach(p -> System.out.println("new stream - EntrySEtOfMap key val " + p.getKey() + " --" + p.getValue()));

        Stream<Integer> steamUsingKeyOfMap = ageNameMap.keySet().stream();
       // steamUsingKeyOfMap.forEach(p -> System.out.println("new stream - KeyOfMap " + p));

        Stream<String> steamUsingValueOfMap = ageNameMap.values().stream();
       // steamUsingValueOfMap.forEach(p -> System.out.println("new stream - ValueOfMap " + p));

        Stream<String> st6 = Stream.generate(()->{
            return "abcdef";
        }).limit(3);
       // st6.forEach(p -> System.out.println("new stream - Collector generate() " + p));


        LongStream st7 = Arrays.stream(new long[]{1,2,3,4,5});
        //st7.forEach(p -> System.out.println("new stream - Collector Arrays.stream " + p));


        IntStream st8 = "abcdefg".chars();
        //st8.forEach(p -> System.out.println("new stream - chars " + p));
    }
}

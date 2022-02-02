package com.java.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        streamValues();
    }

    private static void streamValues(){
        Stream<Integer> stream = Stream.of(5,4,3,2,1);
       // stream.forEachOrdered(i->System.out.println(i));

        Stream<Integer> arrayStream = Stream.of(new Integer[]{1,2,3,4,5});
      //  arrayStream.forEach(i -> System.out.println(i));

        Integer[] array = {1,2,3,4,5};
        Stream stream1 = Arrays.stream(array).distinct();
        //filter(i->3>i);
        stream1.forEach(i->System.out.println(i));
        Stream<Integer> arr = Arrays.stream(array);
    }
}

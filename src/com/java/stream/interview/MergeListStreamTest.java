package com.java.stream.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListStreamTest {

    public static void main(String[] args) {
        mergeListStream();
    }

    public static void mergeListStream(){
        List<String> list1 = new ArrayList<String>();
        list1.add("str");
        list1.add("str1");
        list1.add("str2");

        List<String> list2 = new ArrayList<String>();
        list1.add("3");
        list1.add("5");
        list1.add("6");

        Set<String> set = Stream.of(list1,list2,list2).flatMap(lis->lis.stream()).collect(Collectors.toSet());
       // set.stream().forEach(i->System.out.println(i));

        list1.forEach(a->a.toUpperCase());
        //System.out.println(list2);
        Stream.concat(list1.stream(),list2.stream()).forEach(lis->System.out.println(lis));
    }
}

package com.example;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class HelloWorld {
    public static void main( String[] args )
    {
        System.out.println( "Hello World! Mavel PICSOU" );
        System.out.println();
        filtering();
    }


    private static void filtering(){
        Stream.of("3", "2", "3", "4", "2").distinct()
                .forEach(System.out::print);                     //prints: 324

        System.out.println();

        List<String> list = List.of("1", "2", "3", "4", "5", "6", "51", "35", "13", "43", "76");
        list.stream().skip(3).forEach(s -> System.out.print(s +" "));         //prints: 45

        System.out.println();

        list.stream().limit(3).forEach(System.out::print);        //prints: 123

        System.out.println();

        list.stream().filter(s -> Objects.equals(s, "2"))
                .forEach(System.out::print);                   //prints: 2

        System.out.println();

        list.stream().dropWhile(s -> Integer.valueOf(s) < 3)
                .forEach(System.out::print);                      //prints: 345

        System.out.println();

        list.stream().takeWhile(s -> Integer.valueOf(s) < 3)
                .forEach(System.out::print);                      //prints: 12
        System.out.println();
    }
}

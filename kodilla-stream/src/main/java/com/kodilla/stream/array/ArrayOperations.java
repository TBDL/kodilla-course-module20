package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

   static double getAverage(int[] numbers) {

        IntStream.range(1, numbers.length+1)
                .forEach(System.out::println);

        return IntStream.range(1, numbers.length+1)
               .average()
               .getAsDouble();

/*
       OR
       IntStream.rangeClosed(1, numbers.length)
               .forEach(System.out::println);

       return IntStream.rangeClosed(1, numbers.length)
               .average()
               .getAsDouble();
*/


   }

}


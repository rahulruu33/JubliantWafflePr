package com.springboot.BattleField.java8FeaturesComboPack.FunctionalInterface;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerFunctionalIntClass {

    //Define-Bro
    /* represents an operation that takes an input of type T but does not return a result.
    It is typically used for operations like logging, printing, or modifying objects.

    Abstract Method:
            void accept(T t); → Performs an action on the given argument.
    Important Default Method:
            default Consumer<T> andThen(Consumer<? super T> after);
            → Returns a composed Consumer that performs the current operation first and then the after operation.
    Important Static Method:
            None (It does not define any static methods).*/

    public void testMethod(){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        /*Problem 1: Print Elements of a List*/
        Consumer<String> printConsumer = name -> System.out.println(name);
        names.forEach(printConsumer);

        /*Problem 2: Modify Elements of a List*/
        Consumer<String> printModifiedConsumer = name -> System.out.println(name.toUpperCase());
        names.forEach(printModifiedConsumer);

        /*Problem 3: Print Numbers Greater Than a Threshold*/
        List<Integer> CaptainAmericaNumbers = Arrays.asList(23,5,25,33,64,12);
        int threshold = 30;
        Consumer<Integer> checkGreaterThanThreshold = num->{
            if(num>threshold) {
                System.out.println(num);
            }
        };
        CaptainAmericaNumbers.forEach(checkGreaterThanThreshold);

        /*Problem 4: Print Key-Value Pairs of a Map*/
        Map<String , Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("Rahul", 9);
        nameAgeMap.put("Garima", 45);
        nameAgeMap.put("Sweety", 13);
        nameAgeMap.put("ani", 56);

        Consumer<Map.Entry<String, Integer>> printEntry =
                inputMap -> System.out.println(inputMap.getKey() + " -> " + inputMap.getValue());

        nameAgeMap.entrySet().forEach(printEntry);

        Consumer<Integer> printSquare = num -> System.out.println(num * num);
        CaptainAmericaNumbers.forEach(printSquare);

        /*Problem 7: Print Even Numbers*/
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Consumer<Integer> printEven = num -> {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        };

        numbers.forEach(printEven); // Output: 2, 4, 6
    }
    }


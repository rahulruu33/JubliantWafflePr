package com.springboot.BattleField.java8FeaturesComboPack.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFuncIntClass {

    //Define-Bro
    /*Represents a function that takes one argument of type T and returns a boolean (true or false).
    * Abstract Method ->test()
    * Default Method-> and() , negate()   */

    public void testMethod(){

/*        Problem 1: Check if a Number is Even
        Write a Predicate to check if a given integer is even.
        Abstract Method -> test()
        */

    Predicate<Integer> testEvenNumber = num->num%2==0;
        System.out.println(testEvenNumber.test(2));

        List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 7);
        List<Integer>  filteredNumbers = numbers.stream()
                .filter(testEvenNumber)
                .collect(Collectors.toList());

        /*Problem 2: Check if a String is Empty
        Write a Predicate to check if a given string is empty.*/

        Predicate<String> sampleString = String::isEmpty;

        System.out.println(sampleString.test("roseline"));
        System.out.println(sampleString.test(" "));

        /*Problem 3: Filter Numbers Greater Than a Threshold*/
        List<Integer> numbersA = Arrays.asList(1, 2, 3, 4, 5, 6, 11,15,20);
        int threshold = 3;

        Predicate<Integer> GreaterThanThreshold = (num)->num>threshold;
        numbersA.stream()
                .filter(GreaterThanThreshold)
                .forEach(System.out::println);

        /*Problem 4: Combine Predicates
        Write two predicates: one to check if a number is even, and
        another to check if it is greater than 10.
        Combine them using and to find numbers that satisfy both conditions.*/

        Predicate<Integer> checkEvenNumber = num->num%2==0;
        Predicate<Integer> greaterThan10 = num->num>10;
        Predicate<Integer> combineBoth = checkEvenNumber.and(greaterThan10);

        List<Integer> satisfiesBothCondition = numbersA.stream().filter(combineBoth).collect(Collectors.toList());
        satisfiesBothCondition.forEach(System.out::println);

        /*Problem 5: Negate a Predicate
        Write a Predicate to check if a string is not empty, using the negate method.*/

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        System.out.println(isNotEmpty.test("Rahul")); // Output: true
        System.out.println(isNotEmpty.test(""));  // Output: false
    }
}

package com.springboot.BattleField.java8FeaturesComboPack.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorFunctIntClass {

    //Define-Bro
    /*  **Definition of `BinaryOperator` Functional Interface in Java 8**

    The `BinaryOperator<T>` functional interface represents an operation that .
    takes two arguments of the same type `T` and returns a result of type `T`**.
    It is a specialized form of `BiFunction<T, T, T>`.

    **Abstract Method:**
    `T apply(T t1, T t2);` → Applies an operation on two arguments of type `T` and returns a result of type `T`.

    **Important Default Method:**
    **None** (It does not define any default methods).

    **Important Static Method:**
    - `static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator);` → Returns a `BinaryOperator` that returns the smaller of two elements based on the given comparator.
    - `static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator);` → Returns a `BinaryOperator` that returns the larger of two elements based on the given comparator.*/

    public void testMethod(){

        /*Problem 1: Add Two Numbers*/
        BinaryOperator<Integer> add = (a,b)->a+b;
        System.out.println(add.apply(3,5));

        /*Problem 3: Find the Maximum of Two Numbers
        Write a BinaryOperator to find the maximum of two integers.*/
        BinaryOperator<Integer> findMaxNumber = (a, b) -> a > b ? a : b;
        System.out.println(findMaxNumber.apply(6,1));

        /*Problem 4: Concatenate Two Strings
        Write a BinaryOperator to concatenate two strings.*/
        BinaryOperator<String> concatenateString = (a, b) -> a + b;
        System.out.println(concatenateString.apply("Rahul","  RU"));

        /*Problem 5: Combine Two Lists
        Write a BinaryOperator to combine two lists into a single list.*/
        BinaryOperator<List<Integer>> combineList = (list1, list2)->{
            list1.addAll(list2);
            return list1;
        };

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        System.out.println(combineList.apply(list1, list2));

    }
}

package com.springboot.BattleField.java8FeaturesComboPack.FunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorFuncIntClass {
    /*represents an operation that takes a single argument of type T and returns a result of the same type T.
    It is a specialized form of Function<T, T>.

    Abstract Method:
        T apply(T t); → Applies an operation on a single argument of type T and returns a result of type T.
    Important Default Method:
        None (It does not define any default methods).
    Important Static Method:
        static <T> UnaryOperator<T> identity(); → Returns a UnaryOperator that always returns its input argument.*/


    public void testMethod(){
        /*Problem 1: Increment a Number by 1
        Write a UnaryOperator to increment an integer by 1.*/
        UnaryOperator<Integer> increment = num -> num + 1;
        System.out.println(increment.apply(34));

        /*Problem 2: Convert a String to Uppercase
         Write a UnaryOperator to convert a string to uppercase.*/
        UnaryOperator<String> convertToUpperCase = String::toUpperCase;
        System.out.println(convertToUpperCase.apply("murugeshwaran"));

        /*Problem 3: Square a Number
        Write a UnaryOperator to calculate the square of an integer.*/
        UnaryOperator<Integer> convertToSquare = num->num*num;
        System.out.println(convertToSquare.apply(23));

        /*Problem 4: Reverse a String
        Write a UnaryOperator to reverse a string.*/

        UnaryOperator<String> reversalOfString = str -> new StringBuilder(str).reverse().toString();
        System.out.println(reversalOfString.apply("Donald Trump"));

        /*Problem 5: Chain Unary Operators
        Write two UnaryOperator objects: one to increment a number by 1 and another to multiply the result by 2.
        Chain them using andThen.*/

        UnaryOperator<Integer> incrementBy1 = num -> num + 1;
        UnaryOperator<Integer> multiplyBy2 = hh -> hh*2;

//        UnaryOperator<Integer> combineBoth = incrementBy1.andThen(multiplyBy2);
//        System.out.println(combineBoth.apply(5));




    }
}

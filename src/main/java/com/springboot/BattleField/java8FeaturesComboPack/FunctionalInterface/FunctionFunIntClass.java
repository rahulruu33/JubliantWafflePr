package com.springboot.BattleField.java8FeaturesComboPack.FunctionalInterface;

import java.util.function.Function;

public class FunctionFunIntClass {

    //Define-Bro
    /* It represents a function that takes one input of type T and returns a result of type R.
    * It is a single abstract method (SAM) interface with the method R apply(T t), making it a functional interface.
    * Abstract Method ->apply() */

    public void testMethod() {
        /*Problem 1: Convert String to Uppercase*/
        Function<String, String> convertToUpperCase = (name) -> name.toUpperCase();
        System.out.println(convertToUpperCase.apply("rahul"));

        /*Problem 2: Calculate Square of a Number*/
        Function<Integer, Integer> calculateSquare = (num) -> num * num;
        System.out.println(calculateSquare.apply(6));

        /*Problem 3: Chain Functions
        Write two Function objects: one to convert a string to uppercase and another to reverse it. Chain them using andThen.*/

        Function<String, String> convertToUpperCaseStr = (str) -> str.toUpperCase();
        Function<String, String> reverseStr = str -> new StringBuilder(str).reverse().toString();

        Function<String, String> chain = convertToUpperCaseStr.andThen(reverseStr);
        System.out.println(chain.apply("Hello Mr. Annachi"));

        /*Problem 4: Extract First Name from Full Name
        Write a Function to extract the first name from a full name (e.g., "John Doe" → "John").*/

        Function<String, String> extractName = (fullName) -> {
            int spaceIndex = fullName.indexOf(" ");
            return spaceIndex == -1 ? fullName : fullName.substring(0, spaceIndex);
        };

        /*Problem 5: Convert String to Integer
        Write a Function to convert a string to an integer. Handle invalid input by returning null.*/

        Function<String, Integer> convertToInteger = (name) -> {
            try {
                return Integer.parseInt(name);
            } catch (NumberFormatException e) {
                return null;
            }
        };
        System.out.println(convertToInteger.apply("345"));

        /*Problem 6: Bonus - Compose Functions
        Write two Function objects: one to add 10 to a number and another to multiply the result by 2.
        Use compose to apply them in reverse order.*/

        Function<Integer, Integer> addTen = num -> num + 10;
        Function<Integer, Integer> multiplyByTwo = num -> num * 2;

        Function<Integer, Integer> composed = addTen.compose(multiplyByTwo);
        System.out.println("the composed result is " + composed.apply(6));

    }
}

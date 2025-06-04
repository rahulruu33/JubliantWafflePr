package com.springboot.BattleField.java8FeaturesComboPack.StreamsConcept.TerminalOperation;

import java.util.Arrays;
import java.util.List;

public class ReduceClass {
    private void reduceMethod(){
//        🥳 Example 1: Find the Sum of Numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Using reduce to sum up numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
//                .reduce(0, (a, b) -> a + b);

//        🍕 Example 2: Concatenate Strings
        List<String> words = Arrays.asList("I", "love", "Java", "Streams");
        String concatenatedString = words.stream()
                .reduce("", (b, c) -> b + " " + c);
        System.out.println("Sentence: " + concatenatedString.trim());

//        🚀 Example 3: Multiply Numbers
        int num = numbers.stream()
                .reduce(1, (a, b) -> a * b);
    }
}

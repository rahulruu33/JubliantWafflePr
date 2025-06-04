package com.springboot.BattleField.java8FeaturesComboPack.StreamsConcept.IntermediateOperation;

import com.springboot.BattleField.modelsPack.ProductZ;
import com.springboot.BattleField.modelsPack.Student;

import java.util.*;
import java.util.stream.Collectors;

public class SortedConcept {

    private void sortedPractiseMethod(){

        /*💡 Problem 1:
            Given a list of products with name, price, and rating, sort them first by price in ascending order
            and then by rating in descending order.*/

        List<ProductZ> sdsa = new ArrayList<>();
        List<ProductZ> sortedSdsa = sdsa.stream()
                .sorted(
                        Comparator.comparingDouble(ProductZ::getPrice)
                                .thenComparing(Comparator.comparingDouble(ProductZ::getRating).reversed()))
                .collect(Collectors.toList());

        /*💡 Task: Sort a list of integers in ascending order.*/

        List<Integer> numbers = Arrays.asList(7, 2, 9, 4, 5);
        List<Integer> sortedInAsc = numbers.stream()
                .sorted()
//                .sorted(Comparator.naturalOrder()) //it need not be explicitly mentioned ; it is taken as default
                .collect(Collectors.toList());

        /*💡 Task: Sort a list of strings in alphabetical (natural) order.*/

        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "Eve");
        List<String> name1s = Arrays.asList("sfd","sfd");
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        /*💡 Task: Sort a list of strings in reverse alphabetical order.*/
        List<String> sortedNames2 = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        /*💡 Task: Sort the Product list by name in reverse alphabetical order.*/
        List<ProductZ> sortedByName = sdsa.stream()
                .sorted(Comparator.comparing(ProductZ::getName).reversed())
                .collect(Collectors.toList());

        /*💡 Task: Sort a list of strings, placing null values first.
        Use Comparator.nullsFirst().*/
        List<String> sortedNamesE = names.stream()
                .sorted(Comparator.nullsFirst(Comparator.naturalOrder()))
                .collect(Collectors.toList());

        /* Problem 8 (Hard)
        💡 Task: Sort a list of Student objects by their marks in descending order.
        Place null students last.*/
        List<Student> sdsaf = new ArrayList<>();
        sdsaf.stream()
                .sorted(Comparator.nullsLast(Comparator.comparingInt(Student::getScore).reversed()));

        /*Problem 9 (Hard)
        💡Task: Sort a list of numbers, placing even numbers first (ascending) and odd numbers after them (also ascending).*/
        List<Integer> numbersV = Arrays.asList(7, 2, 9, 4, 5, 8);
        List<Integer> numbersFV = numbersV.stream()
                .sorted(Comparator.comparingInt((Integer n)->n%2)
                        .thenComparing(n->n))
                .collect(Collectors.toList());


        /*Practice Problems 🧠 for distinct()*/
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        List<String> distinctNames = names.stream()
                .distinct()
                .collect(Collectors.toList());

        List<Integer> numbersE = Arrays.asList(10, 20, 30, 40, 50, 60);

        List<Integer> result = numbersE.stream()
                .skip(2) // Skip the first 2 elements
                .limit(3) // Take the next 3 elements
                .collect(Collectors.toList());

        System.out.println(result); // Output: [30, 40, 50]


        Optional<Integer> first = numbers.stream()
                .findFirst();

        System.out.println(first.orElse(-1)); // Output: 10

        Optional<String> firstWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .findFirst();

        System.out.println(firstWithA.orElse("No match")); // Output: Alice

        Optional<String> resultW = names.stream()
                .findAny();

        System.out.println(resultW.orElse("No name found")); // Output: Alice (or any other name)



    }
}

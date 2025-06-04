package com.springboot.BattleField.java8FeaturesComboPack.StreamsConcept.StreamsPractisePack;


import com.springboot.BattleField.modelsPack.Employee3;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsPractiseClass {

    List<Employee3> employee3s = Arrays.asList(
            new Employee3("Alice", 30, 60000, "HR"),
            new Employee3("Bob", 35, 75000, "IT"),
            new Employee3("Charlie", 28, 50000, "HR"),
            new Employee3("David", 40, 90000, "Finance"),
            new Employee3("Eve", 25, 55000, "IT"));

    public void testMethod(){


    /*Find the first non-repeated character in a string using streams.
        📝 Input: "swiss" → Output: 'w'*/
        String wonderfulCountry = "swiss";
        Character firstNonRepeatedCharacter = wonderfulCountry.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> wonderfulCountry.chars().filter(ch -> ch == c).count() == 1)
                .findFirst()
                .orElse(null);

        System.out.println("First non-repeated character: " + firstNonRepeatedCharacter);

    /*Filter out all even numbers from a list and calculate the sum of the remaining odd numbers.
        📝 Input: [1, 2, 3, 4, 5] → Output: 9*/

        //approach 1

        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> oddNumbersList = numbersList.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        int sumOfNumbers = oddNumbersList.stream()
                .mapToInt(Integer::intValue)
                .reduce(0,Integer::sum);

        int sumOfNumbersG = oddNumbersList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        //approach 2
        int sumOfPOddNumbers = numbersList.stream()
                .filter(num -> num % 2 != 0)
                .reduce(0, Integer::sum);

   /*3. Group a list of employees by their department using streams.
   📝 Input: `List<Employee>` → Output: `Map<String, List<Employee>>*/

        Map<String, List<Employee3>> depMap = employee3s.stream()
                .collect(Collectors.groupingBy(Employee3::getDept));


/*        4. **Sort a list of strings by their length in descending order.**
   📝 Input: `["apple", "bat", "zebra"]` → Output: `["zebra", "apple", "bat"]`*/

        List<String> randomWords = Arrays.asList("apple", "bat", "zebra");
        List<String> sortedWords = randomWords.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        sortedWords.forEach(System.out::println);

    /*5. **Count the number of strings in a list that start with a specific letter.**
   📝 Input: `["apple", "banana", "apricot", "cherry"], letter = 'a'` → Output: `2`*/

        List<String> randomWordsO = Arrays.asList("apple", "banana", "apricot", "cherry");
        long numberOfWordsStartsWith = randomWordsO.stream()
                .filter(word -> word.startsWith("a")).count();



    /*  6. **Find the maximum number from a list of integers using streams.**
   📝 Input: `[15, 22, 7, 9]` → Output: `22`*/

        List<Integer> numbersListK = Arrays.asList(15, 22, 7, 9);
        int maxNumberFromLists = numbersListK.stream().max(Comparator.naturalOrder()).orElse(0);

        /*7. **Convert a list of strings to uppercase and join them with a comma.**
   📝 Input: `["java", "stream", "example"]` → Output: `"JAVA,STREAM,EXAMPLE"`*/


        List<String> randomWordsW = Arrays.asList("java", "stream", "example");
        String convertedString = randomWordsW.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(convertedString);



    /*8. **Create a map of word frequencies from a list of words.**
   📝 Input: `["apple", "banana", "apple", "cherry"]` → Output: `{apple=2, banana=1, cherry=1}`    */
/*INCOMPLETE*/

        List<String> randomWordsWe = Arrays.asList("apple", "banana", "apple", "cherry");
        Map<String, Long> wordFrequencyMap = randomWordsWe.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordFrequencyMap);

        Map<String, Integer> wordFrequencyMapAlt = randomWordsWe.stream()
                .collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));

        System.out.println(wordFrequencyMapAlt); // Output: {apple=2, banana=1, cherry=1}




    /*9. **Check if all elements in a list are greater than a given number using streams.**
   📝 Input: `[10, 20, 30], number = 5` → Output: `true`*/

        List<Integer> listyNumbers = Arrays.asList(10, 20, 30);
        boolean allMatchTheCriteria = listyNumbers.stream()
                .allMatch(num -> num > 5);


    /*10. **Flat-map a list of lists into a single list of integers.**
    📝 Input: `[[1, 2], [3, 4], [5]]` → Output: `[1, 2, 3, 4, 5]`*/


        List<List<Integer>> listOfNumbers = Arrays.asList(
                Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5,8,9)
        );

        List<Integer> combinedList = listOfNumbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());



/*        11. **Find the longest word in a list of strings using streams.**
    📝 Input: `["sun", "moon", "galaxy"]` → Output: `"galaxy"`*/

        List<String> randomWordsOe = Arrays.asList("sun", "moon", "galaxy");
        String longestString = randomWordsOe.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst()
                .orElse(null);

        //approach 2
        String longestStringE = randomWordsOe.stream().max(Comparator.comparing(String::length))
                .orElse(null);


        /*12. **Partition a list of integers into even and odd numbers using streams.**
    📝 Input: `[1, 2, 3, 4, 5]` → Output: `{even=[2, 4], odd=[1, 3, 5]}`*/

        //approach 1

        List<Integer> numersH = Arrays.asList(1, 2, 3, 4, 5,3,7,4);
        Map<Boolean, List<Integer>>hahaMap = numersH.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));


        //approach 2
        Map<String, List<Integer>> hahaGroupedMap = numersH.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "even" : "odd"));



                /*13. **Calculate the average of a list of integers using streams.**
    📝 Input: `[4, 8, 15, 16]` → Output: `10.75`*/


        double averageValueIs= numersH.stream().mapToInt(Integer::intValue).average().orElse(0.0);


/*        14. **Find duplicate elements in a list using streams.**
    📝 Input: `[1, 2, 3, 1, 4, 3]` → Output: `[1, 3]`*/

        List<Integer> numersL = Arrays.asList(1, 2, 3, 4, 5,3,7,4);
        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = numersL.stream()
                .filter(num -> !seen.add(num))   //seen.add(num) returns false if the element already exists in the set
                .collect(Collectors.toList());


        /*15. **Sort a map by its values in ascending order using streams.**
    📝 Input: `{a=3, b=1, c=2}` → Output: `{b=1, c=2, a=3}`*/

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 3);
        map.put("b", 1);
        map.put("c", 2);

        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()) // Sort by values
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, // Merge function (not needed here)
                        LinkedHashMap::new // Use LinkedHashMap to maintain order
                ));

        System.out.println("Sorted Map: " + sortedMap);

    }
}

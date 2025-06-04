package com.springboot.BattleField.java8FeaturesComboPack;

import java.util.*;
import java.util.stream.Collectors;

public class Java8FeaturesPractiseClass {

 public void practiseProblems1() {
         /*
            1️⃣ Filter and Collect
                    Problem:
                    Given a list of integers, filter out the even numbers and collect them into a new list.

                    Example Input:
                    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                    Expected Output:
                    [2, 4, 6, 8, 10]

            */
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     List<Integer> filteredNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
     System.out.println(filteredNumbers);

        /*
        2️⃣ Find the Longest String
                Problem:
                Given a list of strings, find the longest string using streams.

                Example Input:
                List<String> words = Arrays.asList("apple", "banana", "grape", "watermelon", "kiwi");

                Expected Output:
                "watermelon"
        * */

     List<String> words = Arrays.asList("apple", "banana", "grape", "watermelon", "kiwi");
     String longestString = words.stream()
             .max((str1, str2)-> Integer.compare(str1.length(), str2.length())).orElse(null);
     String longestString2 = words.stream()
             .max(Comparator.comparingInt(String::length)).orElse(null);
     System.out.println(longestString2);

     words.stream().max(Comparator.comparingInt(String::length)).orElse(null);
     String longestString23 = words.stream().max(Comparator.comparingInt(String::length)).orElse(null);


     /*
        3️⃣ Group by Starting Letter
            Problem:
            Given a list of words, group them by their starting letter.

            Example Input:
            List<String> words = Arrays.asList("apple", "ant", "banana", "ball", "cat", "car");

            Expected Output:
            {a=[apple, ant], b=[banana, ball], c=[cat, car]}
     * */

     List<String> niceWords = Arrays.asList("apple", "ant", "banana", "ball", "cat", "car");
     Map<String , List<String>> mappedWithFirstLetterMap =niceWords.stream()
             .collect(Collectors.groupingBy(word -> String.valueOf(word.charAt(0))));

     Map<String , List<String>> mappedWithFirstLetterMap1 =niceWords.stream()
             .collect(Collectors.groupingBy(word -> String.valueOf(word.charAt(0))));

     /*

     4️⃣ Find the Average
            Problem:
            Given a list of integers, calculate the average of the numbers using streams.

            Example Input:
            List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

            Expected Output:
            30.0
     * */

     List<Integer> numbersT = Arrays.asList(10, 20, 30, 40, 50);
     double ssd = numbersT.stream()
             .mapToInt(Integer::intValue)  // Convert to IntStream
             .average()  // Find average
             .orElse(0.0);  // Handle empty list case


     System.out.println("the average of numbers is " + ssd);

     /*
     5️⃣ Sort and Limit
            Problem:
            Given a list of integers, sort them in descending order and retrieve the top 3 numbers.

            Example Input:
            List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 12, 7);

            Expected Output:
            [12, 9, 8]
     * */

     List<Integer> numbersY = Arrays.asList(5, 3, 8, 1, 9, 12, 7);
     numbersY.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());


     // 1.filterOutEvenNumbers
     List<Integer> numberList = new ArrayList<>(Arrays.asList(12,34,45,45));
     Collections.addAll(numberList, 12, 13, 14, 15, 76);

     List<Integer> filteredEvenNumbers = numberList.stream()
             .filter(n->n%2==0)
             .collect(Collectors.toList());

     // 2. Convert List of Strings to Uppercase
     List<String> avengersList = new ArrayList<>(Arrays.asList("CaptainAmerica", "TonyStark", "Thor"));
     List<String> upperCaseAvengers = avengersList.stream()
                                      .map(String::toUpperCase).collect(Collectors.toList());

     //other option
     avengersList.stream().map(n-> n.toUpperCase()).collect(Collectors.toList());
     System.out.println("CaseConverted avengersList"+upperCaseAvengers);


     // 3.Find the Maximum Number
     List<Integer> numberList1 = new ArrayList<>(Arrays.asList(12,34,45,45));
     Optional<Integer> maxNumber = numberList1.stream().max(Comparator.naturalOrder());
     maxNumber.ifPresentOrElse(max-> System.out.println("max value is "+ max),()-> System.out.println("list is empty"));

     // 4. Calculate Sum of Squares
     List<Integer> numberLists3 = new ArrayList<>(Arrays.asList(1, 3, 2, 5, 4));
     int sumOfNumbersSquared = numberLists3.stream().map(n -> n * n).reduce(0, Integer::sum);

     //option 2
     int sumOfNumbersSquared2  = numberLists3.stream().mapToInt(j -> j * j).sum();
     System.out.println("Sum of number squared "+sumOfNumbersSquared);
     System.out.println("Sum of number squared "+sumOfNumbersSquared2);

     // 5. Sort and Collect Strings
     List<String> gotHouseList = new ArrayList<>(Arrays.asList("Stark", "Targaryen","Lannister"));
     List<String> sortedHouseList = gotHouseList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
     List<String> reverseSortedList = gotHouseList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
     System.out.println("Un sorted list"+gotHouseList);
     System.out.println("sorted list"+sortedHouseList);
     System.out.println("reverse sorted list"+reverseSortedList);

     // 6. Filter and Count
     List<Integer> numbersList = new ArrayList<>(Arrays.asList(11, 42, 5, 26, 7, 9));
     List<Integer> filteredNumbers2 = numbersList.stream().filter(n->n>10).collect(Collectors.toList());
     int count = filteredNumbers2.size();
     System.out.println("total count of number greater than 10 is "+count);

     // 7. Group Strings by Length
     List<String> coloursString = new ArrayList<>();
     Collections.addAll(coloursString, "red", "blue", "pink", "ghe", "black", "white");
     Map<Integer , List<String>> groupedBySizeMap = coloursString.stream().collect(Collectors.groupingBy(String::length));
     System.out.println(groupedBySizeMap);

     // 8. Find First Element Matching a Condition
     List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(5, 15, 30, 20, 34));
     Optional<Integer>number3 = listOfNumbers.stream().filter(n -> n > 20).findFirst();
     number3.ifPresent(n-> System.out.println("the first number which is greater than 20 is "+n));

     //9. Generate a List of Unique Characters
     List<String> listOfStrings = new ArrayList<>();
     Collections.addAll(listOfStrings, "one", "two", "three");
     List<Character>dsf =listOfStrings.stream()
             .flatMap(word -> word.chars().mapToObj(c -> (char) c))
             .distinct()
             .collect(Collectors.toList());

     // 10. Calculate Average of Numbers
     List<Integer> numbersList2 = new ArrayList<>(Arrays.asList(11, 42, 5, 26, 7, 9));
     OptionalDouble  average = numbersList2.stream().mapToInt(Integer::intValue).average();
     average.ifPresent(System.out::println);
     average.ifPresent(System.out::println);

     List<Integer> numbers22 = Arrays.asList(5, 3, 8, 2, 9);

     int maxNumbersd = numbers22.stream()
             .max(Integer::compareTo)
             .orElseThrow(() -> new RuntimeException("List is empty!"));

     System.out.println("Maximum Number: " + maxNumbersd);
 }
}

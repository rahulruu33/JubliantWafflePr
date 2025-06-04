package com.springboot.BattleField.java8FeaturesComboPack.StreamsConcept.IntermediateOperation;



import com.springboot.BattleField.modelsPack.Employee1;
import com.springboot.BattleField.modelsPack.Customer;
import com.springboot.BattleField.modelsPack.Movie;
import com.springboot.BattleField.modelsPack.Student;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterConcept {
    List<String> stringList = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Employee1> employee1s = Arrays.asList(
            new Employee1("Alice", 70000),
            new Employee1("Bob", 50000),
            new Employee1("Charlie", 65000),
            new Employee1("David", 45000)
    );

    List<Student> testList= Arrays.asList(
            new Student(" Halamithi habibo", Arrays.asList(1,3,4)),
            new Student(" Halamithi habibo", Arrays.asList(1,3,4))
    );

    List<String> words = Arrays.asList("level", "radar", "world", "hello", "civic", "java");
    List<Student> students = Arrays.asList(
            new Student("Alice", Arrays.asList(85, 90, 78)),
            new Student("Bob", Arrays.asList(40, 60, 45)),
            new Student("Charlie", Arrays.asList(88, 92, 96)),
            new Student("David", Arrays.asList(70, 50, 65))
    );
    List<String> wordsy = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date", "elderberry");
    List<Integer> numbersy = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

    List<Customer> customers = Arrays.asList(
            new Customer("Alice", 28, "Premium"),
            new Customer("Bob", 34, "Standard"),
            new Customer("Charlie", 40, "Premium"),
            new Customer("David", 25, "Standard"),
            new Customer("Eve", 30, "Premium")
    );

    List<String> wordso = Arrays.asList("elephant", "dog", "cat", "umbrella", "eagle", "owl");

    List<Movie> movies = Arrays.asList(
            new Movie("Inception", 2010, 8.8),
            new Movie("Titanic", 1997, 7.8),
            new Movie("The Dark Knight", 2008, 9.0),
            new Movie("The Godfather", 1972, 9.2),
            new Movie("Interstellar", 2014, 8.6)
    );

    private static boolean isPrime(int n) {
        if (n <= 1) return false; // Not prime if <= 1
        for (int i = 2; i <= Math.sqrt(n); i++) { // Check divisors up to √n
            if (n % i == 0) return false; // Divisible by i -> Not prime
        }
        return true; // Otherwise, it's prime
    }

    public void filterPractiseMethod(){

        Predicate<Integer> isEvenCheck = (a)-> a%2==0;
//        💡Question 1: Filter Even Numbers (Easy)
        List<Integer> evenNumberList = numbers.stream()
                .filter(isEvenCheck)
                .collect(Collectors.toList());

//        💡Question 2: Filter Strings Starting with 'A' (Easy)
        List<String> wordsStartsWithA = stringList.stream()
                .filter(word -> word.startsWith("A"))
                .collect(Collectors.toList());

//        💡Question 3: Filter Employees Earning Above 60k (Medium)
        List<String> employeeEarningAbove60k = employee1s.stream()
                .filter(emp -> emp.getEsalary() > 60000)
                .map(Employee1::getEname)
                .collect(Collectors.toList());

//        💡Question 4: Filter Palindromic Strings (Medium)
        List<String> filteredPalindromicStrings = words.stream()
                .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());

//        💡Question 5: Filter Students Passing All Subjects (Medium)
        List<String> passedStudents = students.stream()
                .filter(std -> std.getScores().stream().allMatch(score->score>=50))
                .map(Student::getName)
                .collect(Collectors.toList());

//        💡Question 6: Filter Unique Words in a List (Medium)
        List<String> uniqueWords2 = words.stream()
                .distinct()
                .collect(Collectors.toList());

//       💡 Question 7: Filter Prime Numbers (Difficult)
        List<Integer> primeNumbers = numbers.stream()
                .filter(FilterConcept::isPrime) // Pass each number to isPrime()
                .collect(Collectors.toList());

        System.out.println("Prime Numbers: " + primeNumbers);
        // Output: Prime Numbers: [11, 13, 17, 19]

//          💡Question 8: Filter Customers Based on Multiple Conditions (Difficult)
//        Task: Filter customers who are older than 30 and have a "Premium" membership.
        List<String> PremiumCustomers = customers.stream()
                .filter(cust -> cust.getAge() > 30)
                .filter(cust -> cust.getMembershipType().equals("Premium"))
                .map(Customer::getName)
                .collect(Collectors.toList());

//        💡 Question 9: Filter Words Containing Specific Characters (Difficult)
//              Task: Use filter() to extract words that contain the letter 'e' and are longer than 4 characters.
        List<String> wordsWithE = wordso.stream()
                .filter(word->word.contains("e") && word.length()>4)
                .collect(Collectors.toList());

//        💡 Question 10: Filter Movies Released After 2000 with High Ratings (Difficult)
//            Task: Filter movies released after the year 2000 with a rating greater than 8.5.

        List<String> highRatedMovies = movies.stream()
                .filter(m -> m.getReleasedYear() > 2000 && m.getRating() > 8.5)
                .map(Movie::getName)
                .collect(Collectors.toList());

    }



}

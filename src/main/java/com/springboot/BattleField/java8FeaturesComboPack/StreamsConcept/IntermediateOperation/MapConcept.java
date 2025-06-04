package com.springboot.BattleField.java8FeaturesComboPack.StreamsConcept.IntermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import com.springboot.BattleField.modelsPack.Employee3;
import com.springboot.BattleField.modelsPack.Product;
import com.springboot.BattleField.modelsPack.Student;

public class MapConcept {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    List<String> words = Arrays.asList("hello", "world", "java", "streams");
    List<Employee3> employee3s = Arrays.asList(
            new Employee3("Alice", 30, true),
            new Employee3("Bob", 25, true),
            new Employee3("Charlie", 35, true)
    );
    List<Employee3> employees1 = Arrays.asList(
            new Employee3("Alice", 72000),
            new Employee3("Bob", 48000),
            new Employee3("Charlie", 60000)
    );

    List<String> wordsv = Arrays.asList("apple", "banana", "cherry", "date");

    List<List<Integer>> nestedLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8, 9)
    );

    List<Student> students = Arrays.asList(
            new Student("John", 85),
            new Student("Alice", 90),
            new Student("Bob", 75)
    );

    List<String> names = Arrays.asList("John Doe", "Jane Smith", "Alice Wonderland");


    List<Product> products = Arrays.asList(
            new Product("Laptop", 2, 750),
            new Product("Mouse", 5, 20),
            new Product("Keyboard", 3, 50)
    );



    private void practiseMethod(){

/*        Question 1: Convert Numbers to Strings (Easy)
                💡 Task: Use map() to convert each number into its string representation.
        Example Output: ["1", "2", "3", "4", "5"]*/

        List<String> hiThereBuddy = numbers.stream()
                .map(Object::toString)
                .collect(Collectors.toList());

/*        Question 2: Convert Strings to Uppercase (Easy)
        💡 Task: Use map() to convert all strings in the list to uppercase.
                Example Output: ["HELLO", "WORLD", "JAVA", "STREAMS"]     */

        List<String> convertedWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

/*        Question 4: Extract Employee Names (Medium)
        💡 Task: Use map() to extract only the names of employees into a list.
        Example Output: ["Alice", "Bob", "Charlie"]*/

        List<String> employeeNames = employee3s.stream()
                .map(Employee3::getName)
                .collect(Collectors.toList());


/*        Question 5: Calculate Monthly Salaries (Medium)
        💡 Task: Use map() to calculate the monthly salary for each employee (divide annual salary by 12).
        Example Output: [6000.0, 4000.0, 5000.0]*/


        List<Double> avgSalary = employees1.stream()
                .map(emp->emp.getAnnualSalary()%12.0)
//                .map(emp->emp.doubleValue()) -> the same is happening in the bottom LOC
//                .map(Integer::doubleValue)
                .collect(Collectors.toList());

/*        Question 6: Find Word Lengths (Medium)
        💡 Task: Use map() to create a list of word lengths.
                Example Output: [5, 6, 6, 4]*/

        List<Integer> lengthOfStrings = wordsv.stream()
                .map(String::length)
                .collect(Collectors.toList());

/*        Question 7: Transform Nested Lists (Medium)
        💡 Task: Use map() to calculate the sum of each nested list.
        Example Output: [6, 9, 30]*/

        List<Integer> sumOfNums = nestedLists.stream()
                .map(list -> list.stream().mapToInt(Integer::intValue).reduce(0,Integer::sum))
//                .map(list -> list.stream().mapToInt(Integer::intValue).reduce(0,(a, b)->a+b))
                .collect(Collectors.toList());

//        Question 8: Append Suffix to Names (Medium)
  /*      💡 Task: Use map() to append " (Passed)" to students who scored more than 80, otherwise append " (Failed)".
                Example Output: ["John (Passed)", "Alice (Passed)", "Bob (Failed)"]*/


        List<String> suffixedNames = students.stream()
                .map(a -> a.getScore() > 80 ? a.getName() + " (passed)" : a.getName() + " (failed)")
                .collect(Collectors.toList());

/*        Question 9: Transform to Initials (Difficult)
            //🚀MUST_REVISE_STREAMS🚀
              💡Task: Use map() to convert each name into its initials.
                Example Output: ["J.D.", "J.S.", "A.W."]*/

        List<String>  extractedInitials = names.stream()
                .map(name->{
                    String[] parts = name.split(" ");
                            return Arrays.stream(parts)
                                    .map(part->part.substring(0,1).toUpperCase())
                                    .collect(Collectors.joining("."))+".";
                })
                .collect(Collectors.toList());

/*        Question 10: Convert Product List to Total Cost (Difficult)
                💡 Task: Use map() to calculate the total cost of each product (quantity * price).
                Example Output: [1500, 100, 150]*/
        //🚀MUST_REVISE_STREAMS🚀

        List<Integer> totalCostList = products.stream()
                .map(product ->(int)product.getPrice() * product.getQuantity())
                .collect(Collectors.toList());

    }

}

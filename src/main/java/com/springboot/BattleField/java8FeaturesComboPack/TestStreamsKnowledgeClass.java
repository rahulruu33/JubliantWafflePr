package com.springboot.BattleField.java8FeaturesComboPack;

import com.springboot.BattleField.modelsPack.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;

import com.springboot.BattleField.modelsPack.Transaction;

public class TestStreamsKnowledgeClass {

    public void testMethod(){
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 60000.0, "IT"),
                new Employee(2, "Bob", 48000.0, "HR"),
                new Employee(3, "Charlie", 75000.0, "Finance"),
                new Employee(4, "David", 52000.0, "IT"),
                new Employee(5, "Eve", 90000.0, "HR")
        );

        List<String> highPayedIndividuals = employees.stream()
                .filter(emp -> emp.getSalary() > 50000.0)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(highPayedIndividuals);
        highPayedIndividuals.forEach(System.out::println);

        /*Problem 2*/
        /*Your Task:
        1️⃣ Filter transactions where the amount is greater than 10,000.
        2️⃣ Group them by category (e.g., "Shopping", "Electronics", "Food").
        3️⃣ Find the total sum of amounts for each category.
        4️⃣ Sort the categories by total amount in descending order.
        5️⃣ Store the results in a LinkedHashMap<String, Double> to maintain order.*/

        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 12000.0, "Shopping", LocalDate.of(2024, 2, 1)),
                new Transaction(2, 8000.0, "Food", LocalDate.of(2024, 2, 2)),
                new Transaction(3, 15000.0, "Electronics", LocalDate.of(2024, 2, 3)),
                new Transaction(4, 5000.0, "Food", LocalDate.of(2024, 2, 4)),
                new Transaction(5, 20000.0, "Shopping", LocalDate.of(2024, 2, 5)),
                new Transaction(6, 11000.0, "Electronics", LocalDate.of(2024, 2, 6))
        );

        List<Transaction> filteredTransactions = transactions.stream()
                .filter(trans -> trans.getAmount() > 10000.0)
                .collect(Collectors.toList());

        Map<String , Double> categoryWiseSum = filteredTransactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCategory, Collectors.summingDouble(Transaction::getAmount) ));


        List<Map.Entry<String, Double>> listOfCategoryWiseSum = new ArrayList<>(categoryWiseSum.entrySet());
        listOfCategoryWiseSum.sort(Map.Entry.<String, Double>comparingByValue().reversed());

        // Step 4: Store the results in a LinkedHashMap to maintain order
        LinkedHashMap<String, Double> result = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : listOfCategoryWiseSum) {
            result.put(entry.getKey(), entry.getValue());
        }

        // Print the result
        result.forEach((category, totalAmount) ->
                System.out.println("Category: " + category + ", Total Amount: " + totalAmount)
        );

    }
}

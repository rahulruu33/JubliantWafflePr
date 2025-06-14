package testPackage;

import java.util.Arrays;
import java.util.List;

public class LisbonDutyCalls {

    public void testMethod() {
        // This is a test method in LisbonDutyCalls
        System.out.println("LisbonDutyCalls: testMethod executed");
    }

    public void anotherTestMethod() {
        // Another test method in LisbonDutyCalls
        System.out.println("LisbonDutyCalls: anotherTestMethod executed");
    }

    //writr me a method that prints the last 5 characters of a string
    public void printLastFiveCharacters(String input) {
        if (input != null && input.length() >= 5) {
            String lastFive = input.substring(input.length() - 5);
            System.out.println("Last five characters: " + lastFive);
        } else {
            System.out.println("Input string is too short or null.");
        }
    }

    // Write a method that checks if a input country is a neighboring country of Portugal
    public boolean isNeighboringCountry(String country) {
        // List of neighboring countries of Portugal
        List<String> neighboringCountries = Arrays.asList("Spain", "Andorra", "France");

        // Check if the input country is in the list of neighboring countries
        return neighboringCountries.contains(country);
    }
}

package com.springboot.BattleField.PopularInterviewProblems;

public class campusArea     {
    String newWorld = "EEE THE MARS";

    public void toPractiseStringMethod(){
/*        🚀 Reverse a String
        Write a program to reverse a given string without using built-in reverse functions.*/

//        String newWorld = "THE MARS";
        String reverseString = "";
        for (int i = newWorld.length()-1 ; i>=0; i--){
            reverseString = String.valueOf(newWorld.charAt(i));
        }
        System.out.println(reverseString);

        /* 🚀  Check if a String is a Palindrome
            Determine if the given string reads the same forward and backward. Ignore case and spaces.*/
        if(newWorld.equalsIgnoreCase(reverseString)){
            System.out.println("Given string is palindrome");
        }

        /*🚀 Count Vowels and Consonants in a String
            Count the number of vowels and consonants in a given string.*/

        StringBuilder vowels = new StringBuilder();
        StringBuilder constants = new StringBuilder();
        for(int i = 0 ; i<newWorld.length()-1 ; i++){
            if(newWorld.charAt(i) == 'a' || newWorld.charAt(i) == 'e' || newWorld.charAt(i) == 'i' ){
                vowels.append(newWorld.charAt(i));
            }
            else{
                constants.append(newWorld.charAt(i));
            }
        }
        System.out.println("the number of vowels present is "+ vowels.length());
        System.out.println("the number of constants present is "+ constants.length());

    }

    public Object findNonRepeating(){
        /* Find the First Non-Repeating Character in a String
        Identify the first character in the string that does not repeat. Return -1 if all characters repeat.*/
        Character one;
        char two;
        boolean repeat = false;
        for(int i = 0 ; i<= newWorld.length()-1; i++){
            one = newWorld.charAt(i);
            two = newWorld.charAt(i+1);
            if(!one.equals(two)){
                System.out.println("the first non repeating character is"+ newWorld.charAt(i+1));
                repeat = true;
                return null;
            }
        }
        if(repeat){
            return -1;
        }
        return null;
    }

//    public void sampleMethod(){
//        Employee e1 = new Employee("Alice", 1, 5000);
//        Employee e2 = new Employee("Bob", 2, 7000);
//        Employee e3 = new Employee("Charlie", 3, 6000);
//        List<Employee> employeeList = new ArrayList<>();
//
//        Collections.addAll(employeeList, e1, e2, e3);
//        employeeList.stream().sorted(Comparator.comparing(Employee::getEsalary).reversed())
//                .collect(Collectors.toList());
//
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
//
//        String sdfsd = new String("hhh");
//        int sds = sdfsd.compareTo("sdfs");
//
//        // Using Stream and Lambda Expression
//        List<String> sortedNames = names.stream()
//                .sorted((a, b) -> b.compareTo(a)) // Sort in reverse order
//                .collect(Collectors.toList());
//
//        System.out.println("Sorted Names: " + sortedNames);
//    }


}

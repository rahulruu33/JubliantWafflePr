package com.springboot.BattleField.PopularInterviewProblems;

import com.springboot.BattleField.modelsPack.Employee2;
import com.springboot.BattleField.modelsPack.Employee3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CompaniesPracticeQuestions {
    /*🌈✨Print num of occurrences of each character in a given string. - CGI L1 (4, also in EY L1, Boeing L1, CGI L1 Round)*/

    public void printNoOfOccuranceOfEachChar(String str){
        char[] newCharArray = str.toLowerCase().trim().toCharArray();
        System.out.println(newCharArray);
        HashMap<Character , Integer> freMap = new HashMap<>();
        for(char ch : newCharArray){
            freMap.put(ch, freMap.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character , Integer> entry : freMap.entrySet() ){
            if(Character.isSpaceChar(entry.getKey())){
                System.out.println("Empty Space Present is  -> "+entry.getValue());
            }
            else{
            System.out.println(entry.getKey()+" -> "+entry.getValue());
            }
        }
    }

    /*🌈✨Print 2nd character of each string in a given list of strings. - CGI L1 (1)*/
    public void printSecondCharOfEachString(List<String> ScientistList){

        //method 1
        ScientistList.stream()
                .filter(str -> str != null && str.length() > 2)
                .map(str -> str.charAt(1))
                .forEach(System.out::println);

        //method 2
        try {
            for (String str : ScientistList) {
                char[] charArrayOfStr = str.toCharArray();
                if (charArrayOfStr.length > 1) {
                    System.out.println("Second Character of " + str + " is   " + charArrayOfStr[1]);
                } else {
                    System.out.println("The " + str + " does not contain second character");
                }
            }
        }catch (Exception e){
            System.out.println("Exception caught is "+e.getMessage());
        }

        // Method 3: More verbose but explicit
        ScientistList.stream()
                .filter(str -> str != null && str.length() >= 2)
                .map(str -> {
                    char[] chars = str.toCharArray();
                    return chars[1];
                })
                .forEach(System.out::println);
    }

    /*🌈✨How do you merge two unsorted arrays into single sorted array without duplicate*/
    public void mergeAndSortArray(int[] array1, int[] array2){

        //Method 1
        int[] mergedArray = new int[array1.length + array2.length];
        int count = 0;
        for(int i : array1 ){
            mergedArray[count] = i;
            count++;
        }
        for(int i : array2){
            mergedArray[count] = i;
            count++;
        }
        Arrays.stream(mergedArray).distinct().sorted().forEach(System.out::println);
        System.out.println("Total Length of distinct elements is "+Arrays.stream(mergedArray).distinct().sorted().count());

        //Method 2
        List<int[]> mergedArrays = Arrays.asList(array1, array2);
        int [] finalArray = mergedArrays.stream().flatMapToInt(ma-> Arrays.stream(ma)).distinct().sorted().toArray();
        System.out.println(finalArray.length);
        System.out.println(Arrays.toString(finalArray));
    }

    /*🌈✨Given a String, find the first non-repeated character in it using Stream functions?*/
    public void findNonRepeatedCharInString(String str){
        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            frequencyMap.put(str.charAt(i), frequencyMap.getOrDefault(str.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry :frequencyMap.entrySet() ){
            if(entry.getValue()==1){
                System.out.println("The first non repeating character is "+entry.getKey());
                return;
            }
//            System.out.println(entry.getKey() +" -> "+entry.getValue());
        }
        System.out.println("sdfdsg");
        System.out.println("sdsd");

    }

    /*🌈✨Sort the below given code?
        Set<Integer> set =  Collections.unmodifiableSet(new HashSet<Integer>
        (Arrays.asList({ 51, 62, 72, 80, 11, 21, 3, 4, 33 }))); */
    public void sortTheSet(){
        Set<Integer> set =  Collections.unmodifiableSet(new HashSet<Integer>(Arrays.asList( 51, 62, 72, 80, 11, 21, 3, 4, 33 )));
        set.stream().sorted().forEach(System.out::println);
    }

    /*🌈✨Print num of occurrences of each word in a given list of string.*/
    public void countOccuranceOfWords(List<String> strList){

/*        List<String> transformedString =  strList.stream().map(String::toLowerCase).collect(Collectors.toList());
        HashMap<String , Integer> frequencyMap = new HashMap<>();
        for(String str : transformedString){
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }*/

        HashMap<String, Integer> frequencyMap = new HashMap<>();
        strList.stream()
                .map(String::toLowerCase)
                .forEach(str -> frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1));

        for(Map.Entry<String, Integer> prMap : frequencyMap.entrySet()){
            System.out.println(prMap.getKey()+"-->"+ prMap.getValue());
        }
    }

    /*🌈✨Print num of occurrences of each word in a given list of string without using map as o/p*/
    public void countOccurrenceOfWords(List<String> strList) {
        strList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((word, count) -> System.out.println("Word" + word + " -->" + " , count" + count));
    }

    /*🌈✨Two arrays given, need to merge, sort then get the middle value*/
    public void mergeArrayAndSort(int[] inputArray1, int[]inputArray2) {
        try {
            int[] mergedArray = new int[inputArray1.length + inputArray2.length];
            int counter = 0;
            for (int i = 0; i < inputArray1.length; i++) {
                mergedArray[i] = inputArray1[counter];
                counter++;
            }
            for (int i = 0; i < inputArray2.length; i++) {
                mergedArray[counter] = inputArray2[i];
                counter++;
            }
            Arrays.sort(mergedArray);
            System.out.println("MergedArray" + Arrays.toString(mergedArray));
            int arraySize= mergedArray.length;
            if(!(arraySize%2==0)){
                int middleElementIndex = arraySize/2;
                System.out.println("The Middle element in the array after sorting is "+ mergedArray[middleElementIndex]);
            }
            else{
                int middleIndex1 = (arraySize / 2) - 1;  // First middle element
                int middleIndex2 = arraySize / 2;        // Second middle element
                double middleValue = (mergedArray[middleIndex1] + mergedArray[middleIndex2]) / 2.0;  // Average as a double
                System.out.println("The Middle value (average of two middle elements) in the array after sorting is " + middleValue);
            }

        } catch(Exception ex){
            System.out.println(" the messaged he gave us is "+ex.getMessage() );
        }
    }

    /*🌟🌸🍇Easy Way to Merge two array*/

    public void merge2ArraysEasily(int[] inputArray1, int[]inputArray2){
        int[] merged = new int[inputArray1.length + inputArray2.length];
        System.arraycopy(inputArray1,0,merged,0,inputArray1.length);
        System.arraycopy(inputArray2, 0, merged, inputArray1.length, inputArray2.length);
        System.out.println("2 Arrays merged using easy way System.arrayCopy() is "+ Arrays.toString(merged));
    }

    /*🌈✨Two anagram strings given, how u will check? - Capgemini L1 (1)*/
        public boolean checkAnagram(String str1, String str2){
                if(str1.length()!=str2.length()){
                    return false;
                }
            char[] firstCharArray= str1.toCharArray();
            char[] secondCharArray= str2.toCharArray();
            Arrays.sort(firstCharArray);
            Arrays.sort(secondCharArray);
            return Arrays.equals(firstCharArray, secondCharArray);
        }


    /*🌈✨ Print the name of the employee whose salary is >20000 using streams api.*/
    List<Employee3> listOfEmployee3 = Arrays.asList(
            new Employee3("Rahul", 27, 50000, "Banking Solution"),
            new Employee3("Gokul", 29, 740000, "Banking Solution"),
            new Employee3("Ram", 49, 2000, "Banking Solution"));


    List<String> employeeNames = listOfEmployee3.stream().
            filter(emp -> emp.getAnnualSalary() > 20000).
            map(Employee3::getName)
            .collect(Collectors.toList());

    /*🌈✨ Print num of occurrences of each word in a given string.
    (String str = "big black bug bit a big black dog on his big black nose")*/

    public void countTheOccurrencesOfWords(String str){
        String[] listOfAllWords = str.toLowerCase().split("\\s+");
        HashMap<String , Integer> frequencyMap = new HashMap<>();
        for(String string : listOfAllWords) {
            frequencyMap.put(string, frequencyMap.getOrDefault(string, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(" Occurrence of the word " + entry.getKey() + " is " + entry.getValue());
            }
        }

    /*🌈✨ Print the emp name whose salary is > 10000 in sorted order without any duplicates.)*/

    public void printEmpNamesByFilter() {

        List<String> empNames = listOfEmployee3.stream().filter(emp -> emp.getAnnualSalary() > 10000).map(emp -> emp.getName())
                .collect(Collectors.toList());
        System.out.println("Employees who gets paid more than 10,000 are "+ empNames);
    }


    /*🌈✨ Convert below string array to list. (String[] str = {"hello", "world", ...}) */

    public void convertStringToList(){
        String[] str = {"hello", "world", "Rahul"};
        List<String> listOfStrings = Arrays.asList(str);
        System.out.println("Converted String [] to List Of Strings"+ listOfStrings);
    }

    /*🌈✨ Find min length of string in above array using java8.*/

    public void findMinLengthOfStringFromArray(){
        String[] str = {"hello", "world", "Rahul", "gh"};
        List<String> listOfStrings = Arrays.asList(str);
        String minLengthStr = listOfStrings.stream().min(Comparator.comparingInt(String::length)).orElse("No Strings are Present");
        System.out.println(minLengthStr.length());
    }

    /*🌈✨  Find the num of occurrences of each letter in below String using java8. (String str = "hyujikoyhfrtuj") */

    public void countNoOfOccurrenceOfLetter(){
        String str = "hyujikoyhfrtuj";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for(int i =0; i<str.length();i++){
            frequencyMap.put(str.charAt(i), frequencyMap.getOrDefault(str.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() +" --> "+ entry.getValue());
        }
    }

    /*🌈✨ Employee object -> sort the by employee name using Java8 and explain.*/

        public void sortEmpObject(){
        List<Employee3>sortedEmpObject = listOfEmployee3.stream()
                .sorted(Comparator.comparing(Employee3::getName))
                .collect(Collectors.toList());
        sortedEmpObject.forEach(emp->System.out.println(emp.getName()));
    }

    /*🌈✨Employee object -> group by gender using Java8 and explain.*/



    public void groupEmpByGender(){
        List<Employee2> employee2s = new ArrayList<>();
        employee2s.add(new Employee2(101, "Rahul", 55000.0, "IT", "Male"));
        employee2s.add(new Employee2(102, "Ananya", 62000.0, "HR", "Female"));
        employee2s.add(new Employee2(103, "Vikram", 75000.0, "Finance", "Male"));
        employee2s.add(new Employee2(104, "Sonia", 58000.0, "IT", "Female"));
        employee2s.add(new Employee2(105, "Arjun", 70000.0, "Marketing", "Male"));

        //Method 1
/*        Map<String , List<Employee2>> groupedByGender =employee2s.stream().collect(Collectors.groupingBy(Employee2::getGender));
        for(Map.Entry<String , List<Employee2>> entry:groupedByGender.entrySet() ){
            System.out.println(entry.getKey() +"-->"+ entry.getValue().stream().map(Employee2::getName).collect(Collectors.toList()));
        }*/

        //Method 2
        Map<String , List<String>> groupedByGender2 =employee2s.stream()
                .collect(Collectors.groupingBy(Employee2::getGender, Collectors.mapping(Employee2::getName, Collectors.toList())));  //🌟🌸🍇

        groupedByGender2.forEach((gender, names)->{
            System.out.println(gender+" -->"+ names);
        });
    }

    /*🌈✨Write a pgm to check string2 is substring of string1 or not.*/

    public void checkIfItsASubstring(){
        String str1 = "Rahul is a good boy";
        String str2 = "isa";
        if(str1.contains(str2)){
            System.out.println("Str 2 is a substring of str1");
        }
        else{
            System.out.println("Str 2 is a substring of str1");
        }
    }

        /*🌈✨ Write a pgm to find 2nd highest num from the given array using Java streams. (int[] arr = {50, 40, 70, 10, 80, 90})*/

    public void findSecondHighestFromArray(){
        int[] arr = {50, 40, 70, 10, 80, 90};
        int secondHighest= Arrays.stream(arr)
                .distinct()
                .boxed()  //🌟🌸🍇 Converts primitive int to Integer objects (needed for sorting)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Array doesn't have enough unique elements"));

        System.out.println("Second highest number: " + secondHighest);
    }

    /* 🌈✨Write a pgm to find 2nd highest num from the given array without using Java Streams. */

    public void findSecondLargestWithoutStream(){
        int[] arr = {50, 40, 70, 10, 80, 90};
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("The Second largest number is "+ max);
    }

    /*🌈✨String s="big black bug bit a big black dog on his big black nose";
    find number of occurrence of each word by using collections.*/


    public void findTheOccurrence(){
        String str = "big black bug bit a big black dog on his big black nose";
        List<String> listOfWords = Arrays.asList(str.toLowerCase().split("\\s+")); //🌟🌸🍇 Regex to remove spaces
        Map<String , Long> longyMap= listOfWords.stream()
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting() //🌟🌸🍇Map to count the occurrence
                ));
        longyMap.forEach((k, v) -> System.out.println("Word:  " + k + " - count: " + v));
    }

    /*🌈✨List<Integer> numbers = Arrays.asList(10, 20, 30, 89, 90, 20, 10); Sum the list using java8.*/

    public void sumTheList(){
        List<Integer> numbers = Arrays.asList(10, 20, 30, 89, 90, 20, 10);
        int sum  =numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("The sum of all numbers in list is  "+ sum);
    }

    /*🌈✨Write a pgm to print non repeated values (O/P: J,V) from String str = "JAVA".*/

    public void nonRepeatedValues(){
        String str = "JAVA";
        Map<Character, Integer> storeMap = new LinkedHashMap<>();
        for(Character ch: str.toCharArray()){
            storeMap.put(ch, storeMap.getOrDefault(ch, 0) + 1);
        }
        System.out.print("Non-repeated characters: ");
        storeMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .forEach(entry -> System.out.print(entry.getKey() +" "));
    }

    /*🌈✨Write a pgm to print length of each string in a list of strings.*/

    public void printLengthOfEachString(){
        String[] str = {"hello", "world", "Rahul", "gh"};
        List<String> listOfStrings = Arrays.asList(str);
        Map<String , Integer> lengthMap =listOfStrings.stream().distinct()
                .collect(Collectors.toMap(  //🌟🌸🍇toMap function in Streams Concept
                        word -> word,
                        word -> word.length()
                ));

        for(Map.Entry<String , Integer> entry:lengthMap.entrySet()){
            System.out.println(entry.getKey() +" -->" + entry.getValue());
        }
    }




    }

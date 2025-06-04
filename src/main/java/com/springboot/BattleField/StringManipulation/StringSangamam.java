package com.springboot.BattleField.StringManipulation;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSangamam {


    /*🌈✨Remove Duplicates from a String*/

    public void removeDuplicatesFromString(String str){

        if(str== null || str.length()<=1){
            return;
        }
        LinkedHashSet<Character> uniqueLetters = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            uniqueLetters.add(str.charAt(i));
        }
        System.out.println(uniqueLetters);
        StringBuilder strBr = new StringBuilder();
        for(Character ch :uniqueLetters ){
            strBr.append(ch);
        }
        System.out.println("using string builder is "+strBr.toString());
    }

    /*🌈✨Find the First Non-Repeating Character*/
    public void firstNonRepeatingCharacter(String str){
        String strr5 = str.toLowerCase().replaceAll("\\s","");
        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for(int i=0;i<strr5.length();i++){
            frequencyMap.put(strr5.charAt(i), frequencyMap.getOrDefault(strr5.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet() ){
            if(entry.getValue()==1){
                System.out.println("The first Non Repeating character is "+entry.getKey());
                return;
            }
        }
    }

    public void findOccurenceOfEachChar(String str){
        String string = str.toLowerCase().replaceAll("\\s+", "");
        HashMap<Character, Integer > frequencyMap = new HashMap();
        for(int i=0;i<string.length();i++){
            frequencyMap.put(string.charAt(i),frequencyMap.getOrDefault(string.charAt(i),0)+1);
        }

        int maxFrequency = 0;
        char maxUsedChar = ' ';
        for(Map.Entry<Character, Integer> entry:frequencyMap.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
            if(entry.getValue()>maxFrequency){
                maxFrequency = entry.getValue();
                maxUsedChar = entry.getKey();
            }
        }
        System.out.println("Max used character is "+maxUsedChar +" used "+maxFrequency+" many times");
    }

    public void reverseStringUsingInbuiltfn() {
        String original = "Hello ELon , Welcome to Mars";
        String reversedString = new StringBuilder(original).reverse().toString();
        System.out.println("String is reversed usign inbuilt Stringbuilder class and the reversed string is " + reversedString);
    }

    public void reverseStringWithoutInbuiltFunction(){
        String originalString = "Congratulations Mr. President Trump";
        String reversedString = "";

        for (int i = originalString.length()-1; i>=0; i--){
            reversedString += originalString.charAt(i);
        }
        System.out.println("String Reversed wihtout inbuilt function is "+ reversedString);
    }
    public void checkPalindromeMethod1(){
        String originalString = "Ostrich";
        String reversedString = new StringBuilder(originalString).reverse().toString();
        if(originalString.equals(reversedString)){
            System.out.println("the string is palindrome");
        }
        else{
            System.out.println("the string is not palindrome");
        }
    }
    public void checkPalindromeMethod2(){
        String originalString = "saas";
        boolean isPalindrome = true;
        for(int i = 0 ; i< originalString.length()/2;i++){
            if (originalString.charAt(i) != originalString.charAt(originalString.length() - i - 1)) {  //🏖️🍉💚
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Given String is Palindrome");
        }
        else{
            System.out.println("given string is not palindrome");
        }
    }

    public void learnStringClass(){
        String nameString = "Leonardo DiCaprio, is a ,good actor";
        System.out.println(nameString.compareTo("Kate winslet"));
        System.out.println(nameString.toUpperCase());
        System.out.println(nameString.length());
        System.out.println(nameString.charAt(3));
        System.out.println(nameString.toLowerCase());
        System.out.println(nameString.equalsIgnoreCase("Leonardo DiCaprio"));
        System.out.println(nameString.trim());
        System.out.println(nameString.concat("sef"));
        System.out.println(nameString.contains("sdf"));
        System.out.println(nameString.equals(nameString));
        System.out.println(nameString.split(",",2));

    }

    public void findVowels(){
        String school = "Asian";

        String lowerCaseInput = school.toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(char ch: school.toCharArray()){
            for(char vw : vowels ){
                if(vw==ch){}
                System.out.println("the String contains vowel");
                return;
            }
        }
        System.out.println("the string does not contain any vowels");

        //approach 2 - Using REGEX

        boolean vowelsPresentCheck = lowerCaseInput.matches(".*[aeiou].*");

    }

    public String removeWhiteSpaces(String input){
        StringBuilder str = new StringBuilder();
        char[] characters = input.toCharArray();
        for(char ch : characters){
            if(!Character.isWhitespace(ch)){
                str.append(ch);}
        }
        return  str.toString();
    }

    /*1️⃣ Reverse a String – Given a string, return its reverse.
Example: "hello" → "olleh"*/
    public void reverseString(String str){


        String stringBuild = new StringBuilder(str).reverse().toString();
        System.out.println("The reversed String using the StringBuilderClass is "+stringBuild);
        System.out.println("The reversed String using the StringBufferClass is "+new StringBuffer(str).reverse().toString());

        //Without Inbuilt Methods
        String storageString="";
        for(int i = str.length()-1;i>=0;i--){
            storageString += str.charAt(i);
        }
        System.out.println("String Reversed using for loop is "+ storageString);

    }

    /*2️⃣ Check if a String is Palindrome – A string is a palindrome if it reads the same forward and backward.
Example: "madam" → true, "java" → false*/

    public void checkPalindrome(String str){
        if(Objects.equals(str, new StringBuilder(str).reverse().toString())){
            System.out.println("The given string is Palindrome");
        }
        else{
            System.out.println("The given string is Not a Palindrome");
        }
    }

    /*3️⃣ Count Vowels and Consonants – Given a string, count the number of vowels (a, e, i, o, u) and consonants.
Example: "Java" → Vowels: 2, Consonants: 2*/
    public void countFrequencyOfConstantsAndVowels(String str){
        int vowelsCount = 0;
        int ConsonantsCount = 0;
        List<Character> vowelsLList = new ArrayList<>(Arrays.asList('a','e', 'i', 'o','u'));

        //Various ways to initialise the list
        //Revise
        List<Character> vowelsLList2 = new ArrayList<>(List.of('a','e', 'i', 'o','u'));
        List<Character> vowelsLList3 = new ArrayList<>();
        Collections.addAll(vowelsLList3, 'a','e', 'i', 'o','u');
        List<Character> vowelsList4 = Stream.of('a', 'e', 'i', 'o', 'u').collect(Collectors.toCollection(ArrayList::new));

        for(int i = 0; i<str.length();i++){
            if(vowelsLList.contains(str.charAt(i))){
                vowelsCount++;
            }
            else{
                ConsonantsCount++;
            }
        }
        System.out.println("The total number of vowels in the given string is "+vowelsCount);
        System.out.println("The total number of vowels in the given string is "+ConsonantsCount);

    }

    /*4️⃣ Remove White Spaces – Given a string, remove all white spaces from it.
Example: "Hello World" → "HelloWorld"*/

    public void removeWhiteSpaces1(String str){
        System.out.println("Removed White Spaces with String class"+str.replaceAll("\\s+",""));
        System.out.println("Removed White Spaces with StringUtil class"+ StringUtils.deleteWhitespace(str));
    }

    /*5️⃣ Convert String to Character Array – Convert a given string into a character array and print each character.
Example: "Java" → ['J', 'a', 'v', 'a']*/

    public void convertStringToChar(String str){
        char[] storageArray = new char[str.length()];
        for(int i=0;i<str.length();i++){
            storageArray[i]= str.charAt(i);
        }
        System.out.println("After converting the character array looks like this "+ Arrays.toString(storageArray));
    }

    /*6️⃣ Find the First Non-Repeating Character – Given a string, find the first character that appears only once.
Example: "swiss" → 'w'*/

    public void findFirstNonRepeatingCharacter(String str){
        char[] charactArray = str.toLowerCase().toCharArray();
//        char[] charactArray = new char[str.length()];
//        for(int i=0;i<str.length();i++){
//            charactArray[i]= str.charAt(i);
//        }

        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for(char ch : charactArray){
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
            /*if(frequencyMap.containsKey(ch)){
                frequencyMap.put(ch, frequencyMap.get(ch)+1);
            }
            else{
                frequencyMap.put(ch,1);
            }*/
        }
        System.out.println(frequencyMap);

        for(Map.Entry<Character, Integer> entry:frequencyMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First Non repeating character :"+ entry.getKey());
                return;
            }
        }
    }

    /*🌈✨ Write a Java program to check if a vowel is present in a string.*/

    public void findIfVowelIsPresent(String str){
        boolean isVowelPresent = str.toLowerCase().matches(".*[aeiou].*");
        System.out.println(isVowelPresent);
    }

    public void LearnStringManipulation(){
        String str = "GoatOfGoa";
        str.toLowerCase();
        str.equalsIgnoreCase("xgdf0");
        String s1 = "zpple is a new Bread";
        String s2 = "banana";
        int result = s1.compareTo(s2);
        String str3 = "Apple,Banana,Cherry";
        String[] strArray2 = str3.split(",");
        String[] strArray = s1.split(" "); //🍭🎈🎨  regex → The delimiter (regular expression) used to split the string.
        String goody = "Hello   Java   World";
        String[] words = goody.split("\\s+");
        //🍭🎈🎨 \\s+ is a regular expression that matches one or more spaces, ensuring that multiple spaces are treated as a single delimiter.
        String wordyy = "Hello Mr.Annachi";
        boolean lol = wordyy.contains("llo");
        System.out.println("contains method check instring class " + lol);
        System.out.println(" Split method "+ Arrays.toString(strArray2));
        int index = str.indexOf("Java");
        System.out.println("Index of 'Java': " + index);
        String stre = "banana";
        String replacedStr = stre.replaceAll("a", "o");  //🍭🎈🎨 Replace all 'a' with 'o'
        System.out.println(replacedStr);
        String strt = "   Hello World   ";
        String trimmed = strt.trim();      // "Hello World"
    }
}

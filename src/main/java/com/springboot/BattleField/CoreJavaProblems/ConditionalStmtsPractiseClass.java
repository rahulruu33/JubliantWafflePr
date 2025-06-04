package com.springboot.BattleField.CoreJavaProblems;

public class ConditionalStmtsPractiseClass {
    int sampleNumber = 19;

    //1️⃣ Check if a Number is Even or Odd

    private void checkEvenOddNumbers(){
        int number = 0;
        if(number%2 == 0){
            System.out.println("the number is even number");
        }
        else if(number == 0){
            System.out.println("the number is neither even nor odd");
        }
        else{
            System.out.println("the given number is odd number");
        }
    }

    // 2️⃣ Find the Largest Number

    private void findTheLargestNumber(){
        int a = 33;
        int b = 22;
        int c = 44;
        if(a>b && a>c ){
            System.out.println("a is the largest among the 3");
        } else if (b>c) {
            System.out.println("b is the largest of all 3");
        }
        else{
            System.out.println("c is the largest number");
        }
    }

    //  3️⃣ Check Leap Year
    //  Rules:
    //Divisible by 4
    //Not divisible by 100, unless divisible by 400


    private void checkTheLeapYear(){
        int year = 2003;
        if((year% 4 == 0 && year% 100!=0)|| (year%400==0)){
            System.out.println("the year is leap year ");
        }
        else{
            System.out.println("the year is not a leap year");
        }
    }

/*    4️⃣ Grade Calculator
    Write a program to assign grades based on a score (out of 100).
    Rules:

    Score >= 90: Grade A
    80 <= Score < 90: Grade B
    70 <= Score < 80: Grade C
    Below 70: Fail*/

    private void gradeCalculator(){
        int score = 0;
        if(score >= 90){
            System.out.println("congratz you have received Grade A");
        }
        else if (score >= 80){
            System.out.println("congratz you have received Grade B");
        } else if (score >=70) {
            System.out.println("congratz you have received Grade c");
        } else if (score < 70) {
            System.out.println("sorry , you have failed the examination");

        }
    }

/*    5️⃣ Positive, Negative, or Zero
    Write a program to check if a number is positive, negative, or zero.*/

    private void checkNumbers(){
        int number = -54;
        if(number > 0){
            System.out.println("the number is positive");
        } else if (number==0) {
            System.out.println("the number is zero");
        }else{
            System.out.println("the number is negative");
        }
    }
/*    6️⃣ Eligibility to Vote
    Write a program to check if a person is eligible to vote. The person must be 18 or older.*/

    private void checkVotingEligibility(){
        if(sampleNumber >=18){
            System.out.println("Great , you are eligible to vote.. Be a responsible citizen of India");
        } else {
            System.out.println(" sorry you are not yet eligible to vote");
        }
    }

/*   7️⃣ Check if a Character is Vowel or Consonant
  Write a program to check whether a given character is a vowel or a consonant.
         Hint: Use || operator for vowels (a, e, i, o, u)*/

    private void checkCharecters(){
        char ch = 'a';
        if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
            System.out.println("the given character is a VOWEL ");
        }else
        {
            System.out.println("the given character is a Consonant ");
        }
    }

    /*8️⃣ Odd Numbers Between 1 and 20
Write a program to print all odd numbers between 1 and 20 using conditional statements.*/
    private void oddNumbersBtw1to20(){
        for(int i = 1 ; i<=20; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

/*🔟 Check Divisibility by 5 and 11
Write a program to check if a number is divisible by both 5 and 11.*/

    private void checkDivisibility(){
        if(sampleNumber%5==0 && sampleNumber%11==0){
            System.out.println("the  number is divisible by both 5 and 11");
        }
        else{
            System.out.println("the  number is not divisible by both 5 and 11");

        }
    }

}

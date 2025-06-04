package com.springboot.BattleField.CoreJavaProblems;

import java.util.Scanner;

public class LoopPractiseClass {


    private static void printNumberSeries() {
        /*1️⃣ Print Numbers from 1 to 10 Write a program to print numbers from 1 to 10 using a loop.*/

        for(int i = 1 ; i<=10; i++){
            System.out.println(i);
        }
    }

    private static void sumOfFirstNaturalNumber() {
    /*2️⃣ Sum of First N Natural Numbers
       Write a program to calculate the sum of the first N natural numbers.
       Example: For N = 5, the sum = 1 + 2 + 3 + 4 + 5 = 15.*/
        int n = 7;
        int totalSum = 0;
        for(int i =1 ; i<=n; i++ ){
         totalSum += i;
     }
        System.out.println("the sum of first N natural Number is "+ totalSum);


        //using while loop
        int i = 1;
        while(i<=n){
           totalSum +=i;  //(XE)-> (Any (X)Operator followed by Equals)
           i++;
        }
        System.out.println("the sum of first N natural Number is "+ totalSum);
    }

    private static void multiplicationTable() {
    /*3️⃣ Multiplication Table
    Write a program to print the multiplication table of any number entered by the user.
    Example: For 5, output should be:*/

        int mulNumber = 7;
        for (int j = 1 ; j<=10 ; j++){
            System.out.println(j +"*"+ mulNumber +"=" + j*mulNumber );
        }
    }

    private static void FactorialOfANumber() {
    /*4️⃣ Factorial of a Number
      Write a program to calculate the factorial of a number.*/

        int factorialNumberIs = 9;
        int totalFactorialValueIs = 1;
        for(int k= 1; k<=factorialNumberIs ; k++){
             totalFactorialValueIs *= k;
        }
        System.out.println("Facorial of Number "+factorialNumberIs+" is "+totalFactorialValueIs);
    }

    private static void reverseANumber() {
    /*5️⃣ Reverse a Number
    Write a program to reverse a given number.
    Example: Input: 1234 → Output: 4321.
    👉 Use a while loop.*/

        //Revise

        int toReverseNumber = 4587;
        int reversedNumber =0;
        while (toReverseNumber!=0){
            int digit = toReverseNumber/10;
            reversedNumber = reversedNumber*10 +digit;
            toReverseNumber /=10;
        }
        System.out.println("the reversed number is "+reversedNumber);
    }

    private static void primeNumberCheck() {
    /*6️⃣ Check if a Number is Prime
    Write a program to check if a number is prime.
    👉 A prime number is only divisible by 1 and itself.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("The number is neither Prime nor Composite.");
            return;
        }


        boolean isPrime = true;
        for(int l=2; l<number/2;l++){
           if(number % l==0){
               isPrime = false;
               break;
           }
        }
        if(isPrime){
            System.out.println("The given number is Prime");
        }else {
            System.out.println("The given number is a Composite number)");
        }
    }

    public static void findFibonacciSeries() {
    /*7️⃣ Print Fibonacci Series
Write a program to print the Fibonacci series up to N terms.
👉 Fibonacci series: 0, 1, 1, 2, 3, 5, 8, ...*/

        int TotalFibonacciNumber = 77;
        int a = 0;
        int b = 1;
        for(int c = 1; c<=TotalFibonacciNumber ; c++){
            System.out.print(a+ " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void printAPattern() {
    /*🔟 Print a Pattern
       Write a program to print the following pattern (for N = 5):*/
        int n3 = 5;

        for (int p=1 ; p<=n3; p++){
           for(int g = 1; g<=p;g++){
               System.out.print("* ");
           }
            System.out.println();
        }
    }

    private static void calculateNumberOfDigitsInANumber() {
    /* 9️⃣ Count Number of Digits
    Write a program to count the number of digits in a given number.
    Example: Input: 1234 → Output: 4.*/

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number to know the sum of the digits present");
        int number3 = scanner1.nextInt();
        int count = 0;

        while(number3!=0){
            number3/=10;
            count++;
        }
        System.out.println("Number of digits present is "+ count);
    }

    public static void sumOfDigitsInaNumber() {
    /* 8️⃣ Find the Sum of Digits of a Number
     Write a program to calculate the sum of the digits of a number.
     Example: Input: 123 → Output: 1 + 2 + 3 = 6.
      👉 Use a while loop.*/

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number to know the sum of the digits present");
        int number3 = scanner1.nextInt();
        int originalNumber = number3;

        int sum = 0;
        while(number3!=0){
            sum+= number3%10;
            number3/=10;
        }

        System.out.println("the sum of digits present in "+ originalNumber +" is "+sum);
    }

     public void practiseLoopExamples(){

         printNumberSeries();

         sumOfFirstNaturalNumber();

         multiplicationTable();

         FactorialOfANumber();

         reverseANumber();

         primeNumberCheck();

         sumOfDigitsInaNumber();

         calculateNumberOfDigitsInANumber();

         printAPattern();

         findFibonacciSeries();

         checkPrimeNumberMethod();

     }

    public void checkPrimeNumberMethod(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = scanner.nextInt();

         boolean isPrime = true;
         for(int l=2; l<=number/2;l++){
             if(number % l==0){
                 isPrime = false;
                 break;
             }
         }
         if(isPrime){
             System.out.println("The given number is Prime");
         }else {
             System.out.println("The given number is a Composite number)");
         }
     }
}

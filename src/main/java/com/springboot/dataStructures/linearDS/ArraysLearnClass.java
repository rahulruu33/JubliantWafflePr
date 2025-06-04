package com.springboot.dataStructures.linearDS;

public class ArraysLearnClass {

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return index where found
            }
        }
        return -1; // If not found
    }

    public static String reverse(String str) {
        // Base case: if the string is empty or has only one character, return it
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recursive case: reverse the rest of the string and append the first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public void testMethod3(){
        String input = "JavaGenie";
        String reversed = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public void testMethod(){
        int[] numbers = {5, 12, 34, 45, 50};
        int key = 34;
        int index = search(numbers, key);

        System.out.println(index == -1 ? "Not Found" : "Found at index " + index);

        /*1️⃣ Find the largest element in an array
Question:
Given an array of integers, find the largest element in the array.

Example Input:
int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};*/

        int[] arrays = {3, 1, 4, 1, 5, 9, 2, 6};
        int maxNumber = arrays[0];
        for(int i = 1 ; i<arrays.length ; i++ ){
            if(arrays[i]>maxNumber){
                maxNumber = arrays[i];
            }
        }
        System.out.println("Largest Element is"+maxNumber);


        /*3️⃣ Count the occurrences of a specific element
Question:
Given an array of integers and a target number, count how many times the target number appears in the array.

Example Input:
int[] arr = {1, 2, 3, 2, 4, 2, 5};
Target: 2*/

        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int count = 0;

        for(int i = 0; i<arr.length-1; i++ ){   // can use ForEach loop as well for (int num : arr) {}
            if(target==arr[i]){
                count++;
            }
        }


        /*5️⃣ Check if an array contains a specific element
Question:
Given an array of integers and a target element, check if the target element exists in the array.

Example Input:
int[] arr = {10, 20, 30, 40, 50};*/

        int[] arrS = {10, 20, 30, 40, 50};
        int targetW = 30;
        boolean found = false;


        for(int num : arrS){
            if(num==target){
                found = true;
                break;
            }
        }

        if(found){
        System.out.println(target+"is present in the array");
        }
        else{
            System.out.println(target+"is Not present in the array");
        }

        /*6️⃣ Find the sum of elements in an array
Question:
Write a program to find the sum of all elements in an array.

Example Input:
int[] arr = {1, 2, 3, 4, 5};*/

        int[] arrRE = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int sdf : arrRE ){
            sum += sdf;
        }
        System.out.println("the sum of elements in the array is"+sum);

    }
}

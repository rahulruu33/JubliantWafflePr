package com.springboot.BattleField.ArraysPack;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayAtomicHabits {

    /*🌈✨Find the Largest Element in an Array*/

    public void findTheLargestArray(int[] inputArray){
        int largestElemt = Arrays.stream(inputArray).distinct().boxed()
                .sorted(Comparator.reverseOrder()).findFirst().orElse(0);
        System.out.println("The largest Element in the given array is "+largestElemt);

    /*🌈✨Find the second Largest Element in an Array*/

        int secondLargestElement = Arrays.stream(inputArray)
                .distinct().boxed()
                .sorted(Comparator.reverseOrder()).skip(1)
                .findFirst().orElse(Integer.MIN_VALUE);
    }

    /*🌈✨Reverse an Array*/

    public void reverseAnArray(int[] inputArray){
        int[] reversedArray = new int[inputArray.length];
        int count= inputArray.length -1;
        for(int i=0;i<inputArray.length;i++){
            reversedArray[count] = inputArray[i];
            count--;
        }
        System.out.println("The reversed Array is "+ Arrays.toString(reversedArray));
    }

    /*🌈✨Check if Array Is Sorted*/

    public void testIfArrayIsSorted(int[] inputArray){
        int[] sortedArray = Arrays.stream(inputArray).sorted().toArray();
        if(Arrays.equals(sortedArray, inputArray)){
            System.out.println("Arrays is already Sorted");
        }
        else{
            System.out.println("Arrays is not already Sorted");
        }
    }

    /*🌈✨ Move All Zeros to the End of an Array*/

    public void moveZerosToEndOfArray(int[] nums){
        int n = nums.length;
        if(n<=1){
            return;
        }
        int nonZeroIndex =0;
        for(int i = 0 ;i<n;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for(int i = nonZeroIndex; i < n; i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    //Remove Duplicates from a Sorted Array in  java..various ways

    public void removeDuplicatesFromSortedArray(int[] inputArray){
        Arrays.stream(inputArray).distinct().toArray();
    }

    public void calculateSumOfInputArray(int[] inputArray){
        int sum = 0;
        try {
            for (int i : inputArray) {
                sum += i;
            }
            System.out.println("The sum of all elements in an array is " + sum);
        } catch (Exception exception) {
            System.out.println("Exception is caught"+ exception.getMessage());
        }
    }

    public void calculateSumOfIntegerUsingStream(int[] inputArray){
        System.out.println(Arrays.stream(inputArray).sum());
        System.out.println(Arrays.stream(inputArray).reduce(0, Integer::sum));
    }


    /*2. Find Maximum Element**
    Write a program to find the largest element in an integer array.
    Example Input:** `[5, 8, 2, 10, 3]`
    Expected Output:** `10`*/

    public void calculateLargestElementInIntegerArray(int[] inputArray){
        if(inputArray.length==0){
            System.out.println("The Array is Empty");
            return;
        }
        int maxElement = Integer.MIN_VALUE;
        for(int i:inputArray){
            if(i>maxElement){
                maxElement=i;
            }
        }
        System.out.println("Max element in an array is "+ maxElement);
    }

    public void calculateLargestElementUsingArraysSorting(int[] inputArray){
        if(inputArray.length==0){
            System.out.println("Input Array is Empty");
            return;
        }
        Arrays.sort(inputArray);
        int largestNum = Arrays.stream(inputArray).max().orElse(0);
        System.out.println("Largest element in an array "+ inputArray[inputArray.length-1]);
        System.out.println("Largest element in an array "+ largestNum);
    }

    public void findMaxUsingCollections(Integer[] inputArray){
        List<Integer> numList = Arrays.asList(inputArray);
        int maxElement = Collections.max(numList);
        System.out.println(maxElement);
    }

    /*  3. Search for an Element**

        Write a program to check if a specific integer exists in an array. Return `true` if found, `false` otherwise.
        **Example Input:** `[4, 2, 9, 7, 5]`, search for `9`
        **Expected Output:** `true`*/

    public boolean checkTargetAvailabilityInArray(int[] inputArray , int target){
        for(int num: inputArray){
            if(target==num){
                return true;
            }
        }
        return  false;
    }

    public void reverseElementsInArray(int[] inputArray){
        AtomicInteger count = new AtomicInteger(0);
        int[] newArray = new int[inputArray.length];
        for(int num: inputArray){
            newArray[inputArray.length-1-count.get()]=num;
            count.getAndIncrement();
        }
        System.out.println("Using enhanced for loop the new array we received is  "+Arrays.toString(newArray));
        for(int i=inputArray.length-1; i>=0;i--){
            newArray[count.get()] = inputArray[i];
            count.getAndIncrement();
        }
        System.out.println("The reversed value of an Array is "+ Arrays.toString(newArray));
    }

    /*5. Calculate Average**
    Write a program to compute the average of elements in a numeric array.
    Example Input:** `[10, 20, 30, 40, 50]`
    Expected Output:** `30.0`*/

    public void calculateAvgOfArray(int[] inputArray){
        double sumOFElements= Arrays.stream(inputArray).average().orElse(0.0);
        System.out.println("The sum of Elements of Array using Array's Stream concept is "+sumOFElements);
    }


    //TO_BE_CONTINUED
    public void countNumberOfOddAndEven(int[] inputArray){
//        long evenNumbersCount=  Arrays.stream(inputArray).filter(num->num%2==0).count();
//        long oddNumbersCount=  Arrays.stream(inputArray).filter(num->num%2!=0).count();
//        System.out.println("The number of even numbers in the given array is "+evenNumbersCount);
//        System.out.println("The number of even numbers in the given array is "+oddNumbersCount);
        int evenCount = 0;
        int OddCount = 0;
        for(int num : inputArray){
            if(num%2==0){
                evenCount++;
            }else{
                OddCount++;
            }
        }
        System.out.println("Number of Odd numbers is "+ OddCount + "  And Number of even numbers is "+ evenCount);
    }

    /*  7. Find Duplicate Elements**
        Write a program to find and print all duplicate elements in an array.
        Example Input:** `[2, 5, 2, 7, 8, 5]`
        Expected Output:** `2, 5`*/

    public void findDuplicateNumbers(int[] inputArray) {
        List<Integer> duplicates = new ArrayList<>();
        for(int i =0;i<inputArray.length;i++){
            for(int j=i+1; j<inputArray.length;j++){
                if(inputArray[i]== inputArray[j]){
                    duplicates.add(inputArray[i]);
                }
            }
        }
        System.out.println("Th list of duplicates are  "+ duplicates);
    }

    /*
    *8. Merge Two Arrays**
    Write a program to merge two integer arrays into a single array.
    **Example Input:**
    `Array1 = [1, 2, 3]`
    `Array2 = [4, 5, 6]`
    Expected Output:** `[1, 2, 3, 4, 5, 6]`*/
    public void mergeArray(int[] input1Array , int[] input2Array) {
        int[] mergedArray = new int[input1Array.length + input2Array.length];
        for(int i= 0;i<input1Array.length; i++){
            mergedArray[i] = input1Array[i];
        }
        for(int i= 0;i<input2Array.length; i++){
            mergedArray[input1Array.length+i] = input2Array[i];
        }
        System.out.println("The Merged Array elements are " + Arrays.toString(mergedArray));
    }

    /*### **9. Sort Array in Ascending Order**
    Write a program to sort an integer array in ascending order (you can use basic sorting algorithms like Bubble Sort).
    Example Input:** `[5, 3, 8, 1, 2]`
    Expected Output:** `[1, 2, 3, 5, 8]`*/

    public void sortTheGivenArray(int[] input1Array){
        int[] newArray= Arrays.stream(input1Array).distinct().sorted().toArray();
        Arrays.sort(input1Array);
        System.out.println("Sorted using sorted in Arrays class concept"+Arrays.toString(input1Array));
        System.out.println("Sorted using distinct sorted in Streams concept"+Arrays.toString(newArray));
    }
    /*10. Check Palindrome Array**
    Write a program to check if an array is a palindrome (reads the same forward and backward).
    **Example Input 1:** `[1, 2, 3, 2, 1]` → **Output:** `true`
    **Example Input 2:** `[1, 2, 3, 4]` → **Output:** `false`*/

    public void checkPalindrome(int[] input1Array){
        int left = 0;
        int right = input1Array.length-1 ;
        boolean isPalindrome = true;
        while(left<right){
            if(input1Array[left]!=input1Array[right]){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("The given Integer array is palindrome");
        }else{
            System.out.println("The given Integer array is Not a palindrome");
        }
    }

     /*
    11. Find Second Largest Element
    Write a program to find the second largest element in an integer array.
    Example Input: [10, 20, 4, 45, 99]
    Expected Output: 45
    */

    public void findTheSecondLargestElement(int[] inputArray){
        int secondLargest = Arrays.stream(inputArray).distinct()
                .boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(secondLargest);
    }

        /*
    12. Remove Duplicates from an Array**
    Write a program to remove duplicate elements and return the unique elements in the same order.
    Example Input:** `[1, 2, 2, 3, 4, 4, 5]`
    Expected Output:** `[1, 2, 3, 4, 5]`
        * */

    public void removeDuplicates(int[] inputArray){
        int[] distinctElements = Arrays.stream(inputArray).distinct().toArray();
        System.out.println(Arrays.toString(distinctElements));
    }

    /*
    ### **14. Find the Missing Number in an Array**
    Write a program to find the missing number in an array of `n` consecutive numbers from `1` to `n+1`.
    Example Input:** `[1, 2, 4, 5, 6]`
    Expected Output:** `3`
     */

    public int findTheMissingNumberInArray(int[] nums){
        int n = nums.length;
        int expectedSum = (n+1)*(n+2)/2;
        int actualSum = 0;
        for(int i : nums){
            actualSum+=i;
        }
        System.out.println("The missing number in the array is "+ (expectedSum - actualSum));
        return expectedSum - actualSum;
    }

    /*
    15. Find the Intersection of Two Arrays**
    Write a program to find the common elements in two integer arrays.
    **Example Input:**
    `Array1 = [1, 3, 4, 5, 7]`
    `Array2 = [2, 3, 5, 6]`
    Expected Output:** `[3, 5]`
    * */

    public void findIntersectionOfArrays(int[] input1Array , int[] input2Array ){
        for(int i = 0; i<input1Array.length;i++){
            for(int j = 0; j<input2Array.length;j++){
                if(input1Array[i]==input2Array[j]){
                    System.out.print(input1Array[i]+" ");
                }
            }
        }
    }

    public void findIntersectionOfArraysStoreInList(int[] input1Array , int[] input2Array ){
        List<Integer> intersectionList = new ArrayList<>();
        for(int i = 0; i<input1Array.length;i++){
            for(int j = 0; j<input2Array.length;j++){
                if(input1Array[i]==input2Array[j]){
                    intersectionList.add(input1Array[i]);
                }
            }
        }
        int[] printIntArray = new int[intersectionList.size()];
        for(int i = 0; i<printIntArray.length;i++){
            printIntArray[i] = intersectionList.get(i);
        }
        System.out.println("Intersected Elements printed using Arrays "+Arrays.toString(printIntArray));
    }

    /*### **16. Find Pairs with Given Sum**
    Write a program to find all pairs of numbers in an array that add up to a given sum.
    **Example Input:**
    `Array = [2, 4, 3, 7, 8, 1]`, `Sum = 10`
    **Expected Output:** `[2, 8] [3, 7]`*/

    public void findPairsWithSum(int[] inputArray, int sum){
        for(int i = 0; i<inputArray.length;i++){
            for(int j=i+1; j<inputArray.length; j++ ){
                if(sum==inputArray[i]+inputArray[j]){
                    System.out.println("the pair of numbers that adds to make "+sum+" are "+ inputArray[i] +" " + inputArray[j]);
                }
            }
        }
    }

    public void findPairsWithSumUsingList(int[] inputArray, int sum){
        List<int[]> pairs = new ArrayList<>();
        for(int i = 0; i<inputArray.length;i++){
            for(int j=i+1; j<inputArray.length; j++ ){
                if(sum==inputArray[i]+inputArray[j]){
                    pairs.add(new int[]{ inputArray[i], inputArray[j] });
                }
            }
        }
        for(int[] pair : pairs){
            System.out.print("["+pair[0]+" "+pair[1]+"]");
        }
    }

    /*
    17. Find the First Non-Repeating Element**
    Write a program to find the first element in an array that does not repeat.
    Example Input:** `[3, 5, 3, 4, 5, 6, 4]`
    Expected Output:** `6`
    * */

    public void findFirstNonRepeatingElement(int[] inputArray){
        HashMap<Integer , Integer> frequencyMap = new HashMap<>();
        for(int num : inputArray){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for(int num : inputArray){
            if(frequencyMap.get(num)==1){
                System.out.println("The first Non Repeating element in the array is  "+num);
                return;
            }
        }
        System.out.println("All elements in the given array are repeating");
    }

    /*
    ### **18. Move All Zeroes to End**
    Write a program to move all zeros in an array to the end while maintaining the order of non-zero elements.
    **Example Input:** `[0, 1, 9, 8, 0, 2, 0, 3]`
    **Expected Output:** `[1, 9, 8, 2, 3, 0, 0, 0]`
    **/

    public void moveZerosToEnd(int[] inputArray){
        int nonZeroPointer  =0;
        int[] newArrrsfd = new int[inputArray.length];
        for(int i=0; i<inputArray.length;i++){
            if(inputArray[i]!=0){
                newArrrsfd[nonZeroPointer] = inputArray[i];
                nonZeroPointer ++;
            }
        }

        while(nonZeroPointer<inputArray.length){
            newArrrsfd[nonZeroPointer] = 0;
            nonZeroPointer++;
        }
        System.out.println("Before zero moved"+ Arrays.toString(inputArray));
        System.out.println("After Zero Moved"+Arrays.toString(newArrrsfd));

    }

        /*
        ### **19. Find Majority Element**
        Write a program to find the element that appears more than `n/2` times in an array.
        **Example Input:** `[3, 3, 4, 2, 4, 4, 2, 4, 4]`
        **Expected Output:** `4`
        * */

    public void findMajorityElements(int[] inputArray){
        int n = inputArray.length/2;
        HashMap<Integer , Integer> frequencyMap = new HashMap<>();
        for(int num : inputArray){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int[] dfsdf = Arrays.stream(inputArray).distinct().toArray();
        for(int num: dfsdf){
            if(frequencyMap.get(num)>n){
                System.out.print(num);
            }
        }
    }

    public void reverseArrayListInForLoop(int[] arr){

        int n = arr.length;
        int[] reversedArray = new int[n];

        for(int i =0; i<n;i++){
            reversedArray[i] = arr[n - i - 1];
        }

        String evenPositions;
        String oddPositions;

        List<Integer> evenPosList = new ArrayList<>();
        List<Integer> oddPosList = new ArrayList<>();

        for(int i = 0; i< n ; i++){
            if(i%2 == 0) {
                evenPosList.add(reversedArray[i]);
            }
            else{
                oddPosList.add(reversedArray[i]);
            }
        }

        evenPositions = evenPosList.stream().map(Objects::toString).collect(Collectors.joining(" "));
        oddPositions = oddPosList.stream().map(Objects::toString).collect(Collectors.joining(" "));

        System.out.println(evenPositions);
        System.out.println(oddPositions);

    }
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int complement = target - nums[i];
            if(integerHashMap.containsKey(complement)){
                return new int[]{integerHashMap.get(complement), i};
            }
            else{
                integerHashMap.put(nums[i], i);
            }
        };
        throw new IllegalArgumentException("No two sum in solution");
    }

    public String reverseStringWithoutStringBuilder(String str){
        char[] charArray = str.toCharArray();
        StringBuilder reversedstring = new StringBuilder();
        for(int i = charArray.length-1; i>=0;i--){
            reversedstring.append(charArray[i]);
        }
        return reversedstring.toString();
    }

    public String reverseStringWithStringBuilder(String str){
        char[] charArray = str.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for(int i = charArray.length-1;i>=0;i--){
            reversed.append(charArray[i]);
        }
        return reversed.toString();
    }

    public boolean isBoolean(int num){
        if (num<=1){
            return false;
        }
        for(int i= 2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public void findMaximumElementInArrayWithoutInbuiltfn(){
        int[] number5Array = {111, 55, 35, 77, 23,120};
        int maxElement = number5Array[0];

        for(int i = 1; i<number5Array.length;i++){
            if(number5Array[i] > maxElement ){
                maxElement = number5Array[i];
            }
        }
        System.out.println("Max element is " + maxElement);

    }

    public void findMaxElementInArrayWithInBuiltfn(){
        int[] NumArray = {1, 22, 33, 112, 2};
        int MaxElement = Arrays.stream(NumArray)
                .max()
                .getAsInt();
        System.out.println("Max element is "+MaxElement);
    }

    public void findArrayIntersectionWithHashSet(){
        int[] intArray1 = {1,2,3,4,5};
        int[] intArray2 = {0,6,3,6,5};

        int[] intersectionNumber = findIntersection(intArray1, intArray2);

        System.out.print("Intersection of the two arrays: ");
        for (int num : intersectionNumber){
            System.out.print(num + " ");
        }
    }

    private int[] findIntersection(int[] array1 , int[] array2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> intersectionList = new ArrayList<>();

        for(int num : array1){
            set.add(num);
        }

        for(int num : array2)
        {
            if(set.contains(num)){
                intersectionList.add(num);
                set.remove(num);
            }
        }

        int[] intArray = new int[intersectionList.size()];
        for(int i = 0 ; i< intersectionList.size(); i++){
            intArray[i] = intersectionList.get(i);
        }
        return intArray;

    }

    public void newMethod(){
        List<String> namesArrayList = new ArrayList<>(Arrays.asList("robert","tony", "arun"));
        namesArrayList.sort(Comparator.naturalOrder());

        List<String> sortedUsingStreams = namesArrayList.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("sortedNames"+ namesArrayList);
        boolean findArun = namesArrayList.contains("aruna");
        boolean findArun2 = namesArrayList.isEmpty();
        System.out.println(findArun);
        System.out.println(Arrays.toString(namesArrayList.toArray()));
    }

    public void removeDuplicatesFromArray(){
        Integer[] numbersArray = {1, 4, 3, 5, 3,2, 7,9,0};
        List<Integer> numbersArraylist = new ArrayList<>(Arrays.asList(numbersArray));

        List<Integer> testInt = new ArrayList<>(Arrays.asList(numbersArray));
        testInt.stream().collect(Collectors.toSet());

        List<Integer> distinctList = numbersArraylist.stream().distinct().collect(Collectors.toList());
        System.out.println("Using List and Streams API - distinct integers are"+ distinctList + " total numbers "+ distinctList.size());

        //method 2
        Set<Integer> numbersArraySet = new HashSet<>(Arrays.asList(numbersArray));
        System.out.println("Using Set -distinct integers are "+ numbersArraySet + " total numbers "+ numbersArraySet.size());
    }

    public void countOccurrenceOfElements(){
        Integer[] numbersArray = {1, 4, 3, 5, 3,2, 7,9,0};

        Map<Integer, Long> elementCountMap = Arrays.stream(numbersArray).collect(Collectors.groupingBy(num->num, Collectors.counting()));
        System.out.println("the found occurance using the stream " + elementCountMap);

    }

    public void secondLargestElement(){
        Integer[] numbersArray = {1, 4, 3, 5, 3,2, 7,9,0};

        Integer secondLargestEle = Arrays.stream(numbersArray).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);

        //method 1
        List<Integer> secondLargestElement = Arrays.stream(numbersArray).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        if(secondLargestElement.size() < 2){
            System.out.println("No second largest element found.");
        }
        else {
            System.out.println("Second largest element: " + secondLargestElement.get(1));
        }

        //method 2
        Integer secondlargerElement = Arrays.stream(numbersArray).distinct().sorted(Comparator.reverseOrder()).skip(0).findFirst().orElse(0);
        System.out.println(secondlargerElement);
    }

    public void merge2SortedArrays() {
        Integer[] integerArray = {1, 3, 2, 7, 4};
        Integer[] integerArray2 = {8, 3, 2, 1, 4};

        int[] integerArray3 = {1, 3, 2, 7, 4};
        int[] integerArray4 = {8, 3, 2, 1, 4};

        Set<Integer> intermittantSortedArray = new HashSet<>(Arrays.asList(integerArray));
        intermittantSortedArray.addAll(Arrays.asList(integerArray2));

//        Set<Integer> mergedSortedArray = new HashSet<>(intermittantSortedArray);
        System.out.println("Merged and Sorted array" + intermittantSortedArray);

        int[] mergedFinalOutput = IntStream.concat(Arrays.stream(integerArray3), Arrays.stream(integerArray4)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(mergedFinalOutput));
    }

    public void reverseLinkedList(){
        LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(1,2,4,3,8));
        System.out.println("Original linked list"+ integerLinkedList);
        Collections.reverse(integerLinkedList);
        System.out.println("Reversed linked list"+ integerLinkedList);
        int maxNumber = Collections.max(integerLinkedList);
        int minNumber = Collections.min(integerLinkedList);
        System.out.println(maxNumber+"Min is "+minNumber);
    }

    public void reverseStringPractiseMethod(){
        String myName = "RahulRU";
        StringBuilder stringBuilder = new StringBuilder(myName);
        System.out.println("Using StringBuilder "+stringBuilder.reverse().toString());
        StringBuilder reversedString = new StringBuilder();

        for(int i = myName.length()-1 ; i>=0 ; i--){
            char o = myName.charAt(i);
            reversedString.append(myName.charAt(i));
            System.out.print(o);
        }
        System.out.println("Using Another string to store"+reversedString);
    }

    public void sortAnArray(){
        int[] intArray = {1, 2, 3, -1, -2, 4};
        Arrays.sort(intArray);
    }

    public void checkElements() throws Exception {
        Integer[] expectedItems = {1, 2, 3, 4};
        Integer[] actualItems   = {1, 2, 4, 5};
        validateMethod(expectedItems , actualItems);
    }

    public void validateMethod(Integer[] expectedItems ,Integer[] actualItems  ) throws Exception {
        for(Integer item:expectedItems){
            if(!Arrays.asList(actualItems).contains(item)){
                throw new Exception("item not present in second array");
            }
        }
    }


}

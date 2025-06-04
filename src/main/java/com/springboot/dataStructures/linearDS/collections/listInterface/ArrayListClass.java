package com.springboot.dataStructures.linearDS.collections.listInterface;

import java.util.*;

public class ArrayListClass {

    public void testMethod(){
        List<String> list = new ArrayList<>(); // Using ArrayList

        list.add("Java");
        list.add("Python");
        list.add("C++");
//        list.addFirst("AddedNewly");
        list.add("Java"); // Allows duplicates

        System.out.println("list:"+list);
        System.out.println("First Element in list:"+list.get(0));
        System.out.println("Size of list:"+list.size());

        list.remove("Python");


        /*1️⃣ Find the largest number in a list*/

            List<Integer> numbers = Arrays.asList(10, 25, 3, 99, 56);
            int maxNumber  = Collections.max(numbers);
            int maxNumberApproach2 = Collections.max(numbers, Integer::compare);
            System.out.println("Largest number: " + maxNumber);

        /*2️⃣ Remove duplicates from a list*/

        List<Integer> listRT = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));
        Set<Integer> setOfNumbers = new HashSet<>(listRT);
        listRT.clear();
        listRT.addAll(setOfNumbers);

        System.out.println("List without duplicates: " + list);

        /*3️⃣ Reverse a list*/
        Collections.reverse(listRT);

        /*4️⃣ Find if an element exists in a list*/
        int targetNum = 3;
        if(listRT.contains(targetNum)){
            System.out.println(targetNum + " is present in the list.");
        }
        else{
            System.out.println(targetNum + " is Not present in the list.");
        }

        /*5️⃣ Convert a list to an array*/
        String[] newStrArray = list.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(newStrArray));

    }
}

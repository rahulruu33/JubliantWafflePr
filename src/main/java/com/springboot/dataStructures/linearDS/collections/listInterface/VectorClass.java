package com.springboot.dataStructures.linearDS.collections.listInterface;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {
    public void testMethod(){

        /*1️⃣ Add and Retrieve Elements from a Vector*/
//        📌 Problem: Create a Vector, add elements, and retrieve them using indexes.
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        System.out.println("Element at index 1: " + vector.get(1)); // Python

        /*2️⃣ Iterate Over a Vector Using Enumeration
        📌 Problem: Use Enumeration to iterate over a Vector.*/
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Enumeration<Integer> en = numbers.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");  // 10 20 30
        }

        /*3️⃣ Remove Element from a Vector
        📌 Problem: Remove an element from a Vector and print the updated list.
        */
        Vector<String> stringVector = new Vector<>();
        stringVector.add("Apple");
        stringVector.add("Banana");
        stringVector.add("Cherry");

        stringVector.remove("Banana"); // Removing element

        System.out.println("Updated Vector: " + stringVector);

        /*4️⃣ Check if Vector Contains an Element
        📌 Problem: Check if an element exists in a Vector.*/

        Vector<String> stringVector1 = new Vector<>();
        stringVector1.add("Dog");
        stringVector1.add("Cat");
        stringVector1.add("Rabbit");

        System.out.println(stringVector1.contains("Cat"));  // true
        System.out.println(stringVector1.contains("Tiger")); // false

        /*5️⃣ Convert Vector to Array*/
        Vector<Integer> integerVector = new Vector<>();
        integerVector.add(1);
        integerVector.add(2);
        integerVector.add(3);

        Integer[] arr = integerVector.toArray(new Integer[0]);

        for (int num : arr) {
            System.out.print(num + " ");  // 1 2 3
        }
    }


    }


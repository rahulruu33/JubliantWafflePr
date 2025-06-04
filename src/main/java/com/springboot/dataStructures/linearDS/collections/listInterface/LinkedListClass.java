package com.springboot.dataStructures.linearDS.collections.listInterface;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListClass {

    /*📌 When to Use What?
        Use ArrayList when searching & accessing elements frequently.
        Use LinkedList when inserting/deleting elements frequently (especially at the beginning/middle).*/

    public void testMethod(){

        /*1️⃣ Add elements to a LinkedList and print*/

        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("LinkedList: " + list);


        /*2️⃣ Insert an element at the beginning and end*/
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(10);
        integerLinkedList.add(20);
        integerLinkedList.add(30);

        integerLinkedList.addFirst(5);  // Insert at the beginning
        integerLinkedList.addLast(50);  // Insert at the end

        System.out.println("Updated LinkedList: " + integerLinkedList);

        /*3️⃣ Remove an element from LinkedList*/

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("A");
        stringLinkedList.add("B");
        stringLinkedList.add("C");

        stringLinkedList.remove("B");   // Remove by value
        stringLinkedList.removeFirst(); // Remove first element
        stringLinkedList.removeLast();  // Remove last element

        System.out.println("LinkedList after removal: " + stringLinkedList);

        /*4️⃣ Search for an element in LinkedList*/
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);

        int target = 10;
        if (linkedList.contains(target)) {
            System.out.println(target + " is found in the LinkedList.");
        } else {
            System.out.println(target + " is NOT in the LinkedList.");
        }

        /*5️⃣ Reverse a LinkedList*/
        LinkedList<Integer> integerLinkedList1 = new LinkedList<>();
        integerLinkedList1.add(1);
        integerLinkedList1.add(2);
        integerLinkedList1.add(3);
        integerLinkedList1.add(4);

        Collections.reverse(integerLinkedList1);
        System.out.println("Reversed LinkedList: " + integerLinkedList1);
    }



    }


package com.springboot.controller;

public class TestClass {
    public void testMethod(){
        String name = "Rahul";
        StringBuilder str = new StringBuilder(name).reverse();
        System.out.println(str);
        String reversedString = "";

        for(int i = name.length()-1; i>=0; i-- ){
            reversedString += name.charAt(i);
        }
        System.out.println(reversedString);
    }

}

package com.springboot.BattleField.java8FeaturesComboPack.FunctionalInterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierFuncIntClass {

    /*
     //Define-Bro
    The Supplier<T> functional interface represents a supplier of results.
    It does not take any input but returns a value of type T when invoked.
    Abstract Method:
        T get(); → Returns a result of type T.
    Important Default Method:
        None (It does not define any default methods).
    Important Static Method:
        static <T> Supplier<T> of(Supplier<T> supplier); → Returns a Supplier instance.

        */

    public void practiseMethod(){

        /*Problem 1: Generate Random Numbers*/
        Supplier<Double> randomSupplier = ()->Math.random()*100;
        System.out.println("RandomNumber 1 is   "+randomSupplier.get());
        System.out.println("RandomNumber 2 is   "+randomSupplier.get());
        System.out.println("RandomNumber 3 is   "+randomSupplier.get());

        /*Problem 2: Supply Current Date and Time*/
        Supplier<String> currentDateTimeSupplier = ()-> {
            LocalDateTime newDate = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return newDate.format(formatter);
        };
        System.out.println("Current date and time is "+ currentDateTimeSupplier.get());
    }
}

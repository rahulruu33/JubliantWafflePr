package com.springboot.property;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Problem {

    public void sortNumbersinDesc(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //method 1

        numbers.sort(Collections.reverseOrder());

        //method 2
        List<Integer> numbersSorted =  numbers.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        //method 3
        Collections.sort(numbers, Collections.reverseOrder());

        //filterOutEvenNumbers
        List<Integer> numberList = new ArrayList<>();
        numberList.add(22);
        numberList.add(25);
        numberList.add(54);
        numberList.add(23);
        numberList.add(87);

        List<Integer> filteredEvenNumbers =
                numberList.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
    }
}

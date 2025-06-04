package com.springboot.BattleField.CollectionsPack;

import java.util.*;

public class CollectionsPractiseClass {
    public void practiseSetProblems(){
        Set<Integer> setOfIntegers = new HashSet<>();
        List<Integer> jkjsd = new ArrayList<>(Arrays.asList(1,2,3));
        setOfIntegers.add(4);
        setOfIntegers.add(54);
        setOfIntegers.add(14);
        setOfIntegers.add(43);
        setOfIntegers.add(41);
        setOfIntegers.addAll(jkjsd);

        Iterator<Integer> iteratored = setOfIntegers.iterator();
        while(iteratored.hasNext()){
            System.out.println(iteratored.next());
            iteratored.remove();
        }
        System.out.println("remaining elements in setofintegers"+ setOfIntegers);
    }
}

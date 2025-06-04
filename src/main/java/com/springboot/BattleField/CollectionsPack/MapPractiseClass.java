package com.springboot.BattleField.CollectionsPack;

import com.springboot.BattleField.modelsPack.Employee3;

import java.util.*;
import java.util.stream.Collectors;

public class MapPractiseClass {
    List<Employee3> employee3s = Arrays.asList(
            new Employee3("Alice", 30, 60000, "HR"),
            new Employee3("Bob", 35, 75000, "IT"),
            new Employee3("Charlie", 28, 50000, "HR"),
            new Employee3("David", 40, 90000, "Finance"),
            new Employee3("Eve", 25, 55000, "IT"));
    private  TreeMap<String, Double> classMappy = new TreeMap<>();

    public void testMethod(){
        Map<Integer, String> mappy = new HashMap<>();
        mappy.put(1, "USA");
        mappy.put(2, "CHINA");
        mappy.put(3, "ENGLAND");
        mappy.put(7, "FINLAND");
        mappy.put(1, "FINLAND2");
        System.out.println(mappy.get(1));
        System.out.println(mappy);

//        for(Map.Entry<Integer, String> entry : mappy.entrySet() ){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//            System.out.println(entry.getValue());
//        }

//        System.out.println(mappy.values());


        Map<Integer, List<String>> mappy2 = new HashMap<>();
        mappy2.put(1, Arrays.asList("NewYork","New Jersey", "Madurai"));
        mappy2.put(3, Arrays.asList("Halowings","CEG", "ACT"));
//        System.out.println(mappy2);

        Map<String, List<Employee3>> depMap = employee3s.stream()
                .collect(Collectors.groupingBy(Employee3::getDept));

        depMap.forEach((dept, empList) -> {
                System.out.println("Department:" + dept);
                empList.forEach(emp-> System.out.println("  "+emp.getName()));
                });

    }

    public void testMethod2(){

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(2015306033, "Rahul");
        studentMap.put(2015306032, "Priya");
        studentMap.put(2015306034, "RajKamal");

        Collection<String> hello = studentMap.values();

        System.out.println(studentMap);

//        Map.Entry<Integer, String> entry : mappy.entrySet()
        for(Map.Entry<Integer, String> entryT: studentMap.entrySet() ){
            System.out.println(entryT.getKey()+"->"+ entryT.getValue());
        }

    }

    public void practiseLinkedMap(){
        LinkedHashMap<Integer, String> linkedMapVar1 = new LinkedHashMap<>();
        linkedMapVar1.put(2015306033, "Rahul");
        linkedMapVar1.put(2015306023, "Rahul2");
        linkedMapVar1.put(2015306043, "Rahul3");
        linkedMapVar1.put(2015306343, "Rahul4");
        linkedMapVar1.put(2010602323, "Rahul5");
        linkedMapVar1.put(20306033, "Rahul6");

        System.out.println(linkedMapVar1);

        Map<String, Double> napTimeMap = new HashMap<>();
        napTimeMap.put("Rahul", 10.30);
        napTimeMap.put("Anu", 8.0);
        napTimeMap.put("Uma", 3.9);

//        boolean truthOrNot = napTimeMap.forEach();

        System.out.println(napTimeMap.get("Rahul"));
        System.out.println(napTimeMap.isEmpty());
        System.out.println(napTimeMap.containsValue(9.0));
        System.out.println(napTimeMap.containsKey("UmaR"));
        System.out.println(napTimeMap.size());
    }

    public void treeMapPractise(){
        TreeMap<String, Double> treeMappy = new TreeMap<>();
        treeMappy.put("Gandu", 0.87);
        treeMappy.put("Zapper", 31.2);
        treeMappy.put("Apple", 44.5);
        treeMappy.put("Yak", 66.6);
        treeMappy.replace("Yak",808.90);

        System.out.println(treeMappy);
        Set<String> nameSet = treeMappy.keySet();

        classMappy.putAll(treeMappy);

    }

    public void iteratorPractiseMethod(){
        /*✅ Example 4: Using an Iterator*/
        Iterator<Map.Entry<String, Double>> mapIterator = classMappy.entrySet().iterator();
        while(mapIterator.hasNext()){
            Map.Entry<String, Double> enMap = mapIterator.next();
            System.out.println("Key is  "+ enMap.getKey() + "->" + "Value is " + enMap.getValue() );
        }
    }


}

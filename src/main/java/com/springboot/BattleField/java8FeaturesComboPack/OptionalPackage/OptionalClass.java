package com.springboot.BattleField.java8FeaturesComboPack.OptionalPackage;

import java.util.Optional;

public class OptionalClass {

    public void testMethod() {
        Optional<String> test = Optional.empty();
        Optional<Integer> test1 = Optional.of(2);
        Optional<String> test3 = Optional.of("ZooKeeper");
        Optional<String> test4 = Optional.ofNullable("kilak Varma");
        Optional<String> test5 = Optional.ofNullable(null);
        Optional<Integer> test6 = Optional.ofNullable(2);

        Optional<String> vals = Optional.of("sds");
        Integer stringLength= vals.map(String::length).orElse(0);

        System.out.println(test);       // Optional.empty
        System.out.println(test1);   // Optional[Hello]
        System.out.println(test3);   // Optional.empty
        System.out.println(test4);   // Optional.empty
        System.out.println(test5);   // Optional.empty

        String value = test5.orElse("Default Value");
        System.out.println(value);

        Optional<String> test10 = Optional.ofNullable("kilak Varma");

        test10.filter(n -> n.startsWith("k")).ifPresent(System.out::println);

        Optional<String> optional = Optional.ofNullable(null);

        try {
            String value3 = optional.orElseThrow(() -> new IllegalArgumentException("Value is missing!"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Output: Value is missing!
        }

    }
}

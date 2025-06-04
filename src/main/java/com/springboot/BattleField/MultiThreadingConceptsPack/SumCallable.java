package com.springboot.BattleField.MultiThreadingConceptsPack;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class SumCallable implements Callable<Integer> {
    private static AtomicInteger count = new AtomicInteger(0);
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}

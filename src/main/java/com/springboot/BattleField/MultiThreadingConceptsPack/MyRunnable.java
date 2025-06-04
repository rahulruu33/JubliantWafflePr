package com.springboot.BattleField.MultiThreadingConceptsPack;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Hello from Thread!");
        }
    }
}

package com.springboot.BattleField.MultiThreadingConceptsPack;

public class MultiThreadCon extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

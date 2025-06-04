package com.springboot.BattleField.patternProblemsPack;

import java.util.Scanner;

public class patternProblems {
    public void practiseProblems(){

        /* Problem 1: Print a Right-Angled Triangle Pattern

         *
         **
         ***
         ****
         *****

         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        for(int i=1; i<=n ; i++){
            for(int j = 1; j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

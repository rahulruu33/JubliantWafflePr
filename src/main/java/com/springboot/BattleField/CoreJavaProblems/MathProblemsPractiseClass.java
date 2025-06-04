package com.springboot.BattleField.CoreJavaProblems;

public class MathProblemsPractiseClass {
    public void findMissingNumberInArrayFrom1(){
        int[] number = {1,2,3,4,6};
        int n = 6;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for(int num: number){
            actualSum += num;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number in an array is"+ missingNumber);
    }
}

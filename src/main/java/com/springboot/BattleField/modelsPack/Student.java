package com.springboot.BattleField.modelsPack;

import java.util.List;

public class Student {
    private String name;
    private List<Integer> scores;
    private int score;

    // Constructor
    public Student(String name, List<Integer> scores) {
        this.name = name;
        this.scores = scores;
    }
    // Constructor
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }


    public int getScore() {
        return score;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for scores
    public List<Integer> getScores() {
        return scores;
    }

    // Optional: Method to calculate the average score
    public double getAverageScore() {
        return scores.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    // Optional: Override toString for better printing of Student objects
    @Override
    public String toString() {
        return "Student{name='" + name + "', scores=" + scores + "}";
    }
}

package org.example;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Assignment {
    private String assignmentId;
    private String assignmentName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private ArrayList<Integer> scores;
    private static int nextId;


    /**
     * calculates the average score for one assignment
     */
    public void calcAssignmentAvg() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        assignmentAverage = (double) sum / scores.size();
    }

    /**
     * generates random scores for all students in an assignment
     */
    public void generateRandomScore() {

    }

    /**
     * generates a string to represent an assignment, with assignmentId, assignmentName, weight and maxScore
     * @return string
     */
    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId='" + assignmentId + '\'' +
                ", assignmentName='" + assignmentName + '\'' +
                ", weight=" + weight +
                ", maxScore=" + maxScore +
                '}';
    }
}

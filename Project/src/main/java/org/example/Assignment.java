package org.example;

import java.util.ArrayList;

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

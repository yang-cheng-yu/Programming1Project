package org.example;

import java.util.ArrayList;

public class Course {
    private String courseId; // C-departmentId-twoDigitCourseId, e.g.: C-D01-01
    private String courseName;
    private double credits;
    private Department department;
    private ArrayList<Assignment> assignments;
    private ArrayList<Student> registeredStudents;
    private ArrayList<Double> finalScores;
    private static int nextId; // indicates the next ID that will be used

    /**
     * checks if the sum of weights of all assignments of that course equals to 1 (100%)
     * @return true if the sum of weights of all assignments of that course equals to 1 (100%), else false
     */
    public boolean isAssignmentWeightValid() {
        double sum = 0;
        for (Assignment a : assignments) {
            sum += a.getWeight();
        }
        return sum == 1;
    }

    public boolean registerStudent(Student student) {
        return false;
    }

    public int[] calcStudentsAverage() {
        return null;
    }

    public boolean addAssignment(String assignmentName, double weight, int maxScore) {
        return false;
    }

    public void generateScores() {

    }

    public void displayScores() {

    }

    /**
     * converts a course to a simple string with only the courseId, courseName, credits, and departmentName.
     * @return string
     */
    public String toSimplifiedString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", department=" + department.getDepartmentName() +
                '}';
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", department=" + department.getDepartmentName() +
                ", assignments=" + assignments +
                ", registeredStudents=" + registeredStudents +
                ", finalScores=" + finalScores +
                '}';
    }
}

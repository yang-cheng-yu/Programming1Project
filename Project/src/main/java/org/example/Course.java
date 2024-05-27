package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;

@Getter
@Setter
@EqualsAndHashCode
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

    /**
     *  adds a student to the student list of the course, also expand the score size for each assignment of this course, and add a new null element for the finalScores.
     * @param student
     * @return state
     */
    public boolean registerStudent(Student student) {
        if (registeredStudents.contains(student)) {
            return false;
        }
        registeredStudents.add(student);
        for (Assignment a : assignments) {
            a.getScores().add(0);
        }
        finalScores.add(null);
        return true;
    }

    /**
     * calculates the weighted average score of a student.
     * @return arraylist containing weighted average scores.
     */
    public ArrayList<Double> calcStudentsAverage() {
        ArrayList<Double> avgList = new ArrayList<>();

        for (Student s : registeredStudents) {
            double avg = 0;
            int idx = registeredStudents.indexOf(s);
            for (Assignment a : assignments) {
                avg += a.getScores().get(idx) * a.getWeight();
            }
            avgList.add(avg);
        }
        return avgList;
    }

    /**
     * adds a new assignment to the course
     * @param assignmentName
     * @param weight
     * @param maxScore
     * @return state
     */
    public boolean addAssignment(String assignmentName, double weight, int maxScore) {
        for (Assignment a : assignments) {
            if (a.getAssignmentName().equals(assignmentName)) {
                return false;
            }
        }
        Assignment assignment = new Assignment(assignmentName, weight, maxScore, this);
        assignments.add(assignment);
        return true;
    }

    /**
     * generates random scores for each assignment and student, and calculate the final score for each student.
     */
    public void generateScores() {
        finalScores = calcStudentsAverage();
        for (Assignment a : assignments) a.generateRandomScore();
    }

    /**
     * displays the scores of a course in a table, with the assignment averages and student weighted average
     */
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

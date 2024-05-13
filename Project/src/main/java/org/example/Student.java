package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@EqualsAndHashCode
@Getter
@Setter
public class Student {
    private String studentId; // 6-digits starts with a character S
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    private ArrayList<Course> registeredCourses;
    private static int nextId; // indicates the next ID that will be used

    public Student(String studentName, Gender gender, Address address, Department department) {
        this.studentName = studentName;
        this.gender = gender;
        this.address = address;
        this.department = department;
    }

    public boolean registerCourse(String course) {
        return false;
    }

    public boolean dropCourse(String course) {
        return false;
    }

    public String toSimplifiedString() {
        return null;
    }

    @Override
    public String toString() {
        // TODO @ Method 5
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", department=" + department +
                ", registeredCourses=" + registeredCourses +
                '}';
    }
}

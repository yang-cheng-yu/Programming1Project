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
        this.studentName = Util.toTitleCase(studentName);
        this.gender = gender;
        this.address = address;
        this.department = department;
    }

    /**
     * Adds inputted course to registeredCourses
     * @param course
     * @return status
     */
    public boolean registerCourse(Course course) {
        if (registeredCourses.contains(course)) {
            return false;
        }
        registeredCourses.add(course);
        return true;
    }

    /**
     * Removes inputted course from registeredCourses
     * @param course
     * @return status
     */
    public boolean dropCourse(Course course) {
        if (registeredCourses.contains(course)) {
            registeredCourses.remove(registeredCourses.indexOf(course));
            return true;
        }
        return false;
    }

    /**
     *  converts a student to a string that contains the studentId, the studentName and the department
     * @return string
     */
    public String toSimplifiedString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", department=" + department +
                '}';
    }

    /**
     *  converts a student to a string that contains the studentId, the studentName, the gender, the address and the department, and the registeredCourses (only the courseId, the courseName, and the departmentName)
     * @return string
     */
    @Override
    public String toString() {
        // TODO
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", department=" + department +
                ", gender=" + gender +
                ", address=" + address +
                ", registeredCourses=" + registeredCourses +
                '}';
    }
}

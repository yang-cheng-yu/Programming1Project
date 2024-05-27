package org.example;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address(0, "This St", "That City", "That Province", "666666", "Here");
        Address a2 = new Address(0, "This St", "That City", "That Province", "q6q 6q6", "Here");

        Department d1 = new Department("1", "oi");
        Department d2 = new Department("1", "no");

        Student s1 = new Student("man", Gender.MALE, a1, d1);
        Student s2 = new Student("woman", Gender.FEMALE, a2, d2);
    }
}
package org.example;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address(0, "This St", "That City", "That Province", "666666", "Here");
        Address a2 = new Address(0, "This St", "That City", "That Province", "q6q 6q6", "Here");
        System.out.println(a1);
        System.out.println(a2);
    }
}
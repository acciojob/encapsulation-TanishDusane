package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Creating an object of class RWOnly
        RWOnly obj = new RWOnly();

        // Task 4: Trying to access the private member directly will result in a compile-time error
        // System.out.println("Name: " + obj.name); // Error: name has private access in RWOnly

        // Task 5: Using getter to access name (Initially, name is not set, so it will print null)
        System.out.println("Name: " + obj.getName());

        // Task 6: Using setter to set name
        obj.setName("Tanish Dusane");

        // Task 5: Using getter to access name after setting it
        System.out.println("Name: " + obj.getName());
    }
}

package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        System.out.println("Name: " + obj.getName());

        obj.setName("Tanish Dusane");
        System.out.println("Name: " + obj.getName());
    }
}
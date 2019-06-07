package com.my.packhere;

public class Square extends Shape {

    private String name = "Square";
    private double length = 5;

    public double getPerimetr() {

        return length*5;
    }

    public double getArea() {
        return length*length;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("MAIN CLASS");
    }
}
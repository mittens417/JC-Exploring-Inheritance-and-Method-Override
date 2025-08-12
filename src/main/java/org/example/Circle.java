package org.example;

class Circle extends Shape {
    private double radius = 5.0;

    // Provide implementation for the abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}
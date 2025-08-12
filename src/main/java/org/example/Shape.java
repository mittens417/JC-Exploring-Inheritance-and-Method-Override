package org.example;

abstract class Shape {
    // Abstract method (does not have a body)
    public abstract double area();

    // Concrete method
    public String display() {
        return "The area is: " + area();
    }
}
package org.example.adapter.exercise;
// Create a target interface called Rectangle and it should have
// the following:
// - getWidth() - abstract method
// - getHeight() - abstract method
// getArea() - default method that should return the value of
// getWidth * getHeight
// Create a class called Square
// that has one field called side, which represents the length of a side of the square
// create and adapter that will allow us to use the Rectangle interface
// to find the width, height, and the area of the square'

public interface Rectangle {
    double getWidth();
    double getHeight();
    default double getArea() {
        return getWidth() * getHeight();
    }
}

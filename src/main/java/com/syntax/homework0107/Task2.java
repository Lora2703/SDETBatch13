package com.syntax.homework0107;


    /*Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
     Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */

interface Shape {
    double calculateArea(int r);
    double calculatePerimeter(int r);
}

class Circle implements Shape{

    public double calculateArea(int r) {
        return 3.14*r*r;
    }
    public double calculatePerimeter(int r) {
        return 2*3.14*r;
    }
}

class Square implements Shape{

    public double calculateArea(int r) {
        return r*r;
    }

    public double calculatePerimeter(int r) {
        return 4*r;
    }
}

class Task2{
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};
        for(Shape shape:shapes){
            System.out.println(shape.calculateArea(5));
            System.out.println(shape.calculatePerimeter(5));
        }
    }
}
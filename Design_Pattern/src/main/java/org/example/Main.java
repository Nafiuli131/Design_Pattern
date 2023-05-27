package org.example;

import org.example.Factory_Pattern.Shape;
import org.example.Factory_Pattern.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        //Fctory pattern
        Shape circle = ShapeFactory.createShape("circle");
        Shape rectangle = ShapeFactory.createShape("rectangle");
        circle.draw();
        rectangle.draw();

        //Facade pattern

    }
}
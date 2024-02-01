package app.src.main.java.org.dii.oop.lesson06.exercise02;

import java.util.ArrayList;

public class ShapeList extends ArrayList<Shape> {

    public void listAllShapes() {
        for (Shape shape : this) {
            System.out.printf("Name: %s, Number of side: %d, Area: %.2f, Perimeter: %.2f\n", shape.getClass().getSimpleName(), shape.getNumSide(), shape.getArea(), shape.getPerimeter());
        }
    }

    public void sumArea() {
        double totalArea = 0;
        for (Shape shape : this) {
            totalArea += shape.getArea();
        }
        System.out.printf("Summation of area is %.2f\n", totalArea);
    }
}
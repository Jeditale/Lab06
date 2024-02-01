package app.src.main.java.org.dii.oop.lesson06.exercise02;



public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle", 0);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
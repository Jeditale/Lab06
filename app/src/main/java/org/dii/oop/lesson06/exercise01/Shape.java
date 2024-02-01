package app.src.main.java.org.dii.oop.lesson06.exercise01;

public abstract class Shape {
    private String name;
    private int numSide;

    public Shape(String name, int numSide) {
        this.name = name;
        this.numSide = numSide;
    }

    public int getNumSide() {
        return numSide;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
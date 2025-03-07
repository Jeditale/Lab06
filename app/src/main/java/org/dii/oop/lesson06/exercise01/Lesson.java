package app.src.main.java.org.dii.oop.lesson06.exercise01;

import java.util.Scanner;
import java.util.ArrayList;

public class Lesson {
    public static void run() {
        ArrayList<Shape> shapes = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n1. Circle\n2. Rectangle\n3. Square\n4. Display all shape\n5. exit\nPlease select [1-5]:");
            String choice = in.nextLine().trim();

            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                double radius = Double.parseDouble(in.nextLine());
                shapes.add(new Circle(radius));
            }
            if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                double width = Double.parseDouble(in.nextLine());
                System.out.print("Enter height: ");
                double height = Double.parseDouble(in.nextLine());
                shapes.add(new Rectangle(width, height));
            }
            if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                double side = Double.parseDouble(in.nextLine());
                shapes.add(new Square(side));
            }
            if ("4".equals(choice)) {
                System.out.println("List all shape:");
                for (Shape shape : shapes) {
                    System.out.printf("Name: %s, Number of side: %d, Area: %.2f, Perimeter: %.2f\n", shape.getClass().getSimpleName(), shape.getNumSide(), shape.getArea(), shape.getPerimeter());
                }
            }
            if ("5".equals(choice)) {
                break;
            }

        } while(true);

        in.close();
    }
}
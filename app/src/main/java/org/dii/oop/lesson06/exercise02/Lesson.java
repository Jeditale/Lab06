package app.src.main.java.org.dii.oop.lesson06.exercise02;

import java.util.Scanner;

public class Lesson {
    public static void run() {
        ShapeList shapes = new ShapeList();
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n1. Circle\n2. Rectangle\n3. Square\n4. Display all shape\n5. Show summation of area\n6. Exit\nPlease select [1-6]:");
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
                shapes.listAllShapes();
            }
            if ("5".equals(choice)) {
                shapes.sumArea();
            }
            if ("6".equals(choice)) {
                break;
            }
        } while(true);

        in.close();
    }
}
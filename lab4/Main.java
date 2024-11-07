package org.lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Circle circle = new Circle(8.0);
        Rectangle rectangle = new Rectangle(7.0,12.0);
        Triangle triangle = new Triangle(60,60);

        circle.setRadius(8.0);
        System.out.println("Radius of circle = " + circle.getRadius() + " \n");

        rectangle.setHeight(10.0);
        rectangle.setWidth(18.0);
        System.out.println("Height of rectangle = " + rectangle.getHeight());
        System.out.println("Width of rectangle = " + rectangle.getWidth() + " \n");

        triangle.setHeight(50.0);
        triangle.setBase(50.0);
        System.out.println("Height of triangle = " + triangle.getHeight());
        System.out.println("Base of triangle = " + triangle.getBase() + " \n");

        System.out.println("*************************");
        System.out.println("Calculate the area & circumference \n for different shapes");
        System.out.println("************************* \n");

        System.out.println("Area of circle = " + circle.calculateArea());
        System.out.println("Circumference of circle = " + circle.calculateCircumference());

        System.out.println("--------------------------");

        System.out.println("Area of rectangle = " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle = " + rectangle.calculateCircumference());

        System.out.println("--------------------------");

        System.out.println("Area of triangle = " + triangle.calculateArea());
        System.out.println("Perimeter of triangle = " + triangle.calculateCircumference());

        System.out.println("--------------------------\n");


        /////////Another way when user enter the values:

        System.out.println("-- Circle area & circumference calculator --\n ");

        System.out.print("Enter the circle's radius : ");
        double radius = scanner.nextDouble();
        Circle circle2 = new Circle(radius);

        System.out.println("Area of circle = " + circle2.calculateArea());
        System.out.println("Circumference of circle = " + circle2.calculateCircumference());

        System.out.println("--------------------------");

        System.out.println("-- Rectangle area & perimeter calculator --\n ");

        System.out.print("Enter the rectangle's height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the rectangle's width: ");
        double width = scanner.nextDouble();

        Rectangle rectangle2 = new Rectangle(height, width);

        System.out.println("Area of rectangle = " + rectangle2.calculateArea());
        System.out.println("Perimeter of rectangle = " + rectangle2.calculateCircumference());

        System.out.println("--------------------------");

        System.out.println("-- Triangle area & perimeter calculator --\n ");

        System.out.print("Enter the triangle's height: ");
        double heightT = scanner.nextDouble();
        System.out.print("Enter the triangle's base: ");
        double base = scanner.nextDouble();

        Triangle triangle2 = new Triangle(height, base);

        System.out.println("Area of triangle = " + triangle2.calculateArea());
        System.out.println("Perimeter of triangle = " + triangle2.calculateCircumference());

        System.out.println("--------------------------");










    }
}
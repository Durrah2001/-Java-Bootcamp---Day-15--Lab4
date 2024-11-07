package org.lab4;

public class Circle extends Shape{

    private double radius;


    public Circle( double radius) {
        super();
        this.radius = radius;
    }



    @Override
    public double calculateArea() {
        //A = πr2
        double computeArea = (3.14 * (radius * radius));
        return computeArea;
    }


    @Override
    public double calculateCircumference() {  //2πr
        double computeC = (2 * 3.14 * radius);
        return computeC;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

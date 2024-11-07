package org.lab4;

public class Rectangle extends Shape{


    private double height;
    private double width;



    public Rectangle(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double computeArea = (height * width);
        return computeArea;
    }

    @Override
    public double calculateCircumference() {
       //perimeter 2 * (w+h);
        double computeP = (2 * (height + width));
        return computeP;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}



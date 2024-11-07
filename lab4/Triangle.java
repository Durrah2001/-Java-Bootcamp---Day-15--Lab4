package org.lab4;

public class Triangle extends Shape{


    private double height;
    private double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }



    @Override
    public double calculateArea() {
        //(base*height)/2
        double computeArea = ( (base * height) / 2 );
        return computeArea;
    }

    @Override
    public double calculateCircumference() {
        //P=3a .. for equilateral triangles
        double computeP = ( 3 * base );
        return computeP;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}

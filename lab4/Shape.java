package org.lab4;

public abstract class Shape {

    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape() {

    }


    //abstract methods to be implement in sub-classes

    public abstract double calculateArea();

    public abstract double calculateCircumference();


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

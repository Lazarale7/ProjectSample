/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesapp;

/**
 *
 * @author Alex
 */
public class Point {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public Point(double n) {
        this(n, n);
    }

    public Point() {
        this(0, 0);
    }

    public Point(Point p) {
        this(p.getX(), p.getY());
    }

    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    public void display() {
        System.out.println("< " + getX() + " ; " + getY() + " >");
    }

    public boolean isAtSamePosition(Point p) {
        return ((p.getX() == this.getX()) && (p.getY() == this.getY()));
    }

    @Override
    public String toString() {
        return ("< " + getX() + " ; " + getY() + " >");
    }

}

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
public class Circle extends Shape {

    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    @Override
    public void move(int dx, int dy) {

        this.point.setX(this.point.getX() + dx);
        this.point.setY(this.point.getY() + dy);
    }

    @Override
    public double getSurface() {
        return Math.PI * Math.pow(radius, radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.getDiameter();
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Radius:" + this.radius + "Center:" + this.point + "Color:" + this.color;
    }
}

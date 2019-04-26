/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesapp;

import java.util.Arrays;

/**
 *
 * @author Alex
 */
public class Rectangle extends Polygon {
// Допускаем, что прямоугольник построен таким образом, что его стороны паралельны осям координат

    public Rectangle(Point topRightCorner, int width, int height) {
        // Point[] this.vertices = new Point[4];
        this.vertices[0] = new Point(topRightCorner);

        //TopLeft
        System.out.println("Left2");
        this.vertices[1] = new Point(this.vertices[0].getX() - width, this.vertices[0].getY());

        //LowLeft
        System.out.println("Left3");
        this.vertices[2] = new Point(this.vertices[1].getX(), this.vertices[1].getY() - height);

        //LowRight
        System.out.println("Right4");
        this.vertices[3] = new Point(this.vertices[0].getX(), this.vertices[1].getY());

    }

    @Override
    public void move(int dx, int dy) {
        for (Point vertice : vertices) {
            vertice.setX(vertice.getX() + dx);
            vertice.setY(vertice.getY() + dy);
        }
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.calculateLength(this.vertices[0], this.vertices[1])) + (this.calculateLength(this.vertices[1], this.vertices[2]));
    }

    @Override
    public double getSurface() {
        return (this.calculateLength(this.vertices[0], this.vertices[1])) * (this.calculateLength(this.vertices[1], this.vertices[2]));
    }

    @Override
    public String toString() {
        return "Vertices are:" + Arrays.toString(this.vertices);
    }

    public double calculateLength(Point point1, Point point2) {
        return Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)) + Math.pow(point2.getY() - point1.getY(), 2));
    }
}

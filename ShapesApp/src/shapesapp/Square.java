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
public class Square extends Rectangle {

    public Square(Point topRightCorner, int sideLength) {
        super(topRightCorner, sideLength, sideLength);
        Point[] vertices = new Point[4];
        this.vertices[0].setX(topRightCorner.getX());
        this.vertices[0].setY(topRightCorner.getY());
        //TopLeft
        this.vertices[1].setY(this.vertices[0].getY());
        this.vertices[1].setX(this.vertices[0].getX() - sideLength);
        //LowLeft
        this.vertices[2].setX(this.vertices[1].getX());
        this.vertices[2].setY(this.vertices[1].getY() - sideLength);
        //LowRight
        this.vertices[3].setX(this.vertices[0].getX());
        this.vertices[3].setY(this.vertices[2].getY());
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
        return 4 * this.calculateLength(this.vertices[0], this.vertices[1]);
    }

    @Override
    public double getSurface() {
        return Math.pow(this.calculateLength(this.vertices[0], this.vertices[1]), 2);
    }

    @Override
    public String toString() {
        return "Vertices are:" + Arrays.toString(this.vertices);
    }

    @Override
    public double calculateLength(Point point1, Point point2) {
        return Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)) + Math.pow(point2.getY() - point1.getY(), 2));
    }
}

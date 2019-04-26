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
public class Triangle extends Polygon {

    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
        Point[] vertices = new Point[3];
        vertices[0] = cornerOne;
        vertices[1] = cornerTwo;
        vertices[2] = cornerThree;

    }

    @Override
    public double getSurface() {
        double a = this.getPerimeter() / 2;
        return Math.sqrt(a * (a - this.calculateLength(this.vertices[0], this.vertices[1])) * (a - this.calculateLength(this.vertices[1], this.vertices[2])) * (a - this.calculateLength(this.vertices[2], this.vertices[0])));
    }

    @Override
    public double getPerimeter() {
        return this.calculateLength(this.vertices[0], this.vertices[1]) + this.calculateLength(this.vertices[1], this.vertices[2]) + this.calculateLength(this.vertices[2], this.vertices[0]);
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

    public boolean isIsosceles() {
        double a = this.calculateLength(this.vertices[0], this.vertices[1]);
        double b = this.calculateLength(this.vertices[1], this.vertices[2]);
        double c = this.calculateLength(this.vertices[2], this.vertices[0]);
        if ((a == b) || (a == c) || (b == c)) {
            return true;

        } else {
            return false;
        }
    }

    public boolean isEquilateral() {
        double a = this.calculateLength(this.vertices[0], this.vertices[1]);
        double b = this.calculateLength(this.vertices[1], this.vertices[2]);
        double c = this.calculateLength(this.vertices[2], this.vertices[0]);

        if ((a == b) && (a == c)) {
            return true;

        } else {
            return false;

        }
    }

    public boolean isRight() {
        double a = this.calculateLength(this.vertices[0], this.vertices[1]);
        double b = this.calculateLength(this.vertices[1], this.vertices[2]);
        double c = this.calculateLength(this.vertices[2], this.vertices[0]);
        if ((a > b) && (a > c)) {
            if (a * a == b * b + c * c) {
                return true;

            } else {
                return false;
            }
        } else {
            if ((b > a) && (b > c)) {
                if (b * b == a * a + c * c) {
                    return true;

                } else {
                    return false;
                }
            } else {
                if (c * c == a * a + b * b) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public String isString() {
        return "Vertices are:" + Arrays.toString(this.vertices);
    }

    public double calculateLength(Point point1, Point point2) {
        return Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)) + Math.pow(point2.getY() - point1.getY(), 2));
    }
}

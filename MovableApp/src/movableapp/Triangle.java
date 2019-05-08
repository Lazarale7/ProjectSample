/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movableapp;

import java.util.Arrays;

/**
 *
 * @author Alex
 */
public class Triangle extends Polygon {

    public Triangle(Point cornerOne, Point cornerTwo, Point cornerThree) {
        this.vertices = new Point[3];
        this.vertices[0] = cornerOne;
        this.vertices[1] = cornerTwo;
        this.vertices[2] = cornerThree;

    }

    @Override
    public String toString() {
        return ("Triangle: Vertices= " + Arrays.toString(this.vertices));
    }

    @Override
    public void moveUp(int distance) {
        this.vertices[0].setY(this.vertices[0].getY() + distance);
        this.vertices[1].setY(this.vertices[0].getY() + distance);
        this.vertices[2].setY(this.vertices[0].getY() + distance);
    }

    @Override
    public void moveDown(int distance) {
        this.vertices[0].setY(this.vertices[0].getY() - distance);
        this.vertices[1].setY(this.vertices[1].getY() - distance);
        this.vertices[2].setY(this.vertices[2].getY() - distance);
    }

    @Override
    public void moveRight(int distance) {
        this.vertices[0].setX(this.vertices[0].getX() + distance);
        this.vertices[1].setX(this.vertices[1].getX() + distance);
        this.vertices[2].setX(this.vertices[2].getX() + distance);
    }

    @Override
    public void moveLeft(int distance) {
        this.vertices[0].setX(this.vertices[0].getX() - distance);
        this.vertices[1].setX(this.vertices[1].getX() - distance);
        this.vertices[2].setX(this.vertices[2].getX() - distance);
    }
}

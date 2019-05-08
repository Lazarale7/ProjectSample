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
public class Rectangle extends Polygon {

    public Rectangle(Point topRightCorner, int width, int height) {
        this.vertices = new Point[4];

        this.vertices[0] = new Point(topRightCorner.getX(), topRightCorner.getY());

        this.vertices[1] = new Point(
                this.vertices[0].getX() - width, this.vertices[0].getY());

        this.vertices[2] = new Point(
                this.vertices[1].getX(), this.vertices[1].getY() - height);

        this.vertices[3] = new Point(
                this.vertices[0].getX(), this.vertices[1].getY());

    }

    @Override
    public String toString() {
        return ("Rectangle: Vertices= " + Arrays.toString(this.vertices));
    }

    @Override
    public void moveUp(int distance) {
        this.vertices[0].setY(this.vertices[0].getY() + distance);
        this.vertices[1].setY(this.vertices[1].getY() + distance);
        this.vertices[2].setY(this.vertices[2].getY() + distance);
        this.vertices[3].setY(this.vertices[3].getY() + distance);
    }

    @Override
    public void moveDown(int distance) {
        this.vertices[0].setY(this.vertices[0].getY() - distance);
        this.vertices[1].setY(this.vertices[1].getY() - distance);
        this.vertices[2].setY(this.vertices[2].getY() - distance);
        this.vertices[3].setY(this.vertices[3].getY() - distance);
    }

    @Override
    public void moveRight(int distance) {
        this.vertices[0].setX(this.vertices[0].getX() + distance);
        this.vertices[1].setX(this.vertices[1].getX() + distance);
        this.vertices[2].setX(this.vertices[2].getX() + distance);
        this.vertices[3].setX(this.vertices[3].getX() + distance);
    }

    @Override
    public void moveLeft(int distance) {
        this.vertices[0].setX((this.vertices[0].getX() - distance));
        this.vertices[1].setX((this.vertices[1].getX() - distance));
        this.vertices[2].setX((this.vertices[2].getX() - distance));
        this.vertices[3].setX((this.vertices[3].getX() - distance));
    }

}

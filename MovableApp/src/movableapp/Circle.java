/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movableapp;

/**
 *
 * @author Alex
 */
public class Circle implements IMovable {

    private Point point;
    int radius;

    public Point getPoint() {
        return point;
    }

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return ("Circle: center = " + this.getPoint() + ", with Radius=" + this.getRadius());
    }

    @Override
    public void moveUp(int distance) {
        this.point.setY(this.point.getY() + distance);
    }

    @Override
    public void moveDown(int distance) {
        this.point.setY(this.point.getY() - distance);
    }

    @Override
    public void moveLeft(int distance) {
        this.point.setX(this.point.getX() - distance);
    }

    @Override
    public void moveRight(int distance) {
        this.point.setX(this.point.getX() + distance);
    }
}

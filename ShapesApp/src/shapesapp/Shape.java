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
public abstract class Shape {

    protected Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void move(int dx, int dy);

    public abstract double getSurface();

    public abstract double getPerimeter();
}

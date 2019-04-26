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
public abstract class Polygon extends Shape {

    protected Point[] vertices;

    @Override
    public abstract void move(int dx, int dy);

    @Override
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return Arrays.toString(vertices);
    }
}

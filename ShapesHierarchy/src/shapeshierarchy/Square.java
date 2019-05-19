/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeshierarchy;

/**
 *
 * @author Alex
 */
public class Square extends TwoDimensionalShape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + this.side + '}';
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

}

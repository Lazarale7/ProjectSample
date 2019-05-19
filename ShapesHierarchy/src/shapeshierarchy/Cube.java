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
public class Cube extends ThreeDimensionalShape {

    private double side;

    public Cube(double side) {
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
        return "Cube{" + "side=" + this.side + '}';
    }

    @Override
    public double getVolume() {
        return Math.pow(this.side, 3);
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(this.side, 2);
    }

}

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
public class Sphere extends ThreeDimensionalShape {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Sphere{" + "radius=" + this.radius + '}';
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(this.radius, 3)) / 3;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

}

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
public class Triangle extends TwoDimensionalShape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return this.sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" + "sideA=" + this.getSideA() + ", sideB=" + this.getSideB() + ", sideC=" + this.getSideC() + '}';
    }

    @Override
    public double getArea() {
        double p = (this.getSideA() + this.getSideB() + this.getSideC()) / 2;
        return Math.sqrt(p * (p - this.getSideA()) * (p - this.getSideB()) * (p - this.getSideC()));

    }

}

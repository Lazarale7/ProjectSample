/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeshierarchy;

/**
 *
 * @author Alex Класс описывает правильный тетраэдр, все его грани - правильные
 * треугольники
 */
public class Tetrahedron extends ThreeDimensionalShape {
    
    private double side;
    
    public Tetrahedron(double side) {
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public String toString() {
        return "Tetrahedron{" + "side=" + side + '}';
    }
    
    @Override
    public double getVolume() {
        return Math.pow(this.side, 3) / (6 * Math.sqrt(2));
    }
    
    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(this.side, 2);
    }
    
}

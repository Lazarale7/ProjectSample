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
public class ShapesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("It started");
        Point centerCircle = new Point(3.0, 4.0);
        Circle myCircle = new Circle(centerCircle, 7);
        Point topRightCornerRect = new Point(1.0, 1.5);
     //   Rectangle myRectangle = new Rectangle(centerCircle, 5, 7);
//
        Point newPoint = new Point(-6.0, 4.5);
        Triangle myTriangle = new Triangle(centerCircle, topRightCornerRect, newPoint);
        //     Square mySquare = new Square(newPoint, 9);
        Color userColor = new Color(5, 5, 5);
        System.out.println("Test of Circle");
        System.out.println("Current data:" + myCircle.toString());
        System.out.println("Diameter = " + myCircle.getDiameter());
        System.out.println("Perimeter = " + myCircle.getPerimeter());
        System.out.println("Surface = " + myCircle.getSurface());
        myCircle.setColor(userColor);
        myCircle.move(4, 1);
        System.out.println("After:" + myCircle.toString());
        System.out.println("Test of Triangle");
        System.out.println("Current data:" + myTriangle.toString());
        
        System.out.println("Perimeter = " + myTriangle.getPerimeter());
        System.out.println("Surface = " + myTriangle.getSurface());
    }

}

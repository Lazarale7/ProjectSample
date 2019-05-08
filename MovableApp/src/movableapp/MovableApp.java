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
public class MovableApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point point1 = new Point(4, 5);
        Point point2 = new Point(8);
        Rectangle rect1 = new Rectangle(point1, 4, 5);
        System.out.println(rect1.toString());
        Circle circ1 = new Circle(point2, 6);
        System.out.println(circ1.toString());
        circ1.moveUp(7);
        System.out.println("After movement:" + circ1.toString());
        rect1.moveLeft(3);
        System.out.println("After movement:" + rect1.toString());
        Point point3 = new Point();
        Triangle trian1 = new Triangle(point1, point2, point3);
        System.out.println(trian1.toString());
        trian1.moveDown(4);
        System.out.println("After movement:" + trian1.toString());

    }

}

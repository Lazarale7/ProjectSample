/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleapp;

/**
 *
 * @author Alex
 */
public class RectangleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4, 5);
        Rectangle rectangle3 = new Rectangle(6);

        System.out.println("Area of rectangle with default value = " + rectangle1.calculteArea(rectangle1));
        System.out.println("Area of rectangle with 2 parameter = " + rectangle2.calculteArea(rectangle2));
        System.out.println("Area of rectangle with 1 parameter = " + rectangle3.calculteArea(rectangle3));

    }

}

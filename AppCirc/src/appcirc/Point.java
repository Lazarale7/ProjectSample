/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcirc;

/**
 *
 * @author Alex
 */
public class Point {

    public int x;
    public int y;

    public void determineQuad() {
        if ((x == 0) && (y == 0)) {
            System.out.println("System is in center");
        } else {
            if (x > 0) {
                if (y > 0) {
                    System.out.println("Point is in 1st quadrant");
                } else {
                    System.out.println("Point is in 2nd quadrant");
                }
            } else {
                if (y < 0) {
                    System.out.println("Point is in 3rd quadrant");
                } else {
                    System.out.println("Point is in 4th quadrant");
                }
            }
        }
    }

}

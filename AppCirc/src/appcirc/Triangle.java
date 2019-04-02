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
public class Triangle {

    public Point p1;
    public Point p2;
    public Point p3;

    public void determineType() {
//        double p1_p2;
//        double p1_p3;
//        double p2_p3;
        double p1_p2 = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
        double p1_p3 = Math.sqrt(Math.pow((p3.x - p1.x), 2) + Math.pow((p3.y - p1.y), 2));
        double p2_p3 = Math.sqrt(Math.pow((p3.x - p2.x), 2) + Math.pow((p3.y - p2.y), 2));
        if ((p1_p2 == p1_p3) && (p1_p2 == p2_p3)) 
            System.out.println("Triangle is equilateral ");
        
        if ((p1_p2 == p2_p3) || (p1_p2 == p1_p3)) 
            System.out.println("Triangle is isosceles ");
        
        if (p1_p2 > p1_p3) {
            if (p1_p2 > p2_p3) {
                if (Math.pow(p1_p2, 2) == Math.pow(p1_p3, 2) + Math.pow(p2_p3, 2)) {
                    System.out.println("This triangle is right");
                }
            }
        }
        if (p1_p2 > p1_p3) {
            if (p1_p2 < p2_p3) {
                if (Math.pow(p2_p3, 2) == Math.pow(p1_p3, 2) + Math.pow(p1_p2, 2)) {
                    System.out.println("This triangle is right");
                }
            }
        }
        if (p1_p3 > p2_p3) {
            if (p1_p3 > p1_p2) {
                if (Math.pow(p1_p3, 2) == Math.pow(p2_p3, 2) + Math.pow(p1_p2, 2)) {
                    System.out.println("This triangle is right");
                }
            }
        }
    }
}

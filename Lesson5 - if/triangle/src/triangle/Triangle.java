/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.print("c = ");
        int c = scan.nextInt();
        if ((a == b) && (b == c)) {
            System.out.println("Triangle is equilateral");
        } else {
            if ((a == b) || (b == c)) {
                System.out.println("Triangle is isosceles");
            } else {
                System.out.println("Triangle is scalene");
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posorneg;

import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class PosOrNeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Input a number");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }

    }

}

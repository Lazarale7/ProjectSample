/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahtcels;

import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class FahtCels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Please introduce Fahrenheit temp value: ");
        Scanner scan = new Scanner(System.in);

        double tempFah = scan.nextDouble();
        double tempCels;
        tempCels = (5*(tempFah-32))/9;
        System.out.println("In Celsis it is: " + tempCels);
    }

}

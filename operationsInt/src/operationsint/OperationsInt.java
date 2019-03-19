/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationsint;

import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class OperationsInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        System.out.print("Please inpt Int#1: ");
        int x = scan.nextInt();
        System.out.print("Please input Int#2: ");
        int y = scan.nextInt();
        int sum = x+y;
        int diff = x-y;
        int mult = x*y;
        double aver = (x+y)/2;
        int div = x%y;
        System.out.println("The sum of these 2 numbers = "+sum);
        System.out.println("The difference of these 2 numbers = "+diff);
        System.out.println("The product of these 2 numbers = "+mult);
        System.out.println("The average of these 2 numbers = "+aver);
        System.out.println("The remainder of the devision of x by y = "+div);
                }
    
}

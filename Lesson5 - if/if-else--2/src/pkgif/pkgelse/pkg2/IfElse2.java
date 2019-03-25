/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkgelse.pkg2;

import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class IfElse2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Input 1st number ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        System.out.println("Input 2nd number ");
        double y = scan.nextDouble();
        
        
        System.out.println("Below output using if-else");
        if (x < y) 
            System.out.println("Y, is bigger: " + y);
        if (x > y) 
            System.out.println("X, is bigger: " + x);
                      
    double max = (x < y) ? y : x;
        System.out.println("This is out put using ternar"+ max);       
    
    
    }

}

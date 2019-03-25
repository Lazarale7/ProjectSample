/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticeq;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class QuadraticEq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //a*x*x+b*x+c=0 a,b,c = int type
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.print("c = ");
        int c = scan.nextInt();
        int d = b*b-4*a*c;
        double r1, r2;
        if (d<0) 
            System.out.print("No roots exist");
        else
        {
            r1 = (-b + sqrt(d))/2*a;
            r2 = (-b - sqrt(d))/2*a;
            System.out.println("root 1 ="+ r1);
            System.out.println("root 2 ="+ r2);
        }
    }

}

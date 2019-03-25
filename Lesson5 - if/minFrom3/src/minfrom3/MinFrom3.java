/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minfrom3;

import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class MinFrom3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Input 1st:");
        int x = scan.nextInt();
        System.out.print("2nd:");
        int y = scan.nextInt();
        System.out.print("3rd:");
        int z = scan.nextInt();
        System.out.println("Minimum= " + minim(minim(x, y), z));
    }

    /* public static int minim(int a, int b) // if - else
    {
        int min;
    if (a < b)
        min = a;
    else 
        min = b;
    return min;
    } */
    public static int minim(int a, int b) //ternary
    {
        int min;
        min = (a < b) ? a : b;
        return min;
    }

}

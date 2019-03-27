/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divby2for;

import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class Divby2For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please introduce a number ");
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            if ((i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }

}

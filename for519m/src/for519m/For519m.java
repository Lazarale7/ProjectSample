/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for519m;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class For519m {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int q = 0;
        int sum = 0;
        int i;
        System.out.println("Please input number");
        Scanner scan = new Scanner(System.in);
        for (i = 0;; i++) {
            int x = scan.nextInt();
            sum += x;
            q++;
            if (x == 0) {
                System.out.println("It was zero. Stop");
                break;
            }
        }

        System.out.println("Sum=" + sum);
        System.out.println("Quantity = " + q);
        System.out.println("Number of iterations-" + i);

    }
}

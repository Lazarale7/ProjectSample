/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marks;

import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class Marks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please put a mark frm 0 to 10: ");
        byte mark = scan.nextByte();
        switch (mark) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail!");
                break;
            case 5:
                System.out.println("Approved");
                break;
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("I am proud of you");
                break;
            default:
                System.out.println("Value out of range");
        }
        System.out.println("Same, but with if-else");
        if ((mark < 5) && (mark > 0)) {
            System.out.println("Fail");
        } else {
            if (mark == 5) {
                System.out.println("Approved");
            } else {
                if (mark == 6) {
                    System.out.println("Good");
                } else {
                    if ((mark == 7) || (mark == 8)) {
                        System.out.println(" Very Good");
                    } else {
                        if ((mark == 9) || (mark == 10)) {
                            System.out.println(" I am proud of you");
                        }
                    }
                }

            }
        }
    }
}

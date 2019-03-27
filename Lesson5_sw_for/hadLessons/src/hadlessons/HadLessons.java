/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadlessons;

import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class HadLessons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please introduce current day of week (format:3 letters)");
        String day = scan.nextLine();
        switch (day) {
            case "MON":

            case "TUE":
                System.out.println("MON");
                break;
            case "WED":

            case "THU":
                System.out.println("MON, WED");
                break;
            case "FRI":

            case "SAT":

            case "SUN":
                System.out.println("MON, WED, FRI");
                break;
            default:
                System.out.print("Value out of range");
                break;
        }
    }

}

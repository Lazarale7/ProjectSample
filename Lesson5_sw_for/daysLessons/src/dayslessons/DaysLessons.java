/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayslessons;

import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class DaysLessons {

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
                System.out.println("MON, WED, FRI");
                break;
            case "TUE":

            case "WED":
                System.out.println("WED, FRI");
                break;
            case "THU":

            case "FRI":
                System.out.println("FRI");
                break;
            case "SAT":

            case "SUN":
                System.out.println("Zero, weekend");
                break;
            default:
                System.out.print("Value out of range");
                break;

        }
    }

}

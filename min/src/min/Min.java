/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package min;

import java.util.Scanner;

/**
 *
 * @author user-b
 */
public class Min {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Please input number of seconds: ");
        Scanner scan = new Scanner(System.in);
        int sec = scan.nextInt();
        double year;
        double day;
        day = ((sec / 60) / 60) / 24;
        // year = day/365.25 високостный вариант
        year = day / 365;
        System.out.println("This number of seconds is equal to " + day + " days");
        System.out.println("This number of seconds is equal to " + year + " years");
    }

}

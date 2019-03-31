/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_aver.pkg1;

/**
 *
 * @author Alex
 */
public class Array_aver1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int myArray[];
        myArray = new int[4];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 3 + 11;
        }
        double average;
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        average = (double) sum / myArray.length;
        System.out.println("Sum=" + sum);
        System.out.println("Quantity " + myArray.length);
        System.out.println("Average - " + average);
    }

}

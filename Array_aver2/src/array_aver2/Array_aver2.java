/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_aver2;

/**
 *
 * @author Alex
 */
public class Array_aver2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray[];
        myArray = new int[4][4];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = i * 3 + 7 * j;
            }
        }
        double average;

        int sum = 0;
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                sum = sum + myArray[i][j];
                counter++;
            }
        }
        average = (double) sum / counter;
        System.out.println("Sum=" + sum);
        System.out.println("Quantity " + counter);
        System.out.println("Average - " + average);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_1.pkg1;

/**
 *
 * @author Alex
 */
public class Array_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int myArray[];
        myArray = new int[5];
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (i + 1) * 2;
        }
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Sum=" + sum);
    }

}

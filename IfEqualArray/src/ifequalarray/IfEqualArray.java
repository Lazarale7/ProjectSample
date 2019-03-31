/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifequalarray;

/**
 *
 * @author Alex
 */
public class IfEqualArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int myArray1[];
        int myArray2[];
        myArray1 = new int[7];
        myArray2 = new int[7];
        int counter = 0;

        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = i * 4 + 1;
        }
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = i * 4 + 1;

        }
        if (myArray1.length == myArray2.length) {
            System.out.println("Length is same.");
        } else {
            System.out.println("Length not same");

        }
        for (int i = 0; i < myArray1.length; i++) {

            if (myArray1[i] == myArray2[i]) {
                counter++;
            } else {
                System.out.println("One of elements is not equal");
                break;

            }

        }
        if (counter == myArray1.length) {
            System.out.println("All elements are equal");
        }
    }

}

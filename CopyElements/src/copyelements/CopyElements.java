/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyelements;

/**
 *
 * @author Alex
 */
public class CopyElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray1[];
        int[] myArray2[];
        myArray1 = new int[4][4];
        myArray2 = new int[4][4];
        for (int i = 0; i < myArray1.length; i++) {
            for (int j = 0; j < myArray1[i].length; j++) {
                myArray1[i][j] = i * 3 + j * 3 - 1;
                // myArray2[i][j]=0;
            }
        }

        for (int i = 0; i < myArray1.length; i++) {
            for (int j = 0; j < myArray1[i].length; j++) {
                //  System.arraycopy(myArray1[i][j], 0, myArray2[i][j], 0, myArray1[i].length); // System.arraycopy
                myArray2[i][j] = myArray1[i][j];
                // System.arraycopy
            }
        }
        System.out.println("Array2, after copy:");
        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++) {
                System.out.print(" " + myArray2[i][j]);
            }
            System.out.println(" ");
        }
    }

}

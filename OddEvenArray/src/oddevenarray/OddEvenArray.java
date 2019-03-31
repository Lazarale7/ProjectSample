/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddevenarray;

/**
 *
 * @author Alex
 */
public class OddEvenArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int myArray[];
        myArray = new int[23];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 3 + 1;
        }
        int q_Odd = 0;
        int q_Even = 0;
        for (int i = 0; i < myArray.length; i++) {
            if ((myArray[i] % 2) == 0) {
                q_Odd++;
            } else {
                q_Even++;
            }

        }
        System.out.println("Number Odds = " + q_Odd);
        System.out.println("Number of Even = " + q_Even);
    }
}

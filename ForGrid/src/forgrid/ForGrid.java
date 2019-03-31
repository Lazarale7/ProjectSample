/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forgrid;

/**
 *
 * @author Alex
 */
public class ForGrid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myArray[][];
        myArray = new String[9][9];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print("_ ");
            }
            System.out.println(" ");
        }
    }

}

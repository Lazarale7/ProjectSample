/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findindex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Alex
 */
public class FindIndex {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int myArray[];
        myArray = new int[18];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 7 + 2 * (2 * i - 1);
        }
        int userInput;
        System.out.println("Please input a natural number:");
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        userInput = Integer.parseInt(bufferedReader.readLine());
        int i;
        for (i = 0; i < myArray.length; i++) {
            if (userInput == myArray[i]) {
                System.out.println("Such element exists on position #:" + i + " of this Array");
                break;
            }
            if (i == myArray.length - 1) {
                System.out.println("Looks like no such element in the array!");
            }
        }
    }
}

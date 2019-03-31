/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforspecific;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Alex
 */
public class TestForSpecific {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int myArray[];
        myArray = new int[15];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 7 * i + i + 3;
        }
        System.out.println("Please input a natural number");

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int userInput = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == userInput) {
                System.out.println("You are right, Array has such an element!");
                break;
            }
        }
    }
}

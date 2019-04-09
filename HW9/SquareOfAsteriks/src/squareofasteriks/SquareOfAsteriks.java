/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareofasteriks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Alex
 */
public class SquareOfAsteriks {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int userInput = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= userInput; i++) {
            for (int j = 1; j <= userInput; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}

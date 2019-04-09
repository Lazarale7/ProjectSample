/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anycharsquare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Alex
 */
public class AnyCharSquare {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int userInputInt = Integer.parseInt(bufferedReader.readLine());
        String userInputString = bufferedReader.readLine();
        SymbolSquare symbolSquare = new SymbolSquare();
        System.out.println("Normal method");
        symbolSquare.printSymbolSquare(userInputInt, userInputString);
        System.out.println("Now overloaded");
        symbolSquare.printSymbolSquare(userInputString, userInputInt);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrcels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Alex
 */
public class FahrCels {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Please input temperature.");
        System.out.println("In case you have Fahrenheit, first input \"F\"");
        System.out.println("In case you have Celsius, first input \"C\"");
        String whichTemp = bufferedReader.readLine();
        double userInput = Double.parseDouble(bufferedReader.readLine());
        TempConversion temp = new TempConversion();
        switch (whichTemp) {
            case "F":
                System.out.println(userInput + " grades in Fahrenheit is equal to " + temp.convertTempToCels(userInput) + " in Celsius");
                break;
            case "C":
                System.out.println(userInput + " grades in Celsius is equal to " + temp.convertTempToFahr(userInput) + " in Fahrenheit");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }

    }
}

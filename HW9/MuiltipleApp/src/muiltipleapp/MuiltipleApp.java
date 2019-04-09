/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muiltipleapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Alex
 */
public class MuiltipleApp {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Multiple myMultiple = new Multiple();
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int numb1 = Integer.parseInt(bufferedReader.readLine());
        int numb2 = Integer.parseInt(bufferedReader.readLine());
        if (myMultiple.isMultiple(numb1, numb2)) {
            System.out.println("Yes, " + numb2 + " is a multiple of " + numb1);
        } else {
            System.out.println("No, " + numb2 + " is not a multiple of " + numb1);
        }
    }

}

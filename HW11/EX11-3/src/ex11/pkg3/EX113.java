/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11.pkg3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Alex
 */
public class EX113 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Input indexes of what to search:");
        int posStart = Integer.parseInt(bufferedReader.readLine());
        int posFinish = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input indexes of where"
                + " to search:");
        int posStart1 = Integer.parseInt(bufferedReader.readLine());
        int posFinish1 = Integer.parseInt(bufferedReader.readLine());
        //Simple version
        String str3 = str1.substring(posStart, posFinish);
        String str4 = str2.substring(posStart1, posFinish1);
        System.out.println(str4.contains(str3));
        // Chaining
        System.out.println(str2.substring(posStart1, posFinish1).contains(str1.substring(posStart, posFinish)));
    }

}

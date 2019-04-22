/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12.pkg8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alex
 */
public class EX128 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> myArray1 = new ArrayList<String>();

        String str1 = "Lond";
        String str2 = "Chisinau";
        String str3 = "Rome";
        String str4 = "Paris";
        String str5 = "Moskow";
        myArray1.add(str1);
        myArray1.add(str2);
        myArray1.add(str3);
        myArray1.add(str4);
        myArray1.add(str5);
        System.out.println(markLength4(myArray1));
        System.out.println(addStars(myArray1));

    }

    /**
     *
     * @param myArray
     * @return
     */
    public static ArrayList markLength4(ArrayList<String> myArray) {
        ArrayList<String> myArrayClone = new ArrayList<String>();
        Iterator<String> myIter = myArray.iterator();
        while (myIter.hasNext()) {
            StringBuilder strSB = new StringBuilder(myIter.next());
            if (strSB.length() == 4) {
                strSB.insert(0, "****");
            }
            myArrayClone.add(strSB.toString());
        }
        return myArrayClone;
    }

    public static ArrayList addStars(ArrayList<String> myArray) {
        ArrayList<String> myArrayClone = new ArrayList<String>();
        Iterator<String> myIter = myArray.iterator();
        while (myIter.hasNext()) {
            StringBuilder strSB = new StringBuilder(myIter.next());
            strSB.insert(strSB.length(), "*");
            myArrayClone.add(strSB.toString());
        }
        return myArrayClone;
    }
}

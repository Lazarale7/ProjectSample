/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12.pkg5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alex
 */
public class EX125 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> myArrayList = new ArrayList<String>();
        String line1 = "String1";
        String line2 = "String2";
        String line3 = "String3";
        String line4 = "String4";
        myArrayList.add(line1);
        myArrayList.add(line2);
        myArrayList.add(line3);
        myArrayList.add(line4);
        System.out.println("For loop:");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println("For-each loop:");
        for (String element : myArrayList) {
            System.out.println(element);
        }
        System.out.println("Iterator:");
        Iterator<String> myIter = myArrayList.iterator();
        while (myIter.hasNext()) {
            System.out.println(myIter.next());
        }
        System.out.println("While:");
        int i = 0;
        while (i < myArrayList.size()) {
            System.out.println(myArrayList.get(i));
            i++;

        }
    }

}

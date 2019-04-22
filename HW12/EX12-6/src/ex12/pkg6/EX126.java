/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12.pkg6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Alex
 */
public class EX126 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> myArray1 = new ArrayList<String>();
        ArrayList<Integer> myArray2 = new ArrayList<Integer>();
        String str1 = "London";
        String str2 = "Chisinau";
        String str3 = "Rome";
        String str4 = "Paris";
        String str5 = "Moskow";
        myArray1.add(str1);
        myArray1.add(str2);
        myArray1.add(str3);
        myArray1.add(str4);
        myArray1.add(str5);
        myArray2.add(34);
        myArray2.add(4);
        myArray2.add(878);
       // myArray2.add(654);
        for (int i = 0; i < myArray2.size(); i++) {
            myArray1.add(Integer.toString(myArray2.get(i)));
        }
        System.out.println(myArray1);
        System.out.println("myArray2:" + myArray2);
        myArray2.clear();
        System.out.println("myArray2, after clear:" + myArray2);
        myArray1.remove(1);
        myArray1.set(1, "Kiev");
        System.out.println(myArray1);
        ArrayList<String> myArray3 = new ArrayList<String>();
        myArray3.add("girls");
        myArray3.add("boys");
        myArray3.add("day");
        myArray3.add("weekS");
        System.out.println("myArray3:" + myArray3);
        System.out.println("myArray3:" + removePlurals(myArray3));
        System.out.println(compareArrays(myArray3, myArray1));
        System.out.println(compareArrays(myArray3, myArray3));
        System.out.println("myArray1:" + myArray1);
        System.out.println("myArray1 switched:" + switchPairs(myArray1));

    }

    public static ArrayList switchPairs(ArrayList<String> myArray) {
        ArrayList<String> newArray = new ArrayList<String>();

        for (int i = 1; i < myArray.size(); i = i + 2) {
            newArray.add(myArray.get(i));
            newArray.add(myArray.get(i - 1));
        }
        if ((myArray.size() % 2) != 0) {
            String temp = myArray.get(myArray.size() - 1);
            newArray.add(temp);
        }
        return newArray;
    }

    public static boolean compareArrays(ArrayList<String> myArray, ArrayList<String> myArray1) {
        int counter = 0;
        if (myArray.size() != myArray1.size()) {
            return false;
        } else {
            for (int i = 0; i < myArray.size(); i++) {
                if (myArray.get(i).equals(myArray1.get(i))) {
                    counter++;
                } else {
                }

            }
            if (counter == myArray.size()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static ArrayList removePlurals(ArrayList<String> myArray) {
        ArrayList<String> myArrayClone = new ArrayList<String>();
        Iterator<String> myIter = myArray.iterator();
        while (myIter.hasNext()) {
            StringBuilder strSB = new StringBuilder(myIter.next());
            if ((strSB.charAt(strSB.length() - 1) == 's') || (strSB.charAt(strSB.length() - 1) == 'S')) {
                strSB.deleteCharAt(strSB.length() - 1);
            } else {
            }

            myArrayClone.add(strSB.toString());
        }
        return myArrayClone;

    }
}

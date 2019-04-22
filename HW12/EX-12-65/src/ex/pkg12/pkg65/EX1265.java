/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg12.pkg65;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class EX1265 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "String1";
        String str2 = "String2";
        String str3 = "String3";
        String str4 = "String4";

        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add(str1);
        myArrayList.add(str2);
        myArrayList.add(str3);
        myArrayList.add(str4);

        for (String element : myArrayList) {
            StringBuilder sb = new StringBuilder(element);
            StringBuilder sb1 = new StringBuilder(sb);
            int j = 0;
            for (int i = 0; i < sb.length(); i++) {
                sb1.replace(sb1.length() - (i + 1), sb1.length() - i, sb.substring(i, i + 1));
            }
            System.out.println(sb1.toString());
            //myArrayList.clear();
            myArrayList.set(j, sb1.toString());
            j++;

        }
        System.out.println(myArrayList);
    }
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
}

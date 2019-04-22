/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12.pkg9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alex
 */
public class EX129 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        ArrayList<Integer> myArrayList1 = new ArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(4);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(11);
        myArrayList.add(15);
        myArrayList.add(17);
        myArrayList.add(28);
        myArrayList.add(41);
        myArrayList.add(59);
        myArrayList1.add(4);
        myArrayList1.add(7);
        myArrayList1.add(11);
        myArrayList1.add(17);
        myArrayList1.add(19);
        myArrayList1.add(20);
        myArrayList1.add(23);
        myArrayList1.add(28);
        myArrayList1.add(37);
        myArrayList1.add(59);
        myArrayList1.add(81);

        System.out.println(intersect(myArrayList, myArrayList1));
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> myArr, ArrayList<Integer> myArr1) {
        //Integer i, j;
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        for (Integer i : myArr) {
            for (Integer j : myArr1) {
                if (i.equals(j)) {
                    tempArray.add(j);

                }
            }

        }
        return tempArray;
    }

}

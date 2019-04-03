/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp;

/**
 *
 * @author Alex
 */
public class Array {

    int myArray1[] = {4, 6, 7, 8, 2, 3, 4, 76, 43, 71, 33, -1, 65, 3};
     
    
    public void arrayFill() {
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = i * 2 + 3;
        }
    }

    public void arrayPrint() {
        for (int i = 0; i < myArray1.length; i++) {
            System.out.println(myArray1[i] + " ");
        }
    }

    public void sum() {
        int sum = 0;
        for (int i = 0; i < myArray1.length; i++) {
            sum += myArray1[i];

        }
        System.out.println("Sum of Array=" + sum);
    }

    public void average() {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < myArray1.length; i++) {
            sum += myArray1[i];
            average = sum / myArray1.length;

        }
        System.out.println("Average = " + average);
    }

    public void even() {
        int evenCounter = 0;
        for (int i = 0; i < myArray1.length; i++) {
            if ((myArray1[i] % 2) == 0) {
                evenCounter++;

            }
        }
        System.out.println("Number of Even = " + evenCounter);
    }

    public void odd() {
        int oddCounter = 0;
        for (int i = 0; i < myArray1.length; i++) {
            if ((myArray1[i] % 2) != 0) {
                oddCounter++;

            }
        }
        System.out.println("Number of Odd = " + oddCounter);
    }
    public void ArrayLength(){
        System.out.println("Array Length = "+myArray1.length);
    }
}

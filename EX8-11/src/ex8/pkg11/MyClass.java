/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8.pkg11;

/**
 *
 * @author Alex
 */
public class MyClass {

    private static int counter = 0;

    static void count() {
        counter++;
    }

   static void printCounter() {
        System.out.println("Counter-" + counter);
    }

}

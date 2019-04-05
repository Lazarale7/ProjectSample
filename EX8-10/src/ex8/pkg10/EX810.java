/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8.pkg10;

/**
 *
 * @author Alex
 */
public class EX810 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass obj1 = new MyClass();
        System.out.println("Printing with object:");
        System.out.println(obj1.a);
        System.out.println(obj1.line);
        System.out.println(obj1.logicVar);
        System.out.println(obj1.pi);
        System.out.println("Printing with class:");
        MyClass.printing();
    }
    
}

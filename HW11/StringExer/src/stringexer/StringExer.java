/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringexer;

/**
 *
 * @author Alex
 */
public class StringExer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "Let's go home, it's late already!";
        String s;
        System.out.println(str1.charAt(6));
        System.out.println(str1.charAt(10));
        System.out.println(str1.indexOf("go"));
        System.out.println(str1.indexOf("late"));
        System.out.println(str1.endsWith("dy!"));
        String str2 = "Abracadabra";
        System.out.println(str1.equals(str2));
        String str3 = str1;
        System.out.println(str1.equals(str3));
        String str4 = "ABRACADABRA";
        System.out.println(str3.equalsIgnoreCase(str4));
    }
    
}



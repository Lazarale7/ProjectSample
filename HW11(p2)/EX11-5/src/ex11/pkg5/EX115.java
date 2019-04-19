/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11.pkg5;

/**
 *
 * @author Alex
 */
public class EX115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "welllcommmmeee";
        String s1 = "It is a string";
        //Part 1
        int counter = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i - 1) && (s.charAt(i) == s.charAt(i + 1))) {
                counter++;
            }
        }
        System.out.println("Number of triples=" + counter);
        //Part 2
        System.out.println(s1.replace("is", "is not"));
        //Part 3
        String s2 = "ab5c2d4ef12s";
        System.out.println(s2);
       // System.out.println(deleteAllButNumber(s2));
        System.out.println(getSumFromIntString(deleteAllButNumber(s2)));
    }

    public static String deleteAllButNumber(String str1) {
        StringBuilder sb = new StringBuilder(str1.length());
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if ((c > 47) && (c < 58)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static int getSumFromIntString(String str1) {
        int sum = 0;
        for (int i = 0; i < str1.length(); i++) {
            int j = Integer.parseInt(str1.substring(i, i + 1));
            sum += j;
        }

        return sum;
    }
}



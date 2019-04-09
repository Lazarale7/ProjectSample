/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anycharsquare;

/**
 *
 * @author Alex
 */
public class SymbolSquare {

    public void printSymbolSquare(int number, String line) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(line);
            }
            System.out.println("");
        }
    }

    public void printSymbolSquare(String line, int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(line);
            }
            System.out.println("");
        }
    }
}


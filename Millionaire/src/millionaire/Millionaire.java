/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alex
 */
public class Millionaire {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        GameLogic game = new GameLogic();
        System.out.println("Добро пожаловать в игру!");
        System.out.println("Вы знаете правила");
        System.out.println("Введите Ваше имя...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Player.setName(reader.readLine());
        game.playGame();

    }

}

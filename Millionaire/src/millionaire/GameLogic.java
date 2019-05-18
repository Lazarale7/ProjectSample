/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Alex Класс описывает логику игры
 */
public class GameLogic {

    //public static ArrayList<Question> myList;
    /**
     *
     * @throws IOException Метод запускает игру
     */
    public void playGame() throws IOException {
        Player.setScore(0);
        int a = 0;
        ArrayList<Question> myList = new ArrayList<>();
        GameLogic.addQuestions(myList);

        a = this.playQuestion(myList.get(0));
        Player.setScore(Player.getScore() + a);
        a = this.playQuestion(myList.get(1));
        Player.setScore(Player.getScore() + a);
        a = this.playQuestion(myList.get(2));
        Player.setScore(Player.getScore() + a);
        System.out.println("Спасибо за игру!");
        System.out.println(Player.getName() + ", Вы заработали : " + Player.getScore());

    }

    /**
     *
     * @param question
     * @return
     * @throws IOException Метод запускает вопрос игроку. В качестве параметра
     * передается объъекта класс Question Результатом выполнения метода является
     * награда за правильное решение вопроса. В случае правильного ответа,
     * награда = награде за решение вопроса В случае неправильного, награда = 0
     */
    public int playQuestion(Question question) throws IOException {
        System.out.println("Ответьте, пожалуйста, на следующий вопрос!");
        System.out.println(question.getQuestion());
        System.out.println("Варианты ответа: ");
        System.out.println(question.getAnswerA());
        System.out.println(question.getAnswerB());
        System.out.println(question.getAnswerC());
        System.out.println(question.getAnswerD());
        System.out.println("какой ваш вариант?  ***введите цифру от 1 до 4***");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (Integer.parseInt(reader.readLine()) == question.getCorrectAnswer()) {
            System.out.println("Вы ответили правильно! Поздравляю!");
            return question.getReward();
        } else {
            System.out.println("К сожалению ответ неверный! Уверен, Вам повезет в следующий раз!");
            return 0;
        }

    }

//    public Question chooseQuestion() {
//
//    }
    public static void addQuestions(ArrayList<Question> myList) {

        Question question1 = new Question("Question?", "AnswerA", "*AnswerB", "AnswerC", "AnswerD", 2, 1, 500);
        Question question2 = new Question("Question?", "*AnswerA", "AnswerB", "AnswerC", "AnswerD", 1, 1, 500);
        Question question3 = new Question("Question?", "AnswerA", "AnswerB", "*AnswerC", "AnswerD", 3, 2, 1000);
        Question question4 = new Question("Question?", "AnswerA", "AnswerB", "*AnswerC", "AnswerD", 3, 2, 1000);
        myList.add(question1);
        myList.add(question2);
        myList.add(question3);
        myList.add(question4);

    }
}

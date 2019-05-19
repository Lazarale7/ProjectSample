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
import java.util.Random;

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
        Player.setCurrentLevel(1);
        int a = 1;
        int maxLevel = 4;
        ArrayList<Question> myList = new ArrayList<>();
        addQuestions(myList);
        while ((a != 0) && (Player.getCurrentLevel() <= maxLevel)) {
            a = playQuestion(chooseQuestion(myList));
            Player.setScore(Player.getScore() + a);
        }

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
     * награда = награде за решение вопроса. В случае неправильного, награда = 0
     */
    public static int playQuestion(Question question) throws IOException {

        System.out.println("Ответьте, пожалуйста, на следующий вопрос (Уровень " + Player.getCurrentLevel() + ")!");
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
            Player.setCurrentLevel(Player.getCurrentLevel() + 1);
            return question.getReward();
        } else {
            System.out.println("К сожалению ответ неверный! Уверен, Вам повезет в следующий раз!");
            System.out.println("Вы дошли до уровня:" + Player.getCurrentLevel());
            return 0;
        }

    }

    public static void helpToSolve() {

    }

    /**
     *
     * @param myList Метод добавляет все существующие вопросы в список
     */
    public static void addQuestions(ArrayList<Question> myList) {

        Question question1 = new Question("Question1?", "AnswerA", "*AnswerB", "AnswerC", "AnswerD", 2, 1, 500);
        Question question2 = new Question("Question2?", "*AnswerA", "AnswerB", "AnswerC", "AnswerD", 1, 1, 500);
        Question question3 = new Question("Question3?", "AnswerA", "AnswerB", "*AnswerC", "AnswerD", 3, 2, 1000);
        Question question4 = new Question("Question4?", "AnswerA", "AnswerB", "*AnswerC", "AnswerD", 3, 2, 1000);
        Question question5 = new Question("Question5?", "AnswerA", "*AnswerB", "AnswerC", "AnswerD", 2, 3, 5000);
        Question question6 = new Question("Question6?", "*AnswerA", "AnswerB", "AnswerC", "AnswerD", 1, 3, 5000);
        Question question7 = new Question("Question7?", "AnswerA", "AnswerB", "*AnswerC", "AnswerD", 3, 4, 10000);
        Question question8 = new Question("Question8?", "AnswerA", "AnswerB", "*AnswerC", "AnswerD", 3, 4, 10000);
        myList.add(question1);
        myList.add(question2);
        myList.add(question3);
        myList.add(question4);
        myList.add(question5);
        myList.add(question6);
        myList.add(question7);
        myList.add(question8);

    }

    /**
     *
     * @param list
     * @param level
     * @return Метод выбирает случайный вопрос из списка возможных на данном
     * уровне
     */
    public static Question chooseQuestion(ArrayList<Question> list) {
        Question outputQuestion;
        ArrayList<Question> listLevel = new ArrayList<>();
        for (Question question : list) {
            if (question.getLevel() == Player.getCurrentLevel()) {
                listLevel.add(question);
            }
        }
        outputQuestion = listLevel.get(getRandomInt(0, listLevel.size() - 1));
        System.out.println(outputQuestion.toString());
        return outputQuestion;

    }

    /**
     *
     * @param min
     * @param max
     * @return Возвращает случайно целое число в диапазоне от min до max
     * включительно
     */
    private static int getRandomInt(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}

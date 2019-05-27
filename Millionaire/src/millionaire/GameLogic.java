/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
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
        String helper;
        System.out.println("Ответьте, пожалуйста, на следующий вопрос (Уровень " + Player.getCurrentLevel() + ")!");
        System.out.println(question.getQuestion());
        System.out.println("Варианты ответа: ");
        System.out.println(question.getAnswerA());
        System.out.println(question.getAnswerB());
        System.out.println(question.getAnswerC());
        System.out.println(question.getAnswerD());
        System.out.println("какой ваш вариант?  ***введите цифру от 1 до 4***");
        System.out.println("Подсказки: a - зал, p - звонок, f - 50/50");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        helper = reader.readLine();
        if (helper.equals("a")) {
            helper = helpToSolve(helper, question);
        }
        if (helper.equals("p")) {
            helper = helpToSolve(helper, question);
        }
        if (helper.equals("f")) {
            helper = helpToSolve(helper, question);
        }
        if (Integer.parseInt(helper) == question.getCorrectAnswer()) {
            System.out.println("Вы ответили правильно! Поздравляю!");
            Player.setCurrentLevel(Player.getCurrentLevel() + 1);
            return question.getReward();
        } else {
            System.out.println("К сожалению ответ неверный! Уверен, Вам повезет в следующий раз!");
            System.out.println("Вы дошли до уровня:" + Player.getCurrentLevel());
            return 0;
        }

    }

    /**
     *
     * @param inputHelper Метод подсказок
     * @param inputQuestion
     * @return
     * @throws java.io.IOException
     */
    public static String helpToSolve(String inputHelper, Question inputQuestion) throws IOException {
        String output = " ";
        if (inputHelper.equals("a")) {
            double i1 = 1;
            double i2 = 2;
            double i3 = 3;
            double i4 = 4;
            double iSum = 0;

            if (inputQuestion.getCorrectAnswer() == 1) {
                i1 = 1 * 10;
            }
            if (inputQuestion.getCorrectAnswer() == 2) {
                i2 = 2 * 10;
            }
            if (inputQuestion.getCorrectAnswer() == 3) {
                i3 = 3 * 10;
            }
            if (inputQuestion.getCorrectAnswer() == 4) {
                i4 = 4 * 10;
            }
            iSum = i1 + i2 + i3 + i4;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("The audience thinks as below:");
            System.out.println("Answer A: " + inputQuestion.getAnswerA() + "   " + df.format((i1 / iSum) * 100) + "%");
            System.out.println("Answer B: " + inputQuestion.getAnswerB() + "   " + df.format((i2 / iSum) * 100) + "%");
            System.out.println("Answer C: " + inputQuestion.getAnswerC() + "   " + df.format((i3 / iSum) * 100) + "%");
            System.out.println("Answer D: " + inputQuestion.getAnswerD() + "   " + df.format((i4 / iSum) * 100) + "%");
            System.out.println("Please make your choice: ");
            BufferedReader helperReader = new BufferedReader(new InputStreamReader(System.in));
            output = helperReader.readLine();
        }
        if (inputHelper.equals("p")) {
            System.out.println("Мы позвоним Вашему другу Алексею");
            if (inputQuestion.getCorrectAnswer() == 1) {
                System.out.println("Алексей, считает, что правильный ответ:" + inputQuestion.getAnswerA());
            }
            if (inputQuestion.getCorrectAnswer() == 2) {
                System.out.println("Алексей, считает, что правильный ответ:" + inputQuestion.getAnswerB());
            }
            if (inputQuestion.getCorrectAnswer() == 3) {
                System.out.println("Алексей, считает, что правильный ответ:" + inputQuestion.getAnswerC());
            }
            if (inputQuestion.getCorrectAnswer() == 4) {
                System.out.println("Алексей, считает, что правильный ответ:" + inputQuestion.getAnswerD());
            }
            System.out.println("Please make your choice: ");
            BufferedReader helperReader = new BufferedReader(new InputStreamReader(System.in));
            output = helperReader.readLine();
        }
        if (inputHelper.equals("f")) {
            int rand = inputQuestion.getCorrectAnswer();
            System.out.println("Уважаемый, компьютер, уберите, 2 неправильных ответа.");
            while (rand == inputQuestion.getCorrectAnswer()) {
                rand = getRandomInt(1, 4);
            }
            if (rand < inputQuestion.getCorrectAnswer()) {
                System.out.println("Now you need to choose from: ");
                System.out.println(getStringAnswer(rand, inputQuestion));
                System.out.println(getStringAnswer(inputQuestion.getCorrectAnswer(), inputQuestion));
            } else {
                System.out.println("Now you need to choose from: ");
                System.out.println(getStringAnswer(inputQuestion.getCorrectAnswer(), inputQuestion));
                System.out.println(getStringAnswer(rand, inputQuestion));
            }
            System.out.println("Please make your choice: ");

            BufferedReader helperReader = new BufferedReader(new InputStreamReader(System.in));
            output = helperReader.readLine();
        }
        return output;
    }

    public static String getStringAnswer(int i, Question question) {
        switch (i) {
            case 1:
                return question.getAnswerA();
            case 2:
                return question.getAnswerB();
            case 3:
                return question.getAnswerC();
            case 4:
                return question.getAnswerD();
            default:
                return "Something is wrong!";
        }
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

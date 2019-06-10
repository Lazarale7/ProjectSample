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
    public int playGame() throws IOException {
        String continueString = "";
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

        System.out.println("Thank you for playing!");
        System.out.println(Player.getName() + ", You have earned : " + Player.getScore());
        System.out.println("You want to play one more time?");
        System.out.println("If yes, type Yes, or Y?");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        continueString = reader1.readLine();
        if (continueString.equalsIgnoreCase("yes") || continueString.equalsIgnoreCase("y")) {
            return 1;
        } else {
            return 0;
        }

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
        System.out.println("Currently you have earned " + Player.getScore() + " totally!");
        System.out.println("Please answer the following question. (Level " + Player.getCurrentLevel() + ")!");
        System.out.println("In case of correct answer you will receive: " + question.getReward());
        System.out.println("\033[31m" + question.getQuestion());
        System.out.println("You can choose from: ");
        System.out.println("\033[32m" + question.getAnswerA());
        System.out.println("\033[34m" + question.getAnswerB());
        System.out.println("\033[35m" + question.getAnswerC());
        System.out.println("\033[36m" + question.getAnswerD());
        System.out.println("What you choose  ***please input digit from 1 to 4***");
        System.out.println("\033[30mHelpers: a - from audience, p - call to friend, f - 50/50");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        helper = reader.readLine();
        if (helper.equals("a")) {
            if (Player.isHasAudienceHelper()) {
                helper = helpToSolve(helper, question);
                Player.setHasAudienceHelper(false);
            } else {
                System.out.println("You have no such option for help available!");
                System.out.println("Input correctly");
                helper = reader.readLine();
            }
        }

        if (helper.equals("p")) {
            if (Player.isHasPhoneHelper()) {
                helper = helpToSolve(helper, question);
                Player.setHasPhoneHelper(false);
            } else {
                System.out.println("You have no such option for help available!");
                System.out.println("Input correctly");
                helper = reader.readLine();
            }
        }
        if (helper.equals("f")) {
            if (Player.isHas50Helper()) {
                helper = helpToSolve(helper, question);
                Player.setHas50Helper(false);
            } else {
                System.out.println("You have no such option for help available!");
                System.out.println("Input correctly");
                helper = reader.readLine();
            }
        }
        if (Integer.parseInt(helper) == question.getCorrectAnswer()) {
            System.out.println("Your answer is correct!");
            System.out.println("You have earned - " + question.getReward());
            Player.setCurrentLevel(Player.getCurrentLevel() + 1);
            return question.getReward();
        } else {
            System.out.println("Unfortunatelly you gave a wrong answer! Try next time!");
            System.out.println("You have reached level:" + Player.getCurrentLevel());
            return 0;
        }

    }

    /**
     * Метод подсказок
     *
     * @param inputHelper
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
            System.out.println("\033[43mThe audience thinks as below:");
            System.out.println("\033[0mAnswer A: " + inputQuestion.getAnswerA() + "   " + df.format((i1 / iSum) * 100) + "%");
            System.out.println("Answer B: " + inputQuestion.getAnswerB() + "   " + df.format((i2 / iSum) * 100) + "%");
            System.out.println("Answer C: " + inputQuestion.getAnswerC() + "   " + df.format((i3 / iSum) * 100) + "%");
            System.out.println("Answer D: " + inputQuestion.getAnswerD() + "   " + df.format((i4 / iSum) * 100) + "%");
            System.out.println("Please make your choice: ");
            BufferedReader helperReader = new BufferedReader(new InputStreamReader(System.in));
            output = helperReader.readLine();
        }
        if (inputHelper.equals("p")) {
            System.out.println("We will call your friend, Alexei.");
            if (inputQuestion.getCorrectAnswer() == 1) {
                System.out.println("Alexei, thinks that correct answer is:" + inputQuestion.getAnswerA());
            }
            if (inputQuestion.getCorrectAnswer() == 2) {
                System.out.println("Alexei, thinks that correct answer is:" + inputQuestion.getAnswerB());
            }
            if (inputQuestion.getCorrectAnswer() == 3) {
                System.out.println("Alexei, thinks that correct answer is:" + inputQuestion.getAnswerC());
            }
            if (inputQuestion.getCorrectAnswer() == 4) {
                System.out.println("Alexei, thinks that correct answer is:" + inputQuestion.getAnswerD());
            }
            System.out.println("Please make your choice: ");
            BufferedReader helperReader = new BufferedReader(new InputStreamReader(System.in));
            output = helperReader.readLine();
        }
        if (inputHelper.equals("f")) {
            int rand = inputQuestion.getCorrectAnswer();
            System.out.println("Please remove 2 incorrect answers");
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

    /**
     * Метод возвращает ответ, чей порядковый номер был получен в качестве
     * параметра
     *
     * @param i
     * @param question
     * @return
     */
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
     * Метод добавляет все существующие вопросы в список
     *
     * @param myList
     */
    public static void addQuestions(ArrayList<Question> myList) {

        Question question1 = new Question("In the UK, VAT stands for value-added ...?", "AnswerA", "*AnswerB", "AnswerC", "AnswerD", 2, 1, 500);
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
     * Метод выбирает случайный вопрос из списка возможных на данном уровне
     *
     * @param list
     * @param level
     * @return
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
     * Возвращает случайно целое число в диапазоне от min до max включительно
     *
     * @param min
     * @param max
     * @return
     */
    private static int getRandomInt(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}

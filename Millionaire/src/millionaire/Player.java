/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaire;

/**
 *
 * @author Alex Класс описывает игрока и его текущее состояние. Состояние игрока
 * - Имя игрока и текущий счет
 */
public class Player {

    private static String name;
    private static int score;
    private static int currentLevel;
    private static boolean hasAudienceHelper = true;
    private static boolean hasPhoneHelper = true;
    private static boolean has50Helper = true;

    public static boolean isHasAudienceHelper() {
        return hasAudienceHelper;
    }

    public static void setHasAudienceHelper(boolean hasAudienceHelper) {
        Player.hasAudienceHelper = hasAudienceHelper;
    }

    public static boolean isHasPhoneHelper() {
        return hasPhoneHelper;
    }

    public static void setHasPhoneHelper(boolean hasPhoneHelper) {
        Player.hasPhoneHelper = hasPhoneHelper;
    }

    public static boolean isHas50Helper() {
        return has50Helper;
    }

    public static void setHas50Helper(boolean has50Helper) {
        Player.has50Helper = has50Helper;
    }

    public static String getName() {
        return name;
    }

    public static int getScore() {
        return score;
    }

    public static void setName(String name) {
        Player.name = name;
    }

    public static void setScore(int score) {
        Player.score = score;
    }

    public static int getCurrentLevel() {
        return currentLevel;
    }

    public static void setCurrentLevel(int currentLevel) {
        Player.currentLevel = currentLevel;
    }

}

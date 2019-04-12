/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidayapp;

/**
 *
 * @author Alex
 */
public class Holiday {

    private String name;
    private int day;
    private String month;

    Holiday(String newName, int newDay, String newMonth) {
        this.name = newName;
        this.day = newDay;
        this.month = newMonth;
    }

    public boolean isSameMonth(Holiday holiday1, Holiday holiday2) {
        if (holiday1.month.equals(holiday2.month)) {
            return true;
        } else {
            return false;
        }
    }

    public double avgDate(Holiday holidayArr[]) {
        int sum = 0;
        for (int i = 0; i <= holidayArr.length; i++) {
            sum += holidayArr[i].day;
        }
        return sum / holidayArr.length;
    }

}

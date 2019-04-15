/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetestnew;

/**
 *
 * @author Alex
 */
public class DateNew {

    private int day;
    private int month;
    private int year;

    public void setDay(int newDay) {
        if ((newDay > 0) && (newDay <= 31)) {
            this.day = newDay;
        } else {
            System.out.println("Value out of range");
        }
    }

    public void setMonth(int newMonth) {
        if ((newMonth > 0) && (newMonth <= 12)) {
            this.month = newMonth;
        } else {
            System.out.println("Value out of range");
        }
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }

}

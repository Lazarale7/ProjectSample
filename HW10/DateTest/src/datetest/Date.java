/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetest;

/**
 *
 * @author Alex
 */
public class Date {

    int day;
    int month;
    int year;

    Date(int newDay, int newMonth, int newYear) {
        this.day = newDay;
        this.month = newMonth;
        this.year = newYear;
    }

    public void displayDate() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }
}

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
public class DateTestNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateNew myDate = new DateNew();
        myDate.setDay(15);
        myDate.setMonth(7);
        myDate.setYear(1983);
        myDate.displayDate();
        
        myDate.getYear();
    }

}

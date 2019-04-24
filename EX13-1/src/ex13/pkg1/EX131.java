/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13.pkg1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Alex
 */
public class EX131 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate local = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter ltF = DateTimeFormatter.ofPattern("H m s");
        System.out.print(local);
        System.out.print(" ");
        System.out.println(ltF.format(localTime));
        System.out.println("Point#2");
        System.out.println(ltF.format(localTime.plusHours(2)));
        System.out.println("Point#3");

        LocalDate dateA = LocalDate.of(1983, 7, 4);
        LocalDate dateK = LocalDate.of(1982, 7, 8);

        Period period = Period.between(dateA, dateK);
        System.out.println(period);

        System.out.println("Point #4");
        System.out.println(local.plusDays(10));
        System.out.println(local.minusDays(10));

        System.out.println("Point #5");
        String str = "JAN 1,2020";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d,yyyy");
        LocalDateTime localDate = LocalDateTime.parse(str, format);

        System.out.println(localDate);
        System.out.println(format.format(localDate));

        System.out.println("Point #6");
        Period ageAlex = Period.between(dateA, LocalDate.now());
        System.out.print("Age :");
        System.out.println(ageAlex);
    }

}

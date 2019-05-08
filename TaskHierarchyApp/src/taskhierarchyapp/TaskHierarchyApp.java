/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskhierarchyapp;

/**
 *
 * @author Alex
 */
public class TaskHierarchyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OutTask task1 = new OutTask("My message");
        OutTask task2 = new OutTask("My new message");
        RandomOutTask task3 = new RandomOutTask();
        RandomOutTask task4 = new RandomOutTask();
        CounterOutTask task5 = new CounterOutTask();
        task5.execute();
        task1.execute();
        task2.execute();
        task3.execute();
        task4.execute();
        task5.execute();

    }

}

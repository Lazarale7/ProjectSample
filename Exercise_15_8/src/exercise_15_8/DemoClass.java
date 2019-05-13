/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_15_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DemoClass {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Task c = new CounterOutTask();
    Task c1 = new CounterOutTask();
    Task c2 = new CounterOutTask();
    Task r1 = new RandomOutTask();
    Task r2 = new RandomOutTask();
    Task t1 = new OutTask("Test message");
    Task t2 = new OutTask("Second test message");

    ArrayList<Task> list = new ArrayList<Task>();
    list.add(c);
    list.add(c1);
    list.add(c2);
    list.add(r1);
    list.add(r2);
    list.add(t1);
    list.add(t2);

    for (Task task : list) {
      task.execute();
    }

    System.out.println();

    for (Task list1 : list) {
      System.out.println(list1.toString());
    }
    ArrayList<Task> list1 = new ArrayList<Task>();
    ArrayList<Task> list2 = new ArrayList<Task>();
    ArrayList<Task> list3 = new ArrayList<Task>();

    Container container1 = new Stack(list);
    Container container2 = new Stack(list1);
    Container container5 = new Stack(list3);
    Container container3 = new Queue(list);
    Container container4 = new Queue(list2);

    System.out.println("Full List");
    container1.toPrint();
    container1.pop();
    System.out.println("List after 1 pop");
    container1.toPrint();
    System.out.println("Full List");
    container3.toPrint();
    
    System.out.println(container1.isEmpty());
    System.out.println(container2.isEmpty());
    System.out.println(container3.isEmpty());
    System.out.println(container4.isEmpty());

    System.out.println("push LIFO");
    container2.push(container1.pop());
    container2.toPrint();
    System.out.println("push FIFO");
    container4.push(container1.pop());
    container4.toPrint();

    System.out.println("containers sizes");
    System.out.println(container1.size());
    System.out.println(container2.size());
    System.out.println(container3.size());
    System.out.println(container4.size());

    container1.toPrint();
    container1.transferFrom(container5);
    System.out.println("transfer container LIFO");
    container5.toPrint();
    System.out.println("transfer container FIFO");
    container5.transferFrom(container1);
    container1.toPrint();
    
  }
}
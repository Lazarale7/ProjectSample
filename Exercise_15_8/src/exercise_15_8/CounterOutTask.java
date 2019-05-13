/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_15_8;

//One of the tasks will print a message at the console. The message has to be provided as parameter to the constructor. (OutTask.java)
//Last type of task will increment a global counter every time the task is executed and print its value in the end. (CounterOutTask.java).
//
//Create several instances of tasks, add them to a list and then call the execute() method on each of them.
/**
 *
 * @author Admin
 */
public class CounterOutTask extends AbstractTask implements Task {

  static int counter = 0;

  CounterOutTask() {
  }

  @Override
  public void execute() {
    super.execute();

    counter++;
    System.out.println(counter);
  }

  @Override
  public String toString() {
    return "{" + super.toString() + '}';
  }
}

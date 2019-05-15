/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

import task.Task;

/**
 *
 * @author Alex
 */
public class CounterTaskRunner extends AbstractTaskRunner implements TaskRunner {

  public int counter = 0;

  @Override
  public void afterExecution(Task task) {
    this.counter++;
    System.out.println("Currently counter (runner) = " + this.counter);
  }

}

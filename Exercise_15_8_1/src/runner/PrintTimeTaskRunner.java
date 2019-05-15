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
public class PrintTimeTaskRunner extends AbstractTaskRunner implements TaskRunner {

  @Override
  public void afterExecution(Task task) {
    System.out.println("After Execution: " + "was created: " + task.getCreatedAt() + " || " + "was executed: " + task.getExecutedAt());
  }

}

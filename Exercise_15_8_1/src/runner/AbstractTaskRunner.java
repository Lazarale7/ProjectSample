/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

import container.Container;
import container.Stack;
import java.util.ArrayList;
import task.Task;

/**
 *
 * @author Alex
 */
public abstract class AbstractTaskRunner implements TaskRunner {

  protected Container container;

  public AbstractTaskRunner() {
    Container tempContainer = new Stack();
    this.container = tempContainer;
  }

  @Override
  public void add(Task task) {
    this.container.push(task);
  }

  @Override
  public void executeAll() {
    while (!container.isEmpty()) {
      Task tempTask = container.pop();
      tempTask.execute();
      this.afterExecution(tempTask);
    }
  }

  public abstract void afterExecution(Task task);
}

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
public interface TaskRunner {

  public void add(Task task);

  public void executeAll();

  public void afterExecution(Task task);

}

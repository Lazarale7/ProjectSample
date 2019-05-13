/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_15_8;

import java.time.LocalDateTime;

//One of the tasks will print a message at the console. The message has to be provided as parameter to the constructor. (OutTask.java)
//The second type of tasks will generate a random number and print it at the console. The number should be generated at the time when the task is being created. (RandomOutTask.java)
//Last type of task will increment a global counter every time the task is executed and print its value in the end. (CounterOutTask.java).
//
//Create several instances of tasks, add them to a list and then call the execute() method on each of them.
/**
 *
 * @author Admin
 */
public abstract class AbstractTask implements Task {

  private String id;
  private LocalDateTime createdAt;
  private LocalDateTime executedAt;

  public AbstractTask() {
    this.id = this.getClass().getSimpleName() + "$" + Double.toString(Math.random()).substring(5, 10);
    this.createdAt = LocalDateTime.now();
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getExecutedAt() {
    return executedAt;
  }

  public void setExecutedAt(LocalDateTime executedAt) {
    this.executedAt = executedAt;
  }

  @Override
  public void execute() {
    this.executedAt = LocalDateTime.now();
  }

  @Override
  public String toString() {
    return "ID: " + this.id + "  ||  " + "Created at: " + this.createdAt + "  ||  " + "Executed at: " + this.executedAt;
  }
}

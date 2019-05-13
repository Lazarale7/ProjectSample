/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_15_8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alex
 */
public class Queue implements Container {

  ArrayList<Task> mytasks;

  public Queue(ArrayList<Task> mystack) {
    this.mytasks = mystack;
  }

  @Override
  public Task pop() {
    Task taskpop = this.mytasks.get(0);
    Iterator<Task> iter = this.mytasks.iterator();
    while (iter.hasNext()) {
      if (iter.next().equals(taskpop)) {
        iter.remove();
      }
    }
    return taskpop;
  }

  @Override
  public void push(Task pushtask) {
    this.mytasks.add(pushtask);
  }

  @Override
  public int size() {
    return (this.mytasks.size());
  }

  @Override
  public boolean isEmpty() {
    if (this.mytasks.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void transferFrom(Container trans) {
    Iterator<Task> iter = this.mytasks.iterator();
    while (iter.hasNext()) {
      this.mytasks.add(trans.pop());
    }
  }

  @Override
  public void toPrint() {
    for (Task element : mytasks) {
      System.out.println(element);
    }
  }
}
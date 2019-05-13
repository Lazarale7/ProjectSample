/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_15_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Stack implements Container {

  ArrayList<Task> mytasks;

  public Stack(ArrayList<Task> mystack) {
    this.mytasks = mystack;

  }

  @Override
  public Task pop() {
    Task taskpop = this.mytasks.get(mytasks.size() - 1);
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
      trans.push(this.pop());
    }
  }

  @Override
  public void toPrint() {
    for (Task element : mytasks) {
      System.out.println(element);
    }
  }
}
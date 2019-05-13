/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_15_8;

/**
 *
 * @author Alex
 */
public interface Container {

  public abstract Task pop();

  public abstract void push(Task task);

  public abstract int size();

  public abstract boolean isEmpty();

  public abstract void transferFrom(Container container);

  public void toPrint();

}

package container;

import task.Task;

public interface Container {

  public Task pop();

  public void push(Task value);

  public boolean isEmpty();

  public int size();

  public void transferFrom(Container allElements);
}

package container;

import task.Task;

public class Stack extends AbstractContainer {

  @Override
  public Task pop() {
    // LIFO approach

    Task topElement = null;

    if (!this.isEmpty()) {
      int lastElementPosition = this.size() - 1;
      topElement = this.list.get(lastElementPosition);
      this.list.remove(lastElementPosition);
    }

    return topElement;
  }
}

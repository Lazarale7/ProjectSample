package container;

import task.Task;

public class Queue extends AbstractContainer {

  public Task pop() {
    // FIFO approach
    Task topElement = null;

    if (!this.isEmpty()) {
      int firstElementPosition = 0;
      topElement = this.list.get(firstElementPosition);
      this.list.remove(firstElementPosition);
    }

    return topElement;
  }
}

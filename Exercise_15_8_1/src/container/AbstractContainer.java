package container;

import java.util.ArrayList;
import java.util.List;
import task.Task;

public abstract class AbstractContainer implements Container {

  protected List<Task> list;

  public AbstractContainer() {
    list = new ArrayList();
  }

  
  public boolean isEmpty() {
    return list.isEmpty();
  }

 
  public int size() {
    return list.size();
  }

  protected List<Task> getLs() {
    return list;
  }

 
  public void push(Task value) {
    list.add(value);
  }

  public void transferFrom(Container allElements) {
    while (!allElements.isEmpty()) {
      this.push(allElements.pop());
    }
  }

   public String toString() {
    return this.getClass().getSimpleName() + "{" + "list=" + list + '}';
  }
}

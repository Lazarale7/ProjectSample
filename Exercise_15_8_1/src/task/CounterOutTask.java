package task;

/**
 *
 * @author Admin
 */
public class CounterOutTask extends AbstractTask implements Task {

  static int counter = 0;

  CounterOutTask() {
  }

  @Override
  public void execute() {
    super.execute();

    counter++;
    System.out.println("Counter (Task)" + counter);
  }

  @Override
  public String toString() {
    return "{" + super.toString() + '}';
  }
}

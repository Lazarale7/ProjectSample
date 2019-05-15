package task;

/**
 *
 * @author Admin
 */
public class RandomOutTask extends AbstractTask implements Task {

  double random;

  public RandomOutTask() {
    this.random = (Math.random() * 49 + 1);
  }

  @Override
  public void execute() {
    super.execute();
    System.out.println(random);
  }

  @Override
  public String toString() {
    return "{" + super.toString() + '}';
  }
}

package task;

/**
 *
 * @author Admin
 */
public class OutTask extends AbstractTask implements Task {

  String message;

  OutTask(String inputMessage) {
    this.message = inputMessage;
  }

  @Override
  public void execute() {
    super.execute();
    System.out.println(message);
  }

  @Override
  public String toString() {
    return "{" + super.toString() + '}';
  }
}

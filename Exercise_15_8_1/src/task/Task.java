package task;

import java.time.LocalDateTime;

/**
 *
 * @author Admin
 */
public interface Task {

  public void execute();
  public LocalDateTime getCreatedAt();
  public LocalDateTime getExecutedAt();
}

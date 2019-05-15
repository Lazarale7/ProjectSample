package task;

import java.time.LocalDateTime;

/**
 *
 * @author Admin
 */
public abstract class AbstractTask implements Task {

  private String id;
  private LocalDateTime createdAt;
  private LocalDateTime executedAt;

  public AbstractTask() {
    this.id = this.getClass().getSimpleName() + "$" + Double.toString(Math.random()).substring(5, 10);
    this.createdAt = LocalDateTime.now();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getExecutedAt() {
    return executedAt;
  }

  public void setExecutedAt(LocalDateTime executedAt) {
    this.executedAt = executedAt;
  }

  @Override
  public void execute() {
    this.executedAt = LocalDateTime.now();
  }

  @Override
  public String toString() {
    return "ID: " + this.id + "  ||  " + "Created at: " + this.createdAt + "  ||  " + "Executed at: " + this.executedAt;
  }
}

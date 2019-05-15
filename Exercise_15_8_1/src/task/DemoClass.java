package task;

import container.Container;
import container.Queue;
import container.Stack;
import runner.AbstractTaskRunner;
import runner.PrintTimeTaskRunner;
import runner.CounterTaskRunner;
import runner.TaskRunner;

/**
 *
 * @author Admin
 */
public class DemoClass {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Task c = new CounterOutTask();
    Task c1 = new CounterOutTask();
    Task c2 = new CounterOutTask();
    Task r1 = new RandomOutTask();
    Task r2 = new RandomOutTask();
    Task t1 = new OutTask("Test message");
    Task t2 = new OutTask("Second test message");

    Container stack = new Stack();
    Container queue = new Queue();

    stack.push(c);
    stack.push(c1);
    stack.push(c2);

    queue.push(r1);
    queue.push(r2);
    queue.push(t1);
    queue.push(t2);

    System.out.println("Stack elements:");
    System.out.println(stack);

    System.out.println("Queue elements:");
    System.out.println(queue);

//    System.out.println("Pop from Stack: " + stack.pop());
//    System.out.println("Pop from Queue: " + queue.pop());
    stack.transferFrom(queue);
    System.out.println("\nTransfering Queue to Stack: " + stack);

//    List<Task> list = Arrays.asList(c, c1, c2, r1, r2, t1, t2);
//
//    for (Task task : list) {
//      task.execute();
//    }
//
//    System.out.println();
//
//    for (Task list1 : list) {
//      System.out.println(list1.toString());
//    }
    System.out.println("Runner part");
    TaskRunner runner1 = new CounterTaskRunner();
    TaskRunner runner2 = new PrintTimeTaskRunner();

    runner1.add(t1);
    runner1.add(t2);
    runner2.add(c);
    runner2.add(c1);
    runner2.add(c2);
    runner1.executeAll();
    runner2.executeAll();
  }
}

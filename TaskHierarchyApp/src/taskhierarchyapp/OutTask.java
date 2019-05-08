/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskhierarchyapp;

/**
 *
 * @author Alex
 */
public class OutTask extends AbstractTask implements Task {

    public String message;

    public OutTask(String ConstructorMessage) {
        this.message = ConstructorMessage;
    }

    @Override
    public String toString() {
        return this.message;
    }

    @Override
    public void execute() {
        System.out.println("This is message received from constructor: ");
        System.out.println(this.toString());
        AbstractTask.globalCounter++;

    }

}

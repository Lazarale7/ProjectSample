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
public class CounterOutTask extends AbstractTask implements Task {

    @Override
    public void execute() {
        AbstractTask.globalCounter++;
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "GlobalCounter = " + AbstractTask.globalCounter;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskhierarchyapp;

import java.time.LocalDateTime;
import java.util.Random;

/**
 *
 * @author Alex
 */
public class RandomOutTask extends AbstractTask implements Task {

    public int randomVar = 0;

    public RandomOutTask() {
        this.randomVar = this.randomInt();
    }

    public int randomInt() {
        Random myRandom = new Random();
        return myRandom.nextInt();
    }

    @Override
    public void execute() {
        System.out.println(this.toString());
        AbstractTask.globalCounter++;
    }

    @Override
    public String toString() {
        return Integer.toString(this.randomVar);
    }
}

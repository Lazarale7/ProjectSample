/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskhierarchyapp;

import java.time.LocalDateTime;

/**
 *
 * @author Alex
 */
public abstract class AbstractTask {

    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime executedAt;
    public static int globalCounter = 0;

    @Override
    public abstract String toString();

}

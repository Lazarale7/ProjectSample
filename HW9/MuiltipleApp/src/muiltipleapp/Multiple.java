/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muiltipleapp;

/**
 *
 * @author Alex
 */
public class Multiple {
    public boolean isMultiple (int numb1, int numb2)
    {
        boolean isMultipleVar;
        if ((numb1%numb2)==0) isMultipleVar=true;
        else isMultipleVar = false;
        return isMultipleVar;
    }
    
}

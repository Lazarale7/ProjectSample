/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcirc;

/**
 *
 * @author Alex
 */
public class Rectangle {

    public int length;
    public int width;

    public void calculateArea() {
        int area = length * width;
        System.out.println("Area =" + area);
    }

    public void calculatePerimeter() {
        int perimeter = 2 * (length * width);
        System.out.println("Perimeter = " + perimeter);
    }
}

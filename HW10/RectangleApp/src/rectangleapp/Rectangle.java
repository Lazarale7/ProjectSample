/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleapp;

/**
 *
 * @author Alex
 */
public class Rectangle {

    int length;
    int width;

    Rectangle() {

    }

    Rectangle(int newLength, int newWidth) {
        this.length = newLength;
        this.width = newWidth;
    }

    Rectangle(int newSide) {
        this.length = newSide;
        this.width = newSide;
    }

    public int calculteArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
}

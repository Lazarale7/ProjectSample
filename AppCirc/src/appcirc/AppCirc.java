/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcirc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Alex
 */
public class AppCirc {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Please note now Circle part is active!");
        System.out.println("Input Radius1 & Radius2");

        circle1.radius = Double.parseDouble(bufferedReader.readLine());
        circle2.radius = Double.parseDouble(bufferedReader.readLine());
        circle1.calculateArea();
        circle2.calculateArea();

        System.out.println("Now the Rectangle part is active!");
        System.out.println("Please input length and width of the Rectangle");
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = Integer.parseInt(bufferedReader.readLine());
        rectangle1.width = Integer.parseInt(bufferedReader.readLine());
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println("Now the Shape part is active");
        Shape shape1 = new Shape();

        Circle circle_s = new Circle();
        circle_s.radius = 5.0;
        shape1.circle = circle_s;

        Rectangle rectangle_s = new Rectangle();
        rectangle_s.length = 7;
        rectangle_s.width = 10;
        shape1.rectangle = rectangle_s;

        shape1.circle.calculateArea();
        shape1.rectangle.calculateArea();
        shape1.rectangle.calculatePerimeter();
         
        Point userPoint = new Point();
        userPoint.x = 55;
        userPoint.y = 4;
        userPoint.determineQuad();
        Triangle userTriangle = new Triangle();
        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        point1.x = 5;
        point1.y = -5;
        point2.x = 5;
        point2.y = -20;
        point3.x = 10;
        point3.y = -20;
        userTriangle.p1 = point1;
        userTriangle.p2 = point2;
        userTriangle.p3 = point3;
        userTriangle.determineType();

    }

}

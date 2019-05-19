/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeshierarchy;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class ShapesHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Shape shape1 = new Circle(4.0);
        Shape shape2 = new Cube(5.5);
        Shape shape3 = new Sphere(3.5);
        Shape shape4 = new Square(8.9);
        Shape shape5 = new Tetrahedron(9.3);
        Shape shape6 = new Triangle(6.7, 3.0, 4.5);

        ArrayList<Shape> list = new ArrayList<>();
        list.add(shape1);
        list.add(shape2);
        list.add(shape3);
        list.add(shape4);
        list.add(shape5);
        list.add(shape6);

        for (Shape element : list) {
            System.out.println(element.toString());
        }
        for (Shape element : list) {
            if (element instanceof TwoDimensionalShape) {
                System.out.println("Area of: " + element.getClass().getSimpleName() + " " + element.getArea());
            }
            if (element instanceof ThreeDimensionalShape) {
                System.out.println("Area of surface of 3Dim: " + element.getClass().getSimpleName() + " " + element.getArea());
                System.out.println("Volume of 3Dim: " + element.getClass().getSimpleName() + " " + ((ThreeDimensionalShape) element).getVolume());
            }
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sphereapp;

/**
 *
 * @author Alex
 */
public class Sphere {
    public double radius;
     
    public double SphereVolume (double radius)
    { double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
    return volume;
            }
}

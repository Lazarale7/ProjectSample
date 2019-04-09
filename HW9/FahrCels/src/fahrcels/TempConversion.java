/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrcels;

/**
 *
 * @author Alex
 */
public class TempConversion {

    public double convertTempToFahr(double temperature) {
        return (9 * temperature + (32 * 5)) / 5;
    }

    public double convertTempToCels(double temperature) {
        return (5 * (temperature - 32)) / 9;
    }

}

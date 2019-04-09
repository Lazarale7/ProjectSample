/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intpower;

/**
 *
 * @author Alex
 */
public class MyInteger {

    public long integerPower(int base, int exponent) {
        long result = 1;
        if (exponent == 0) {
            return 1;
        } else {
            for (int i = 1; i <= exponent; i++) {
                result = result * base;
            }
            return result;
        }
    }

}

/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe2;
/**Write a Java method to check if a given number is power of 4
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */

public class PowerOfFour {
    public boolean isPowerFour(long number) {
        if(number == 0)
        return false;
        while(number != 1)
        {
            if(number % 4 != 0)
                return false;
            number = number / 4;
        }
        return true; }}

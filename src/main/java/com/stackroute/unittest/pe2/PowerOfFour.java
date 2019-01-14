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
    public boolean isPowerFour(long n) {
        if(n == 0)
        return false;
        while(n != 1)
        {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true; }}

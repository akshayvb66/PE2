/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe2;

/**Write a Java method to Reverse the given input & Check if it is a Palindrome.
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */
public class ReverseString {
    public String reverse( String str1) {
        String str2 = "";
        for (int i=str1.length()-1; i>=0; i--) {
            str2 += str1.charAt(i);
        }
        return str2; }

    public boolean isPallindrome(String str)
    {
        int i = str.length()-1;
        int j=0;
        while(i > j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false; }
            i--; j++; }
        return true; } }

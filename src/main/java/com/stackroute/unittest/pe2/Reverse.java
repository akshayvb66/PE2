package com.stackroute.unittest.pe2;

import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

public class Reverse {

    public static void main(String args[])
    {
        System.out.println("enter your string");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Reverse q1 = new Reverse();
        System.out.println(q1.ispallindrome(str));
        System.out.println(q1.reverse(str));
    }

    public String reverse( String str1)
    {
        String str2 = "";

        for (int i=str1.length()-1; i>=0; i--) {
            str2 += str1.charAt(i);
        }
        return str2;


    }


    public boolean ispallindrome(String str)
    {

        int i = str.length()-1;
        int j=0;
        while(i > j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }


}
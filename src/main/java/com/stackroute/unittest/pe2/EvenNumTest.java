package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class EvenNumTest {

    public static void main(String args[])
    {
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isEven(n));

    }

    public static boolean isEven(int n)
    {

        if(n%2==0)
            return true;
        else
            return false;
    }


}

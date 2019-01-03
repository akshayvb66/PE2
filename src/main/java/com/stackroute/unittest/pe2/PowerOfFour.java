package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class PowerOfFour {

    public static void main(String args[])
    {
        System.out.println("enter your number");
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        PowerOfFour obj = new PowerOfFour();


        System.out.println(obj.ispower4(n));
    }

    public boolean ispower4(long n)
    {

        if(n == 0)
        return false;
        while(n != 1)
        {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }


        return true;
    }


}

package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class Factorial {


   public static void main(String args[])
    {

        System.out.println("enter number ");
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        Factorial obj=new Factorial();

        System.out.println("The factorial of "+ n+ " is " + obj.factorial(n));


    }

    public long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

 


}

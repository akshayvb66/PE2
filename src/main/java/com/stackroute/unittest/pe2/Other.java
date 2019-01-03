package com.stackroute.unittest.pe2;

public class Other {

    Member q3=new Member("akshay",22,50000);

    public static  void main(String args[])
    {

        Other q3_other=new Other();
        System.out.println(q3_other.name());
        System.out.println(q3_other.age());
        System.out.println(q3_other.salary());


    }

    public String name()
    {
        return q3.name;
    }

    public int  age()
    {
        return q3.age;
    }

    public double salary()
    {
        return q3.salary;
    }



}

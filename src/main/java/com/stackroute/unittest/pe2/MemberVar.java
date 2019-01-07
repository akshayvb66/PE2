package com.stackroute.unittest.pe2;

public class MemberVar {

    Member q3=new Member("akshay",22,50000);

    public static  void main(String args[])
    {

        MemberVar obj=new MemberVar();
        System.out.println(obj.name());
        System.out.println(obj.age());
        System.out.println(obj.salary());


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

/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe2;
/**Create a class named Member with Name, age, Salary as its variable, w
 * rite an other class named Member Variable that creates an instance of the Member class, initialises its member variables,
 * and then displays the value of each member variable.
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */

public class MemberVar {
    Member q3=new Member("akshay",22,50000);
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

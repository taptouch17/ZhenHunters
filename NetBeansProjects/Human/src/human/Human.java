/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

import com.sun.org.apache.xml.internal.security.Init;

/**
 *
 /**
 *
 * @author Tessa King-Inniss, COMP2232
 */

public class Human 
{
    //data members
    protected String name;
    int age;
    String supervisor;
    String department;
    
        
    //methods
    public Human()   //constructor
    {
       name = "";
       age = 0;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(int newAge)
    {
        age = newAge;
    }
    
    public int getAge()
    {
        return age;
    }
        
    public void setSupervisor(String sup)
    {
        supervisor = sup;
    }

    public String getSupervisor()
    {
        return supervisor;
    }
       
    public void setDepartment(String dept)
    {
        department = dept;
    }

    public String getDepartment()
    {
        return department;
    }
    
    public void displayInfo()
    {
        System.out.println("Name is: "+name);
        System.out.println("Dept is: "+department);
    }
    
    //overloaded method
    public void displayInfo(int x)
    {
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        if (age <= x)
        {
            System.out.println("Age is within range required.");
        }
        else
        {
            System.out.println("Ages is NOT within range required.");
        }
    }

}//Human
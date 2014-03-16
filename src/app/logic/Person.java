package app.logic;

import java.util.Date;

public class Person 
{    
    private String name = null;
    private Date dob = null;
    
    public Person()
    {
        
    }
    
    public Person (String n, Date d)
    {
        name = n;
        dob = d;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setDOB(Date d)
    {
        dob = d;
    }
    
    public Date getDOB()
    {
        return dob;
    }
}
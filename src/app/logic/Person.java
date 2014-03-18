package app.logic;

import java.util.Date;

public class Person 
{    
    private String name = null;
    private Date dob = null;
    private String zodiacSign = null;
    private String horoscope = null;
    
    public Person()
    {
        
    }
    
    public Person (String n, Date d)
    {
        this.name = n;
        this.dob = d;
    }
    
    public void setName(String n)
    {
        this.name = n;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setDOB(Date d)
    {
        this.dob = d;
    }
    
    public Date getDOB()
    {
        return this.dob;
    }
    
    public void setZodiacSign(String z)
    {
        this.zodiacSign = z;
    }
    
    public String getZodiacSign()
    {
        return this.zodiacSign;
    }
    
    public void setHoroscope(String h)
    {
        this.horoscope = h;
    }
    
    public String getHoroscope()
    {
        return this.horoscope;
    }
}
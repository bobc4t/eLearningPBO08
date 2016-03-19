/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearningpbo;

/**
 *
 * @author radenpioneer
 */
public abstract class Person 
{
    //Variable name with type String
    protected String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    //Variable address with type String
    protected String address;
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }
    
    //Variable gender with type String
    protected String gender;
    public void setGender(String gender) //with options: male/female only
    {
        this.gender = gender;
    }
    public String getGender()
    {
        return gender;
    }
    
    //Variable gender with type date/time
    protected String birthday; //For a while, we put String as type. Later will be updated to Date/Time type.
    public void setDate(String birthday)
    {
        this.birthday = birthday;
    }
    public String getDate()
    {
        return birthday;
    }
    
    //variable contact with type string
    protected String contact;
    public void setContact(String contact)
    {
        this.contact = contact;
    }
    public String getContact()
    {
        return contact;
    }
    
    //Variable email with type string
    protected String email;
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }
    
    //Variable password with type String
    protected String password;
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    }
}

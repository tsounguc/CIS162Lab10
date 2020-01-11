import java.util.Scanner;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own

    String firstName, lastName, emailAddress;
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String first, String last, String email)
    {
        // initialise instance variables
        firstName = first;
        lastName = last;
        emailAddress = email;
    }

    public void setFirstName(String first)
    {
        firstName = first;
    }
    
    public void setLastName(String last)
    {
        lastName = last;
    }
    
    public void setEmailAddress(String email)
    {
        emailAddress = email;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getEmailAddress()
    {
        return emailAddress;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + ": " + emailAddress;
    }
}

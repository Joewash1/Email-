package emailapp;

import java.util.Scanner;

public class Email {
    private String email;
   private String firstName;
   private String lastName;
   private   String password;
   private String department;
   private String alternateEmail;
   private String companySuffix = "yourcompany.com";
   private int mailboxCapacity = 1000;
   private int defaultPasswordlength = 11;



   // Constructor to receive the first and last name
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        // Call method for department
        this.department = setDepartment();
    // method to return random password
        this.password = randomPassword(defaultPasswordlength);
        System.out.println("your password is " + this.password);
        // combine elements to create email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;


    }
    // Ask for the department
    private String setDepartment(){
        System.out.println("Enter the department \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if(depChoice == 1 )
        {
            return "sales";
        }
        else if (depChoice == 2)
        {
            return "dev";
        }
        else if (depChoice == 3 )
        {
            return "acc";
        }
        else
        {
            return"";
        }
    }
    // generate random password
    private String randomPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[] password = new char[length];
        for(int i=0; i<length;i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }
    //set mailbox capacity
    public void setMailboxCapacity(int capacity)
    {
        this.mailboxCapacity = capacity;
    }
    // Set alternate email
    public void setAlternateEmail(String altEmail)
    {
        this.alternateEmail = altEmail;
    }
    // Change password
    public void changePassword(String password) {
        this.password = password;
    }
    public int getMailboxCapacity()
    {
        return mailboxCapacity;
    }

    public String getAlternateEmail()
    {
        return alternateEmail;
    }

    public String getPassword()
    {
        return password;
    }
    public String showInfo(){
        return "Username: " + firstName + " " + lastName + "\nCompany Email: " + email + "\nMailbox Capacity " +mailboxCapacity;
    }
}


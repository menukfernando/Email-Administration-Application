/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author Menuk Fernando
 */
public class Email {
    private String firstName;
    private String lastName;
    private String emailString;
    private String email;
    private String password;
    private int defaultPasswordLength = 20;
    private String department;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "saegis.lk";
    private int departmentCode;
    
        //Ask for the department
    private String setDepartment(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Department Codes \n 1. For Sales \n 2. For Development \n 3. For Accounting \n 4. For none \n Enter the Code: ");
        departmentCode = sc.nextInt();
        
        switch (departmentCode) {
            case 1:
                return "sale";
            case 2:
                return "dev";
            case 3:
                return "acc";
            default:
                return "";
        }
    }
    
    //constructor to recieve the first name and the last name
    
    public Email (String firstname, String lastname){
        this.firstName = firstname;
        this.lastName = lastname;
        
        this.department = setDepartment();
        System.out.println("Department: "+this.department);
        
        this.password = generateRandomPassword(defaultPasswordLength);
        System.out.println("Your Password: " + this.password);
        
        if(this.departmentCode == 0){
            emailString = firstname + lastname + "@" + companySuffix;
        }else{
            emailString = firstname + lastname + "@" + department + "." + companySuffix;
        }
        
        email = emailString.toLowerCase();
        System.out.println("Your email is: "+email.toLowerCase());
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
    }
    

    
    //generate a random password
    private String generateRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#$%&";
        char[] password = new char[length];
        
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        
        return new String(password);
    }
    
    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    
    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    
    //Change the password
    public void changePassword(String password){
        this.password = password;
    }
    
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    
    public String getAlternateEmail(){
        return alternateEmail;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String showInfo(){
        return "Employee Information \n\nDispaly Name: " + firstName + lastName +
               "\nCompany Email: "+email+
               "\nMailBox Capacity: " + mailBoxCapacity + "mb";
    }
}

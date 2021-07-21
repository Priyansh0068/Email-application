package EmailApp;

import java.util.Scanner;

public class email {
    private String firstname;
    private String lastname;
    private String department;
    private String email;
    private String password;
    private int mailboxCapacity=500;
    private int defaultpasswordlength=15;
    private String alternateEmail;
    private String Company="company.com.";
   
      //Constructor for firstname and lastname 
    public email(String firstname,String lastname)
    {
    	this.firstname=firstname;
    	this.lastname=lastname;
    	System.out.println("Email created :" +this.firstname+ " " +this.lastname);
    	
    	   //Calls method that generates Department
    	this.department=setDepartment();
    	System.out.println("Department :"+this.department);
    	
    	//Calls method to generate random password
    	  this.password= randomPassword(defaultpasswordlength);
    	  System.out.println("Your password :" +this.password);
    	  
    	  email=firstname.toLowerCase()+ "." + lastname.toLowerCase() +"@" + department +Company;
    	  System.out.println("Your email id is :" +email);
    	
    }
    


	//Ask for the department
    
    private String setDepartment()
    {
    	System.out.print("Enter the department\n1 for Development\n2 for Manager\n3 for Trainee\n4 other\nEnter the department");
    	Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        
          if(choice==1)
        	  return "Developer";
          else if(choice==2)
        	  return"Manager"; 
          else if(choice==3)
        	  return"Trainee"; 
          else
        	  return "";
    }
    
    private String randomPassword(int length)
    {
    	   String passwordSet="ABCDEFGHIKJLGVFDSTHVJKK)(*^%$#@";
    	     char[] password=new char[length];
    	     
    	     for(int i=0;i<length;i++)
    	     {
    	    	 int ran=(int)(Math.random() * passwordSet.length());
    	    	 password[i]=passwordSet.charAt(ran);
    	     }
    	     return new String(password);
    	
    }
    public void setMailCapacity(int capacity)
    {
    	this.mailboxCapacity=capacity;
    }
    public void setAlternateEmail(String altemail)
    {
    	this.alternateEmail=altemail;
    }
    
    public void changePassword(String password)
    {
    	this.password=password;
    }
       public int getemailcapacity()
       {
    	   return mailboxCapacity;
       }
       public String getAlternateEmail()
       {
    	   return alternateEmail;
       }
       public String getpassword()
       {
    	  return password; 
       }
          
}


package Studentdatabase;

import java.util.Scanner;

public class Studentapp {
	
	private String firstName;
	private String lastName;
	private int year;
	private String StudentID;
	private String courses=null;
	private int  tuitionBalance=0;
	private static int coursefees=600;
	public static int id=9999;
	
	public Studentapp()
	{
		   // first name and last name
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the firstname");
		this.firstName=sc.nextLine();
		
		System.out.print("Enter the lastName");
		this.lastName=sc.nextLine();
		
		System.out.print("1- Fresher\n 2-Mid\n 3-Senior\n 4-SuperSenior\n Enter the year");
		this.year=sc.nextInt();
		setStudentId();
		System.out.println(firstName + " " + lastName + " " + year + StudentID );	
		
	}
	      //Generate ID
 	  private void setStudentId()
	  {
		  id++;
		  this.StudentID=year +" "+ id;
	  }
	      //Enroll courses
	  public void enroll()
	  {
		  do {
			System.out.println("Enter the course(Q to quit):");
			Scanner sc=new Scanner(System.in);
			String course=sc.nextLine();
			
			if(!course.equals("Q"))
			{
				 courses= courses +"\n" + course;
				 tuitionBalance=tuitionBalance + coursefees;
			}
			else
			{
				break;
			}
		  }while(1!=0);
		  
			System.out.println("Tuition Balance:" +tuitionBalance);
	  }

		//View balance and pay tuition
	  
	  public void viewbalance()
	  {
		  System.out.println("Your balance left is :"+tuitionBalance);
	  }
	  
	  public void payments()
	  {
		  System.out.println("Enter your payment");
		   Scanner sc=new Scanner(System.in);
		    int payment=sc.nextInt();   
		  tuitionBalance=tuitionBalance-payment;
		  System.out.println("Thank you! your payment is: "+ payment);
		  viewbalance();
	  }
	  
	  public String toString()
	  {
		 return "Name: "+firstName+ " " + lastName +
				 "/n Grade level:" +year+ 
				 "/n StudentID :" +StudentID +
				 "/nCoursesEnrolled:" + courses +
				 "/nBalance:"+ tuitionBalance;
	  }
}

	
	
	


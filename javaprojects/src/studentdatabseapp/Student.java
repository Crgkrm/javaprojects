package studentdatabseapp;

import java.util.Scanner;

public class Student {
   private String firstname;
   private String lastname;
   private  int gradeYear;
   private  String studentID;
   private  String courses=null;
   private  int tutionbalance=0;
   private static  int courseOFCost=600;
   private static int id=1000;
   //java is strongly type language
   
   //constructor:promt user to enter new student name and year
   public Student() {
  
    Scanner in =new Scanner(System.in);
    System.out.print("enter student fisrtname: ");
      this.firstname=in.nextLine();
      
      
      System.out.print("enter student lastname: ");
      this.lastname=in.nextLine();
      
      
      System.out.print("1-freshman\n2 -for sophmore\n3 -junior\n4 -senior\nEnter student class level: ");
      this.gradeYear=in.nextInt();
      setStudentID();
      System.out.print(firstname + " " +lastname + " " + gradeYear +  "  " + studentID);
      

      
   }
   
   //generate id
     private void setStudentID() {
          id++;
         this.studentID= gradeYear  + "" +id;
     	 
     }
   

   //Eroll in courses
     
  public void enroll(){
	  //get inide  a loop,user hits
	  do {
	  System.out.println("enter the course you want to enroll(q to quit): ");
	  Scanner in =new Scanner(System.in);
	  String course=in.nextLine();
	    if(!course.equals("q")) {
	    	
	    	courses=courses  + "\n" + course;
	    	tutionbalance=tutionbalance + courseOFCost;
	    	
	    	
	    }
	    else {
	    	break;
	    	}
	    
	  }while(1!=0);
	    	
	    	
	    
	  System.out.print("ENROLL IN : " + courses);
	  
	  System.out.println("TUTIONBALANCE: " + tutionbalance );
	  
  }
   
   
   //view balance
  public void balance() {
	  System.out.println("your Balance is :  $ " + tutionbalance);
  }
   
   //pay tution


	public void paytution() {
		// TODO Auto-generated method stub
		System.out.print("enter the payment");
		 Scanner in =new Scanner(System.in);
		 int payment=in.nextInt();
		tutionbalance=tutionbalance - payment;
		System.out.println("thank you for payment: $" + payment);
		 balance();
	}
   
   //show status
   public String showinfo() {
	   
	   
	   
	   return "name " + firstname +  " " + lastname + 
			   "\ncoursesEnrolled: " + courses +"\nbalance : $ " + tutionbalance + "\n grade year" + gradeYear ;
   }
   
   
   
   
}   
   
   
	


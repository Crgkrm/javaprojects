package studentdatabseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
   public static void main(String[]args) {
	  
	   //create-number of new student
	  
	   //ask how mint any users we want to add
	   System.out.println("enter the no of students");
	   Scanner in=new Scanner(System.in);
	   int noofstudents=in.nextInt();
	   //creating a array of object//
	   Student[] students=new Student[noofstudents];
	   for(int n=0;n<noofstudents;n++) {
		   students[n] =new Student();
		   students[n].enroll();
		    students[n].paytution();
		  
		    System.out.println(students[n].showinfo());
			   
	   }
   }
}

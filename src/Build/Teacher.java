package Build;

import Registration.*;
import student.Student;

import java.util.*;

public class Teacher {
	
	LoginValidation obj=new LoginValidation();
	
	public static Map<String,HashMap> namelist1 = new HashMap<String,HashMap>();
	
	
	public void teacherFunctionality(String name, String pass,int noofcourses)
	{
		
		if(obj.teacherValidation(name, pass)==true)
		{
			PrepareQues obj2=new PrepareQues();
			namelist1=obj2.teacher(noofcourses);
		}
		else
		{
			System.out.println("Invalid Login");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Teacher admin=new Teacher();
		System.out.println("Enter your name=");
		String name=sc.nextLine();
		System.out.println("Enter your pass=");
		String pass=sc.nextLine();
		
		System.out.println("enter no of courses");
		int noofcourses = sc.nextInt();sc.nextLine();
		admin.teacherFunctionality(name,pass,noofcourses);
		System.out.println("I am resigning as teacher");
		
		
		System.out.println("Enter your name=");
		String nameofstudent=sc.nextLine();
		System.out.println("Enter your email=");
		String email=sc.nextLine();
		System.out.println("Enter your pass=");
		String passofstudent=sc.nextLine();
		System.out.println("ReEnter your pass=");
		String confirmPass=sc.nextLine();
		System.out.println("Enter your rollNO=");
		int rollNo=sc.nextInt();sc.nextLine();
		Student user=new Student();
		
		user.studentFunctionality(namelist1,nameofstudent,email,passofstudent,confirmPass,rollNo);
		System.out.println("I am done as student");
	}
	
	
	
	
	

}

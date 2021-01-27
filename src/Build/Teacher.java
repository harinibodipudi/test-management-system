package Build;

import Registration.*;
import student.Student;

import java.util.*;

public class Teacher {
	
	LoginValidation obj=new LoginValidation();
	Scanner sc=new Scanner(System.in);
	public static Map<String,HashMap> namelist1 = new HashMap<String,HashMap>();
	
	
	public void teacherFunctionality()
	{
		System.out.println("Enter your name=");
		String name=sc.nextLine();
		System.out.println("Enter your pass=");
		String pass=sc.nextLine();
		
		if(obj.teacherValidation(name, pass)==true)
		{
			PrepareQues obj2=new PrepareQues();
			namelist1=obj2.teacher();
		}
		else
		{
			System.out.println("Invalid Login");
		}
	}
	
	public static void main(String args[])
	{
		Teacher admin=new Teacher();
		admin.teacherFunctionality();
		System.out.println("I am resigning as teacher");
		
		//PrepareQues t1 = new PrepareQues();
		//Map<Questions,String> newmap = t1.studentTakingTest();
		//harini here t1 is a fresh clean obj pa ...we came back to where we started
		//studentTakingTest() ?
		
		
	
		Student user=new Student();
		user.studentFunctionality(namelist1);
		System.out.println("I am done as student");
	}
	
	
	
	
	

}

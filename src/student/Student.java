package student;
import java.util.*;
import Build.*;
import Registration.*;

public class Student {
	
	String name;
	String email;
	String pass;
	String confirmPass;
	int rollNo;
	
	
	public void studentFunctionality(Map<String,HashMap> namelist) {
		Scanner sc=new Scanner(System.in);
		SignupValidation obj=new SignupValidation();
		System.out.println("Enter your name=");
		String name=sc.nextLine();
		System.out.println("Enter your email=");
		String email=sc.nextLine();
		System.out.println("Enter your pass=");
		String pass=sc.nextLine();
		System.out.println("ReEnter your pass=");
		String confirmPass=sc.nextLine();
		System.out.println("Enter your rollNO=");
		int rollNo=sc.nextInt();sc.nextLine();
		
		if(obj.checkUserDetails(name, pass,confirmPass)==true)
		{
			
		PrepareQues obj2 = new PrepareQues();
		obj2.studentTakingTest(namelist);
			}
			
		
		else
		{
			System.out.println("Invalid Login");
		}
	}
	
	/*public static void main(String args[])
	{
		Student user=new Student();
		user.studentFunctionality();
		System.out.println("I am done as student");
	}*/
	
	
}
	



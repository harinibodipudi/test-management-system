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
	
	
	public void studentFunctionality(Map<String,HashMap> namelist, String nameofstudent, String email2, String passofstudent, String confirmPass2, int rollNo2) {
		SignupValidation obj=new SignupValidation();
		
		
		if(obj.checkUserDetails(nameofstudent, passofstudent,confirmPass2)==true)
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
	



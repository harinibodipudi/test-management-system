package student;

import java.util.*;
import Build.*;



public class TakeExam {
	public String finalchoice="";
	Scanner sc = new Scanner(System.in);
	
public  void exam(Map<String,HashMap> namelist) {

	System.out.println("These are the  courses");
	for(String item :namelist.keySet() ) {
		System.out.print(item+" ");
		System.out.println("---");}

			System.out.print("Enter course choice");
			String choice= sc.nextLine() ;
			finalchoice+=choice;
		
	}
	public void chooseanswer(Map<Questions, String> questions) {
		
		 
			FormulateQues objques = new FormulateQues();
			objques.display(questions);
			//questions -> ques op1 op2 op3 op4 
			
			int i=0;
			
			for(Questions item : questions.keySet()) 
			{
				i+=1;
				System.out.println("enter option for question"+i+" = ");
				
				String optionchoosen=sc.nextLine();
				if(questions.get(item).equals(optionchoosen)) 
				{
					objques.correctcount+=1;
					
				}
			}
			
				System.out.println("Score : "+objques.correctcount);
			
}}
		


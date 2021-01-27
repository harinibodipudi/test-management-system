package Build;

import java.util.*;






import student.TakeExam;

public class FormulateQues 
{
	
	
	///////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	

	public Map<Questions,String> map = new HashMap<Questions,String>();
	public int correctcount=0;
	
	int noOfQues;
	//private String coursename;
	
	public static void main(String args[]) {
		
		/*System.out.println("hi");
		FormulateQues obj = new FormulateQues();
		obj.questions();
		obj.display(obj.map);
		System.out.println(obj.correctcount);*///test for display and questions method
		/////////////////////////////////////////////////////////////////////////////
		/*FormulateQues obj = new FormulateQues();
		obj.questions();
		obj.deleteQues(obj.map);*///test for deletionmethod
		
		/*FormulateQues obj = new FormulateQues();
		obj.questions();
		System.out.println("Enter ques to be updated");
		obj.updateques(obj.map);*///updating
		
		/*FormulateQues obj = new FormulateQues();
		System.out.println("Enter ques to be added");
		obj.addQeus();*///adding test
		
		
		
	}

	
	
	
	




	public int getNoOfQues() {
		return noOfQues;
	}

	public void setNoOfQues(int noOfQues) {
		this.noOfQues = noOfQues;
	}

	/*public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}*/
///////////////////////////////////////////////////////////////////////////////////////
	public Map questions() {
		Map<Questions,String> mapques = new HashMap<Questions,String>();
		System.out.println("enter no of ques");
	Scanner sc = new Scanner(System.in);
	noOfQues= sc.nextInt();sc.nextLine();
	
	while(noOfQues!=0)
	{
		noOfQues-=1;
		System.out.println("enter the ques and options");
	String ques = sc.nextLine();
	String op1= sc.nextLine();
	String op2= sc.nextLine();
	String op3 = sc.nextLine();
	String op4 = sc.nextLine();
	String correctOption=sc.nextLine();
	Questions obj = new Questions(ques, op1, op2, op3, op4);
    mapques.put(obj, correctOption);
	}
	return mapques;
	}
	/////////////////////////////////////////////////////////////////////////////////////
	public void deleteQues(Map<Questions, String> questions) {
		System.out.print("Enter ques to be deleted");
		Scanner sc = new Scanner(System.in);
		String ques = sc.nextLine();
		for(Questions item : questions.keySet()) {
			if(item.question.equals(ques)) {
				questions.remove(item);
				System.out.println("successfully deleted");
			}else
				System.out.println("Question not found");
		
		}
		
		
		
	}

	/////////////////////////////////////////////////////////////////////////////////////
	public void addQeus() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("here");
		String ques = sc.nextLine();
		String op1 = sc.nextLine();
		String op2 = sc.nextLine();
		String op3 = sc.nextLine();
		String op4 = sc.nextLine();
		String correctOption=sc.nextLine();
		Questions obj = new Questions(ques, op1, op2, op3, op4);
	    map.put(obj, correctOption);
		
	}

	/////////////////////////////////////////////////////////////////////////////////////////
	public void updateques(Map<Questions, String> questions) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String oldques = sc.nextLine();
		boolean flag = false;
		for(Questions item : questions.keySet()) {
			if(item.question.equals(oldques)) {
				flag=true;
			}
		
		}
		if(flag==false)
			System.out.println("No ques as such");
		else {
			
		System.out.println("Enter new ques and opt");	
		String newQues = sc.nextLine();
		String newop1=sc.nextLine();
		String newop2=sc.nextLine();
		String newop3=sc.nextLine();
		String newop4=sc.nextLine();
		String correctOption=sc.nextLine();
		for(Questions item : questions.keySet()) {
			if(item.question.equals(oldques)) {
				Questions obj = new Questions(newQues, newop1, newop2, newop3, newop4);
				map.put(obj, correctOption);
				
			}
		
		}
		System.out.println("Successfully updated");
	}}
	
	
	
	
	public void display(Map<Questions, String> questions) {
		Scanner sc = new Scanner(System.in);
		for(Questions item : questions.keySet()) {
			
			System.out.println(item.question);
			System.out.println(item.op1);
			System.out.println(item.op2);
			System.out.println(item.op3);
			System.out.println(item.op4);
			
			//String optionchoosen = sc.nextLine();
			//if(questions.get(item).equals(optionchoosen)) {
				//correctcount+=1;
			//}
		}
	}

	
}

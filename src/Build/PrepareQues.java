package Build;
import student.TakeExam;
import java.util.*;
public class PrepareQues extends FormulateQues{
	//List<Questions> map2 =  (List<Questions>) map.keySet();

	public Map<String,HashMap> namelist = new HashMap<String,HashMap>();
	//<coursename, <questions, crtans>>
	
	
	public Map<String,HashMap> teacher(int noofcourses) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i=0;i<noofcourses;i++) {
			sc.nextLine();
			System.out.println("enter course name");
			String courseName = sc.nextLine();
			
			
			System.out.println("Formulate ques");
			namelist.put(courseName, (HashMap) questions());
			//for(Questions key : map2) {
				//namelist.put(courseName, key);
			//}
		
		}
		return namelist;
		}
		
		public Map<Questions,String> studentTakingTest(Map<String,HashMap> namelist) {
			
		TakeExam obj = new TakeExam();
	      obj.exam(namelist);
		String choice = obj.finalchoice;
		//System.out.println("Printing course list:");
		
		
		
		if(namelist.containsKey(choice)) {
			
			//display(namelist.get(choice));
			obj.chooseanswer(namelist.get(choice));
		}
		return namelist.get(choice);
		}
	
	}

	
	
	/*public static void main(String  args[]) {
		PrepareQues t1 = new PrepareQues();
		t1.teacher();
		for(String item :t1.namelist.keySet() ) {
			System.out.print(item+" ");
			System.out.println("");
		}
		
		TakeExam obj = new TakeExam();
		obj.exam();
		
        String choice = obj.finalchoice;
       
		if(t1.namelist.containsKey(choice)) {
			 obj.chooseanswer(t1.namelist.get(choice));
		}
		}*/ //testing prep ques
		
		
		
		
		
	





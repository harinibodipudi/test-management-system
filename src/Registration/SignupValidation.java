package Registration;

import java.util.*;
import Build.User;

public class SignupValidation {

	
	static Map<String, String> usermap = new TreeMap<String, String>(); 
	Set<String> emailset = new TreeSet<String>();
	
	String email,password,confirmpassword;
	//public static void main(String args[]) {
		//User user1 = new User( "amin@gmail.com","Amin@556",2103);
		//System.out.print(user1.getEmail());
		//SignupValidation validateUser1=new SignupValidation();
		//Boolean f=validateUser1.checkUserDetails(user1.getEmail(),user1.getPassword(),user1.getPassword());
		//System.out.println("validated"+"user1");
		
		//User user2 = new User( "rhea@gmail.com","Amin@556",2103);
		//System.out.print(user1.getEmail());
		//SignupValidation validateUser2=new SignupValidation();
		//validateUser2.checkUserDetails(user2.getEmail(),user2.getPassword(),user2.getPassword());
		
		//User user = new User ( "harini@gmail.com","Amin@556",2103);
		//LoginValidation obj2 = new LoginValidation();
		//boolean flag=obj2.teacherValidation(user.getEmail(), user.getPassword());
		//System.out.println(flag);
		
		//for (Map.Entry<String, String> entry : usermap.entrySet()) {
	        //System.out.println(entry.getKey() + ":" + entry.getValue());}
	    //}
	public boolean checkUserDetails(String email, String password, String confirmpassword) {
		if(validEmail(email)&&validPassword(password,confirmpassword)) {
			if(!emailset.contains(email)) {
				usermap.put(email, password);
		    	return true;
		    }
			return false;
		}
		else
			return false;}
		private boolean validPassword(String password, String confirmpassword) {
	    	
	    	
	    	if(password.equals(confirmpassword)==false)
	    		return false;
	    	boolean lowercase=false;
	    	boolean uppercase=false;
	    	boolean hasdigit=false;
	    	if(password.length()>8 &&password.length()<20 && password!=null) {
	    		for(int i=0;i<password.length();i++) {
	    			char ch=password.charAt(i);
	    			if(Character.isUpperCase(ch))
	    				uppercase=true;
	    			if(Character.isLowerCase(ch)) 
	    				lowercase=true;
	    			if(Character.isDigit(ch))
	    				hasdigit=true;
	    			
	    		if(lowercase&&uppercase&&hasdigit)
	    			return true;
	    		
	    		}
	    	}
	    	return false;
	    }
	    
	//email validation
	    private boolean validEmail(String email) {
	    	String[] email1=email.split("@");
	    	
	    for(int i=0;i<email.length();i++) {
	    	char ch=email.charAt(i);
	    	if(!Character.isLetter(ch) && !Character.isDigit(ch) && ch!='.' && ch!='@' && ch!='_')
	    		return false;
	    }
	    if(email1[0].length()==0)
	    	return false;
	    if(email1.length!=2)
	    	return false;
	    if(email1[1].contains(".")==false)
	    	return false;
	    return true;
	    }	
	    }



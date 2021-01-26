package Registration;

public class LoginValidation {

	
public boolean teacherValidation(String name, String pass){
		
		if(name.equals("admin")&& pass.equals("admin")) {
			return true;
		}return false;
		
	}
	
	public boolean studentValidation(String name, String pass) {
		SignupValidation obj = new SignupValidation();
		if(obj.usermap.containsKey(name) && pass.equals(obj.usermap.get(name))) {
			return true;
		}return false;
	}

}

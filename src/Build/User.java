package Build;

public class User {

	String email;
	String password;
	int rollNo;
	//constructor
	public User(String email, String password, int rollNo) {
	
		this.email = email;
		this.password = password;
		this.rollNo = rollNo;
	}
	
	//getters and setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
public static void main(String args[]) {
		
		System.out.println("hi");
		
	}
}

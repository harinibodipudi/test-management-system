package Test;
import static org.junit.Assert.*;
import org.junit.Test;
import Build.User;
import Registration.*;

public class TestUser {
	
	User user = new User ( "amin@gmail.com","Amin@556",2104);
	
	@Test
	public void testSetterGetter() {
		user.setEmail("amin@gmail.com");
		user.setPassword("Amin@556");
		assertEquals("amin@gmail.com",user.getEmail());
		assertEquals("Amin@556",user.getPassword());
		assertEquals(2104,user.getRollNo());
		System.out.println("hi");
		try {
			user.setRollNo(0);
			user.setEmail(null);
			user.setPassword(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

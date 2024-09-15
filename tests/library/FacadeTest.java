package library;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import library.*;

public class FacadeTest {
    private Facade facade;

    @Before
    public void setUp() {
        facade = new Facade();
        System.out.println(facade.getClass());
    }

    @Test
    public void testMakeUser_ValidUserTypeEmailPassword_SuccessfulRegistration() {
    	facade = new Facade();
        String result = facade.makeUser("visitor", "test@example.com", "Password!123");
        assertEquals("Registration successful.", result);
    }

    @Test
    public void testMakeUser_InvalidUserType_Failure() {
    	facade = new Facade();
        String result = facade.makeUser("invalidType", "test@example.com", "Password123");
        assertEquals("<html>Pick one of the following user types:<br/>student, faculty, non-faculty, or visitor</html>", result);
    }

    @Test
    public void testMakeUser_InvalidEmail_Failure() {
    	facade = new Facade();
        String result = facade.makeUser("student", "invalidemail", "Password123");
        assertEquals("Enter valid email address.", result);
    }

    @Test
    public void testMakeUser_InvalidPassword_Failure() {
    	facade = new Facade();
        String result = facade.makeUser("student", "test@example.com", "password");
        assertEquals("Invalid Password: must contain at least 8-20 characters, one digit, one upper case and one lower case.", result);
    }

    @Test
    public void testLoginUser_ValidCredentials_SuccessfulLogin() throws Exception {
    	Facade facade2 = new Facade();
        User user = facade2.loginUser("student1@gmail.com", "t4t4".toCharArray());
        assertNotNull(user);
        assertEquals("student1@gmail.com", user.getEmail());
    }

    @Test
    public void testLoginUser_InvalidPassword_Failure() throws Exception {
        User user = facade.loginUser("student1@gmail.com", "wrongPassword".toCharArray());
        assertNull(user);
    }
    
    @Test
    public void testLoginUser_NullPass() throws Exception {
    	facade = new Facade();
        String msg = facade.makeUser("student", "nopass@gmail.com", null);
        assertEquals(msg, "Invalid Password: must contain at least 8-20 characters, one digit, one upper case and one lower case.");
    }
    
    @Test
    public void testMakeUser_Student() {
    	facade = new Facade();
        String result = facade.makeUser("student", "teststu@example.com", "Password12_");
        assertEquals("Please wait for admin approval.", result);
        MaintainUnregisteredUser uRUserDB = new MaintainUnregisteredUser();
        try {
			uRUserDB.load(pathNames.unregisteredDBPath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        List<User> users = uRUserDB.getUsers();
        User resultUser = null;
        for (User u: users) {
        	if (u.getEmail().equals("teststu@example.com")) {
        		resultUser = new Student(u.getuserType(),u.getEmail(),u.getPassword());
        	}
        }
        assertEquals(resultUser.getEmail(), "teststu@example.com");
    }
    
    @Test
    public void testLoginUser_Student() throws Exception {
    	facade = new Facade();
        User result = facade.loginUser("student1@gmail.com", "t4t4".toCharArray());
        User u = new Student("student","student1@gmail.com", "t4t4");
        assertEquals(u.getEmail(), result.getEmail());
        assertEquals(facade.getUser(), result);
    }
    
    @Test
    public void testLoginUser_Admin() throws Exception {
    	facade = new Facade();
        User result = facade.loginUser("admin1@gmail.com", "t4t4".toCharArray());
        User u = new Student("student","admin1@gmail.com", "t4t4");
        assertEquals(u.getEmail(), result.getEmail());
        assertEquals(facade.getUser(), result);
    }
    
}
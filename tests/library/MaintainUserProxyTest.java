package library;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import library.*;

public class MaintainUserProxyTest {

	private MaintainUserProxy maintainUserProxy;

    @Before
    public void setUp() {
        maintainUserProxy = new MaintainUserProxy();
    }
    
    @Test
    public void testSetandUpdate() {
    	User student = new Student("student", "student1@gmail.com", "t4t4");
    	User fac = new Faculty("faculty", "faculty1@gmail.com", "t4t4");
    	User nonFac = new Nonfaculty("nonfaculty", "nonfaculty1@gmail.com", "t4t4");
    	User vis = new Visitor("visitor", "visitor1@gmail.com", "t4t4");
    	User admin = new Admin("admin", "admin1@gmail.com", "t4t4");
    	ArrayList<User> users = new ArrayList<User>();
    	users.add(student);users.add(fac);users.add(nonFac);users.add(vis);users.add(admin);
    	maintainUserProxy.setUsers(users);
    	try {
			maintainUserProxy.update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			maintainUserProxy.load(pathNames.path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	assertNotEquals(users, maintainUserProxy.getUsers());
    }

    @Test
    public void testLoad() {
        try {
            maintainUserProxy.load(pathNames.path);
            List<User> users = maintainUserProxy.getUsers();
            assertNotNull(users);
            assertFalse(users.isEmpty());
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testUpdate() {
        try {
            maintainUserProxy.load(pathNames.path);
            List<User> initialUsers = maintainUserProxy.getUsers();
            maintainUserProxy.update();
            List<User> updatedUsers = maintainUserProxy.getUsers();
            assertNotNull(updatedUsers);
            assertEquals(initialUsers.size(), updatedUsers.size());
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testGetRegisteredUserByEmail() {
        try {
            maintainUserProxy.load(pathNames.path);
            User user = maintainUserProxy.getRegisteredUserByEmail("admin1@gmail.com");
            assertNotNull(user);
            assertEquals("admin1@gmail.com", user.getEmail());
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testAddUser() {
        try {
            maintainUserProxy.load(pathNames.path);
            int initialSize = maintainUserProxy.getUsers().size();
            User newUser = new Student("student", "newuser@example.com", "password");
            maintainUserProxy.addUser(newUser);
            List<User> updatedUsers = maintainUserProxy.getUsers();
            assertEquals(initialSize + 1, updatedUsers.size());
            assertTrue(updatedUsers.contains(newUser));
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void testSetandGetUsers() {
    	User student = new Student("student", "student1@gmail.com", "t4t4");
    	User fac = new Faculty("faculty", "faculty1@gmail.com", "t4t4");
    	User nonFac = new Nonfaculty("nonfaculty", "nonfaculty1@gmail.com", "t4t4");
    	User vis = new Visitor("visitor", "visitor1@gmail.com", "t4t4");
    	User admin = new Admin("admin", "admin1@gmail.com", "t4t4");
    	ArrayList<User> users = new ArrayList<User>();
    	users.add(student);users.add(fac);users.add(nonFac);users.add(vis);users.add(admin);
    	maintainUserProxy.setUsers(users);
    	assertEquals(users, maintainUserProxy.getUsers());
    }
    
    @Test
    public void testAddUser2() {
    	User admin = new Admin("admin", "admin2@gmail.com", "t4t4");
    	maintainUserProxy.addUser(admin);
    	assertTrue(maintainUserProxy.getUsers().contains(admin));
    }
    
    @Test
    public void testUpdateinRealUserDB() {
        try {
            maintainUserProxy.load(pathNames.path);
            List<User> initialUsers = maintainUserProxy.getUsers();
            maintainUserProxy.update();
            List<User> updatedUsers = maintainUserProxy.getUsers();
            assertNotNull(updatedUsers);
            assertEquals(initialUsers.size(), updatedUsers.size());
            assertEquals(maintainUserProxy.getUsers(), MaintainUser.getInstance().getUsers());
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void testUpdateWithoutLoad() {
        try {
            List<User> initialUsers = maintainUserProxy.getUsers();
            maintainUserProxy.update();
            List<User> updatedUsers = maintainUserProxy.getUsers();
            assertNotNull(updatedUsers);
            assertEquals(initialUsers.size(), updatedUsers.size());
            assertEquals(maintainUserProxy.getUsers(), MaintainUser.getInstance().getUsers());
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void testAddUser3() {
    	User admin = new Faculty("faculty", "fac3@gmail.com", "t4t4");
    	maintainUserProxy.addUser(admin);
    	assertTrue(maintainUserProxy.getUsers().contains(admin));
    }
    
    

}

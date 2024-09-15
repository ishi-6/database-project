package library;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import library.*;


import org.junit.Test;

public class MaintainUserTest {

	private MaintainUser maintainUser;

    @Before
    public void setUp() {
        maintainUser = (MaintainUser) MaintainUser.getInstance();
        try {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	@Test
    public void testLoad() {
		try {
			maintainUser.load(pathNames.path);
			maintainUser.getUsers().removeAll(maintainUser.getUsers());
			maintainUser.update();
			maintainUser.load(pathNames.path);
			maintainUser.addUser(new Student("student", "student1@gmail.com", "t4t4"));
			maintainUser.addUser(new Faculty("faculty", "faculty1@gmail.com", "t4t4"));
			maintainUser.addUser(new Nonfaculty("nonfaculty", "nonfaculty1@gmail.com", "t4t4"));
			maintainUser.addUser(new Visitor("visitor", "visitor1@gmail.com", "t4t4"));
			maintainUser.addUser(new Admin("admin", "admin1@gmail.com", "t4t4"));
			maintainUser.addUser(new Visitor("visitor", "test23@example.com", "t4t4"));
			maintainUser.update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
            maintainUser.load(pathNames.path);
            List<User> users = maintainUser.getUsers();
            assertNotNull(users);
            assertFalse(users.isEmpty());
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testUpdate() {
        try {
            maintainUser.load(pathNames.path);
            List<User> initialUsers = maintainUser.getUsers();
            maintainUser.update();
            List<User> updatedUsers = maintainUser.getUsers();
            assertNotNull(updatedUsers);
            assertEquals(initialUsers.size(), updatedUsers.size());
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void testUpdate2() {
        try {
            maintainUser.load(pathNames.path);
            List<User> initialUsers2 = maintainUser.getUsers();
            ArrayList<User> initialUsers = new ArrayList<User>();
            for (User u : initialUsers2) {
            	initialUsers.add(u);
            }
            maintainUser.addUser(new Visitor("visitor", "visit1@gmail.com", "t4t4"));
            maintainUser.update();
            List<User> updatedUsers = maintainUser.getUsers();
            assertNotNull(updatedUsers);
            for (User u : initialUsers) {
            	System.out.println(u.getEmail());
            }
            assertEquals(initialUsers.size()+1, updatedUsers.size());
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testGetRegisteredUserByEmail() throws Exception {
        
            maintainUser.load(pathNames.path);
            User user = new Visitor("visitor", "visitor1@gmail.com", "t4t4");
            user = maintainUser.getRegisteredUserByEmail("visitor1@gmail.com");
            System.out.println("here "+user.getEmail());
            assertEquals("visitor1@gmail.com", user.getEmail());
        
    }
    
    @Test
    public void testGetRegisteredUserByEmail_Faill() {
        try {
            maintainUser.load(pathNames.path);
            User user = maintainUser.getRegisteredUserByEmail("studen@gmail.com");
            assertNull(user);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test
    public void testAddUser() {
        try {
            maintainUser.load(pathNames.path);
            int initialSize = maintainUser.getUsers().size();
            User newUser = new Student("student", "newuser@example.com", "password");
            maintainUser.addUser(newUser);
            List<User> updatedUsers = maintainUser.getUsers();
            assertEquals(initialSize + 1, updatedUsers.size());
            assertTrue(updatedUsers.contains(newUser));
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void testAddFaculty() {
        try {
            maintainUser.load(pathNames.path);
            int initialSize = maintainUser.getUsers().size();
            User newUser = new Student("faculty", "newfac@example.com", "password");
            maintainUser.addUser(newUser);
            List<User> updatedUsers = maintainUser.getUsers();
            assertEquals(initialSize + 1, updatedUsers.size());
            assertTrue(updatedUsers.contains(newUser));
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void testAddNonFaculty() {
        try {
            maintainUser.load(pathNames.path);
            int initialSize = maintainUser.getUsers().size();
            User newUser = new Student("nonfaculty", "newnonfac@example.com", "password");
            maintainUser.addUser(newUser);
            List<User> updatedUsers = maintainUser.getUsers();
            assertEquals(initialSize + 1, updatedUsers.size());
            assertTrue(updatedUsers.contains(newUser));
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
    
    @Test
    public void testGetInstance() {
        assertNotNull(MaintainUser.getInstance());
    }
    
    @Test
    public void testSetUsers() {
    	maintainUser.addUser(new Visitor("visitor","test23@example.com","t4t4"));
    	User u = null;
    	try {
			u = maintainUser.getRegisteredUserByEmail("test23@example.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        List<User> users = maintainUser.getUsers();
        users.remove(u);
        maintainUser.setUsers(users);
        try {
			maintainUser.update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			maintainUser.load(pathNames.path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        User u2 = null;
        List<User> users2 = maintainUser.getUsers();
        for (User u1 : users2) {
        	if (u1.getEmail().equals(u.getEmail())) {
        		u2 = u1;
        	}
        	
        }
        assertNotSame(u,u2);
        
		
        
    }
    
    

}

package library;

import static org.junit.Assert.*;


import library.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class MaintainURUserTest {
	private MaintainUnregisteredUser maintainUnregisteredUser;

	@Before
	public void setUp() {
		maintainUnregisteredUser = new MaintainUnregisteredUser();
	}

	@Test
	public void testLoadStudent() {
		try {
			maintainUnregisteredUser.load(pathNames.unregisteredDBPath);
			List<User> users = maintainUnregisteredUser.getUsers();
			assertNotNull(users);
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}

	@Test
	public void testUpdate() {
		try {
			maintainUnregisteredUser.load(pathNames.unregisteredDBPath);
			List<User> initialUsers = maintainUnregisteredUser.getUsers();
			maintainUnregisteredUser.update(pathNames.unregisteredDBPath);
			List<User> updatedUsers = maintainUnregisteredUser.getUsers();
			assertNotNull(updatedUsers);
			assertEquals(initialUsers.size(), updatedUsers.size());
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}

	/*@Test
	public void testRegister() {
		try {
			maintainUnregisteredUser.load(pathNames.unregisteredDBPath);
			List<User> initialUsers = new ArrayList<>(maintainUnregisteredUser.getUsers());
			ArrayList<User> usersApproved = new ArrayList<>();
			usersApproved.add(initialUsers.get(0));
			usersApproved.add(initialUsers.get(1));
			List<User> initialUsersCopy = new ArrayList<>();
			for (int i = 0; i < initialUsers.size(); i++) {
				initialUsersCopy.add(initialUsers.get(i));
			}
			maintainUnregisteredUser.register(usersApproved);
			List<User> updatedUsers = maintainUnregisteredUser.getUsers();
			assertNotEquals(updatedUsers.size(), initialUsersCopy.size());
			assertEquals(updatedUsers.size() + 2, initialUsersCopy.size());
		} catch (Exception e) {
			e.getMessage();
		}
	}*/

	@Test
	public void testLoadFaculty() {
		try {
			maintainUnregisteredUser.load(pathNames.unregisteredDBPath);
			List<User> users = maintainUnregisteredUser.getUsers();
			assertNotNull(users);
			User fac = new Faculty("faculty", "facUR@gmail.com", "t4t4");
			users.add(fac);
			maintainUnregisteredUser.setUsers(users);
			maintainUnregisteredUser.load(pathNames.unregisteredDBPath);
			users = maintainUnregisteredUser.getUsers();
			User u1 = null;
			for (User u : users) {
				if (u.getEmail().equals("facUR@gmail.com")) {
					u1 = u;
				}
			}
			assertEquals(u1, fac);
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}

	@Test
	public void testLoadNonFaculty() {
		try {
			maintainUnregisteredUser.load(pathNames.unregisteredDBPath);
			List<User> users = maintainUnregisteredUser.getUsers();
			assertNotNull(users);
			assertFalse(users.isEmpty());
			User nonfac = new Faculty("nonfaculty", "nonfacUR@gmail.com", "t4t4");
			users.add(nonfac);
			maintainUnregisteredUser.setUsers(users);
			maintainUnregisteredUser.load(pathNames.unregisteredDBPath);
			users = maintainUnregisteredUser.getUsers();
			User u1 = null;
			for (User u : users) {
				if (u.getEmail().equals("nonfacUR@gmail.com")) {
					u1 = u;
				}
			}
			assertEquals(u1, nonfac);
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}

	@Test
	public void testRegisterEmpty() {
		try {
			maintainUnregisteredUser.load(pathNames.unregisteredDBPath);
			List<User> initialUsers = new ArrayList<>(maintainUnregisteredUser.getUsers());
			ArrayList<User> usersApproved = new ArrayList<>();
			List<User> initialUsersCopy = new ArrayList<>();
			for (int i = 0; i < initialUsers.size(); i++) {
				initialUsersCopy.add(initialUsers.get(i));
			}
			maintainUnregisteredUser.register(usersApproved);
			List<User> updatedUsers = maintainUnregisteredUser.getUsers();
			assertEquals(updatedUsers.size(), initialUsersCopy.size());
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}

	@Test
	public void testRemoveUREmpty() {
		try {
			maintainUnregisteredUser.load(pathNames.unregisteredDBPath);
			List<User> initialUsers = new ArrayList<>(maintainUnregisteredUser.getUsers());
			ArrayList<User> usersRemoved = new ArrayList<>();
			maintainUnregisteredUser.removeUR(usersRemoved);
			List<User> updatedUsers = maintainUnregisteredUser.getUsers();
			assertTrue(updatedUsers.containsAll(usersRemoved));
			assertEquals(updatedUsers.size(), initialUsers.size());
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}

	@Test
	public void testLoadEmpty() {
		try {
			maintainUnregisteredUser.setUsers(new ArrayList<>());
			maintainUnregisteredUser.update(pathNames.unregisteredDBPath);
			maintainUnregisteredUser.load(pathNames.unregisteredDBPath);
			List<User> users = maintainUnregisteredUser.getUsers();
			assertNotNull(users);
			assertTrue(users.isEmpty());
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}

	@Test
	public void testSetUsers() {
		try {
			List<User> initialUsers = new ArrayList<>();
			initialUsers.add(new Student("student", "student@gmail.com", "password"));
			initialUsers.add(new Faculty("faculty", "faculty@gmail.com", "password"));
			initialUsers.add(new Nonfaculty("nonfaculty", "nonfaculty@gmail.com", "password"));
			initialUsers.add(new Student("student", "student1@gmail.com", "t4t4"));
			initialUsers.add(new Faculty("faculty", "faculty1@gmail.com", "t4t4"));
			initialUsers.add(new Nonfaculty("nonfaculty", "nonfaculty1@gmail.com", "t4t4"));

			maintainUnregisteredUser.setUsers(initialUsers);

			List<User> retrievedUsers = maintainUnregisteredUser.getUsers();

			assertEquals(initialUsers.size(), retrievedUsers.size());
			assertTrue(retrievedUsers.containsAll(initialUsers));
			maintainUnregisteredUser.update(pathNames.unregisteredDBPath);
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}

	@Test
	public void testRemoveUR() {
		try {
			maintainUnregisteredUser.load(pathNames.unregisteredDBPath);
			int size = maintainUnregisteredUser.getUsers().size();
			ArrayList<User> users = new ArrayList<User>();
			users.add(maintainUnregisteredUser.getUsers().get(0));
			maintainUnregisteredUser.removeUR(users);
			assertEquals(maintainUnregisteredUser.getUsers().size(), size-1);
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test
	public void testSetUsers2() {
		try {
			List<User> initialUsers = new ArrayList<>();
			initialUsers.add(new Student("student", "student@gmail.com", "password"));
			initialUsers.add(new Faculty("faculty", "faculty@gmail.com", "password"));
			initialUsers.add(new Nonfaculty("nonfaculty", "nonfaculty@gmail.com", "password"));
			initialUsers.add(new Student("student", "student1@gmail.com", "t4t4"));
			initialUsers.add(new Faculty("faculty", "faculty1@gmail.com", "t4t4"));
			initialUsers.add(new Nonfaculty("nonfaculty", "nonfaculty1@gmail.com", "t4t4"));
			initialUsers.add(new Nonfaculty("nonfaculty", "nonfaculty2@gmail.com", "t4t4"));

			maintainUnregisteredUser.setUsers(initialUsers);

			List<User> retrievedUsers = maintainUnregisteredUser.getUsers();

			assertEquals(initialUsers.size(), retrievedUsers.size());
			assertTrue(retrievedUsers.containsAll(initialUsers));
			maintainUnregisteredUser.update(pathNames.unregisteredDBPath);
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}

}
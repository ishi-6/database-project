package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AdminTest {

	private ItemDatabase itemDB;
	private MaintainUnregisteredUser URuserDB;
	private UserDatabase userDB;
	private RequestDatabase reqDB;
	private Admin admin;

	private Book i; 
	private Request r;

	@Before
	public void setup() {
		itemDB = new MaintainItemsProxy();
		URuserDB = new MaintainUnregisteredUser();
		userDB = new MaintainUserProxy();
		reqDB = new MaintainRequestsProxy();
		admin = new Admin();
		admin = new Admin("admin", "libraryadmin@gmail.com", "admin password");


		i = new Book();
		r = new Request(); 
	}

	//1
	@Test
	public void testConstructors() {
		assertNotNull(admin);
		assertEquals("admin", admin.getuserType());
		assertEquals("libraryadmin@gmail.com", admin.getEmail());
		assertEquals("admin password", admin.getPassword());
	}

	//2
	@Test
	public void testAddItem() {
		admin.addItem(i);

	}

	//3
	@Test
	public void testEnableItem() {
		admin.enableItem(i);
		assertEquals("true", i.getRentable());
	}

	//4
	@Test
	public void testDisableItem() {
		admin.disableItem(i);
		assertEquals("false", i.getRentable());
	}

	//5
	@Test
	public void testHandleRequests() {

		admin.handleRequests();

	}

	//6
	@Test
	public void testGetRequestList() {

		admin.getRequestList();
	}

	//7
	@Test
	public void testSetRequestList() {
		ArrayList<Request> requestList = new ArrayList<>();
		Request request1 = new Request();
		requestList.add(request1);
		admin.setRequestList(requestList);
		assertEquals(requestList, admin.getRequestList());
	}

	//8
	@Test
	public void testGetuserType() {
		assertEquals("admin", admin.getuserType());
	}

	//9
	@Test
	public void testSetUserType() {
		admin.setUserType("adminteam");
		assertEquals("adminteam", admin.getuserType());
	}

	//10
	@Test
	public void testGetEmail() {
		assertEquals("libraryadmin@gmail.com", admin.getEmail());
	}

	//11
	@Test
	public void testSetEmail() {
		admin.setEmail("adminteam@example.com");
		assertEquals("adminteam@example.com", admin.getEmail());
	}

	//12
	@Test
	public void testGetPassword() {
		assertEquals("admin password", admin.getPassword());
	}

	//13
	@Test
	public void testSetPassword() {
		admin.setPassword("adminteam password");
		assertEquals("adminteam password", admin.getPassword());
	}

}



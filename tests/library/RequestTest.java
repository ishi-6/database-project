package library;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import library.Request;
import library.MaintainUserProxy;
import library.pathNames;

public class RequestTest {

	private Student u;
	private String name;
	private String edition;
	private String itemType;
	private String priority;
	private boolean completion;
	private Request request;


	@Before
	public void setup() throws Exception {
		
		UserDatabase prox = new MaintainUserProxy();
		prox.load(pathNames.path);
		User u;
		u = prox.getRegisteredUserByEmail("student1@gmail.com");
		
		name = "book name";
		edition = "edition 1";
		itemType = "course teaching";
		priority = "1";
		completion = false;
		request = new Request(u, name, edition, itemType, priority, completion);

	}

	//1
	@Test
	public void testConstructor() {
		Request request = new Request(u, name, edition, itemType, priority, completion);

		assertEquals(u, request.getUser());
		assertEquals("book name", request.getName());
		assertEquals("edition 1", request.getEdition());
		assertEquals("course teaching", request.getItemType());
		assertEquals("1", request.getPriority());
		assertFalse(request.isCompletion());
	}

	//2
	@Test
	public void testSetCompletion() {
		request.setCompletion(true);
		assertTrue(request.isCompletion());
		request.setCompletion(false);
		assertFalse(request.isCompletion());
	}

	//3
	@Test
	public void testSetName() {
		request.setName("another book title");
		assertEquals("another book title", request.getName());
	}

	//4
	@Test
	public void testSetEdition() {
		request.setEdition("edition 2");
		assertEquals("edition 2", request.getEdition());
	}

	//5
	@Test
	public void testSetItemType() {
		Request request = new Request();
		request.setItemType("self improvement");
		assertEquals("self improvement", request.getItemType());
	}

	//6
	@Test
	public void testSetUser() {
		Visitor v = new Visitor("visitor", "email", "password");
		request.setUser(v);

		assertEquals(v, request.getUser());
	}

	//7
	@Test
	public void testSetPriority() {
		request.setPriority("2");
		assertEquals("2", request.getPriority());
	}
	
	//8
	@Test
	public void testSetPriority_2() {
		request.setPriority("1");
		assertEquals("1", request.getPriority());
	}

	//9
	@Test
	public void testSetEdition_2() {
		request.setEdition("edition 3");
		assertEquals("edition 3", request.getEdition());
	}
	
	//10
	@Test
	public void testSetName_2() {
		request.setName("new book title");
		assertEquals("new book title", request.getName());
	}



}

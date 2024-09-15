package library;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import library.AdminAccount;
import library.ItemDatabase;
import library.MaintainItemsProxy;
import library.MaintainRequestsProxy;
import library.MaintainUnregisteredUser;
import library.MaintainUserProxy;
import library.RequestDatabase;
import library.UserDatabase;

public class AdminAccountTest {

	private ItemDatabase itemDB;
	private MaintainUnregisteredUser URuserDB;
	private UserDatabase userDB;
	private RequestDatabase reqDB;
	private AdminAccount acc;


	private ArrayList<String> unregMail;
	private ArrayList<Item> items;
	private Book i; 
	private Request r;

	@Before
	public void setup() throws Exception {
		itemDB = new MaintainItemsProxy();
		URuserDB = new MaintainUnregisteredUser();
		userDB = new MaintainUserProxy();
		reqDB = new MaintainRequestsProxy();
		acc = new AdminAccount();
		
		unregMail = new ArrayList<String>();
		unregMail.add("abc@gmail.com"); 
		unregMail.add("def@gmail.com");
		
		
		userDB.load(pathNames.path);
		User user;
		user = userDB.getRegisteredUserByEmail("student1@gmail.com");
		
		i = new Book("book", "title", "id", "location", true, new Date(), new Date(), user, "publisher", 0.0, "false", "false", "edition");
		items = new ArrayList<Item>();
		items.add(this.i);
		
		r = new Request(user, "title", "edition", "book", "0", false);
	}


	//1
	@Test
	public void testGetAllUnregMail() {
		unregMail = acc.getAllUnregMail();
		assertNotNull(unregMail);
	}
	
	//2
	@Test
	public void testConvert_ListUnregMail_accept() throws Exception {
		boolean isCorrect = true;
		
		acc.convert_ListUnregMail_accept(unregMail);
		List<User> users = userDB.getUsers();
		
		assertTrue(isCorrect);
	}

	//3
	@Test
	public void testConvert_ListUnregMail_reject() {
		boolean isCorrect = true;
		acc.convert_ListUnregMail_reject(unregMail);
		List<User> users = URuserDB.getUsers();
		
		for (String s: unregMail) {
			for (User u : users) {
				if ((u.getEmail().equals(s))) {	 // if it exists in the URuserDB instead of being removed, false
					isCorrect = false;
				}
			}
		}
		assertTrue(isCorrect);
	}

	//4
	@Test
	public void testReturn_allItems() {
		List<Item> result = acc.return_allItems();
		assertNotNull(result);
	}

	//5
	@Test
	public void testRemove_ListItems() throws Exception {
		userDB.load(pathNames.path);
		User user;
		user = userDB.getRegisteredUserByEmail("student1@gmail.com");
		
		Book i = new Book("book", "title", "id", "location", true, new Date(), new Date(), user, "publisher", 0.0, "false", "false", "edition");
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(i);
		
		boolean isCorrect = true;
		if (i.getOwner() != null) {
		acc.remove_ListItems(items);

		for (Item j: items) {
			if (itemDB.getItems().contains(j)) {
				isCorrect = false;
			}
		}
		}
	
		assertTrue(isCorrect);

	}

	//6
	@Test
	public void testDisable_ItemsList() {
		acc.disable_ItemsList(items);
		boolean isCorrect = true;
		for (Item i : items) {
			if (i.getRentable().equals("true")) {
				isCorrect = false;
			}
		}
		assertTrue(isCorrect);
	}

	//7
	@Test
	public void testEnable_ItemsList() {
		acc.enable_ItemsList(items);
		boolean isCorrect = true;
		for (Item j : items) {
			if (j.getRentable().equals("false")) {
				isCorrect = false;
			}
		}
		assertTrue(isCorrect);
	}

	//8
	@Test
	public void testAdd_createItem() {
		acc.add_createItem(i);
		boolean isCorrect = false;
		if (itemDB.getItems().contains(i)) {
			isCorrect = true;
		}
		assertTrue(isCorrect);
	}


	//9
	@Test
	public void testRequest_Accept() {
		acc.request_Accept(r);
		assertTrue(r.isCompletion());
		
	}

	//10
	@Test
	public void testRequest_Deny() {
		acc.request_Deny(r);
		
		boolean isCorrect = true;
		if (itemDB.getItems().contains(r)) {
			isCorrect = false;
		}
		assertTrue(isCorrect);
	}
}
package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import library.User;
import library.MaintainUserProxy;

public class SubscriptionTest {

	private Student user;
	private Subscription subscription;

	@Before
	public void setup() throws Exception {
		UserDatabase prox = new MaintainUserProxy();
		prox.load(pathNames.path);
		User user;
		user = prox.getRegisteredUserByEmail("student1@gmail.com");
		
		
		subscription = new Subscription("example.com", "example", user, true);
	}

	//1
	@Test
	public void testConstructor() throws Exception {
		UserDatabase prox = new MaintainUserProxy();
		prox.load(pathNames.path);
		User user;
		user = prox.getRegisteredUserByEmail("student1@gmail.com");
		
		
		subscription = new Subscription("example.com", "example", user, true);
		
		assertEquals("example.com", subscription.getSite());
		assertEquals("example", subscription.getCompanyName());
		assertEquals(user, subscription.getU());
		assertEquals(subscription.isStatus(), "true");
	}

	//2
	@Test
	public void testConstructorWithNullUser() {
		Subscription subscription = new Subscription("test.com", "test", null, true);

		assertEquals("test.com", subscription.getSite());
		assertEquals("test", subscription.getCompanyName());
		assertNull(subscription.getU());
		assertEquals(subscription.isStatus(), "true");
	}

	//3
	@Test
	public void testDefaultConstructor() {
		Subscription subscription = new Subscription();

		assertNull(subscription.getSite());
		assertNull(subscription.getCompanyName());
		assertNull(subscription.getU());
		assertEquals(subscription.isStatus(), "false");
	}

	//4
	@Test
	public void testSetU() {
		subscription.setU(user);
		assertEquals(user, subscription.getU());
	}

	//5
	@Test
	public void testSetSite() {
		subscription.setSite("blah.com");
		assertEquals("blah.com", subscription.getSite());
	}
	
	//6
	@Test
	public void testSetSite2() {
		subscription.setSite("blehh.com");
		assertEquals("blehh.com", subscription.getSite());
	}

	//7
	@Test
	public void testSetCompanyName() {
		subscription.setCompanyName("blah");
		assertEquals("blah", subscription.getCompanyName());
	}
	
	//8
	@Test
	public void testSetStatusFalse() {
		subscription.setStatus("false");
		assertEquals(subscription.isStatus(), "false");
	}

	//9
	@Test
	public void testSetStatusTrue() {
		subscription.setStatus("true");
		assertEquals(subscription.isStatus(), "true");
	}

	//10
	@Test
	public void testSetStatusInvalidInput() {
		subscription.setStatus("invalidInput");
		assertEquals(subscription.isStatus(), "true"); //last state
	}
}



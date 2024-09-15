package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import library.MaintainSubscriptionsProxy;
import library.MaintainUserProxy;
import library.pathNames;

public class MaintainSubscriptionsProxyTest {

	private SubscriptionDatabase proxy;
	private User u;
	private UserDatabase prox;

	@Before
	public void setUp() throws Exception {
		
		prox = new MaintainUserProxy();
		prox.load(pathNames.path);
		
		proxy = new MaintainSubscriptionsProxy();
		proxy.load(pathNames.subPath);
		
		u = prox.getRegisteredUserByEmail("student1@gmail.com");
	}

	//1
	@Test
	public void testAddSub() throws Exception {
		u = prox.getRegisteredUserByEmail("student1@gmail.com");
		
		Subscription subscription = new Subscription("example.com", "example", u, true);
		proxy.addSub(subscription);
		
		assertTrue(proxy.getSubs().contains(subscription));
	}

	//2
	@Test
	public void testGetSubs() throws Exception {
		u = prox.getRegisteredUserByEmail("student1@gmail.com");
		
		List<Subscription> subs = new ArrayList<>();
		
		Subscription subscription1 = new Subscription("example2.com", "example2", u, true);
		Subscription subscription2 = new Subscription("example3.com", "example3", u, true);
		
		subs.add(subscription1);
		subs.add(subscription2);
		
		proxy.setSubs(subs);
		
		assertEquals(subs, proxy.getSubs());
	}
	
	//3
	@Test
	public void testGetSubs_2() throws Exception {
		List<Subscription> subs = proxy.getSubs();
		assertEquals(subs, proxy.getSubs());

//		Subscription subscription3 = new Subscription("example4.com", "example4", u, true);
//		Subscription subscription4 = new Subscription("example5.com", "example5", u, true);
//		
//		subs.add(subscription3);
//	//	subs.add(subscription4);
//	//	assertTrue(proxy.getSubs().contains(subscription3));
//		assertTrue(proxy.getSubs().contains(subscription4));
//		
//		proxy.setSubs(subs);
//		
//		assertEquals(subs, proxy.getSubs());
	}
	
	//4
	@Test
	public void testGetSubs_3() throws Exception {
		assertNotNull(proxy.getSubs());
	}
	
	//5
	@Test
	public void testGetSubs_4() throws Exception {
		u = prox.getRegisteredUserByEmail("student1@gmail.com");
		
		List<Subscription> subs = new ArrayList<>();
		
		Subscription subscription5 = new Subscription("example6.com", "example6", u, true);
		Subscription subscription6 = new Subscription("example7.com", "example7", u, true);
		
		subs.add(subscription5);
		subs.add(subscription6);
		
		
		proxy.setSubs(subs);
		assertTrue(proxy.getSubs().contains(subscription5));
		assertTrue(proxy.getSubs().contains(subscription6));
		
		assertEquals(subs, proxy.getSubs());
	}
	
	//6
	@Test
	public void testGetSubs_5() throws Exception {
		assertFalse(proxy.getSubs()==null);
	}
	
	//7
	@Test
	public void testAddSub_2() throws Exception {
		u = prox.getRegisteredUserByEmail("student1@gmail.com");
		
		Subscription subscription = new Subscription("NYTimes.com", "NYTimes", u, true);
		proxy.addSub(subscription);
		
		assertTrue(proxy.getSubs().contains(subscription));
	}
	
	
	//8
	@Test
	public void testAddSub_3() throws Exception {
		u = prox.getRegisteredUserByEmail("student1@gmail.com");
		
		Subscription subscription = new Subscription("CNN.com", "CNN", u, true);
		proxy.addSub(subscription);
		
		assertTrue(proxy.getSubs().contains(subscription));
	}
	
	//9
	@Test
	public void testAddSub_4() throws Exception {
		u = prox.getRegisteredUserByEmail("student1@gmail.com");
		
		Subscription subscription = new Subscription("theguardian.com", "The Guardian", u, true);
		proxy.addSub(subscription);
		
		assertTrue(proxy.getSubs().contains(subscription));
	}
	
	//10
	@Test
	public void testGetSubs_6() throws Exception {
		assertFalse(proxy.getSubs()==null);
	}

}


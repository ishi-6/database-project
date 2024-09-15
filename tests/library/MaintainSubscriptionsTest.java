package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import library.MaintainSubscriptionsProxy;
import library.MaintainUserProxy;
import library.pathNames;

public class MaintainSubscriptionsTest {
	
	private SubscriptionDatabase subDB;
	
	private Subscription subscription;
	private User user;
//	private Student student;

	
	@Before
	public void setup() throws Exception {
		subDB = MaintainSubscriptions.getInstance();
		subDB.load(pathNames.subPath);
	
		UserDatabase prox = new MaintainUserProxy();
		prox.load(pathNames.path);
		user = prox.getRegisteredUserByEmail("student1@gmail.com");
		
//		student = new Student("student", "email", "password");
//		prox.addUser(student);

		Subscription sub;
		subscription = new Subscription("example.com", "example", user, true);
		subDB.addSub(subscription);
//		subDB.update();

	}
	
	//1
	@Test
    public void testAddSubscription() {
		subDB.addSub(subscription);

        List<Subscription> subscriptions = subDB.getSubs();
        assertTrue(subscriptions.contains(subscription));
    }
	
	//2
	@Test
    public void testGetSubscriptions() {
        List<Subscription> subscriptions = subDB.getSubs();
        int size = subscriptions.size();

        assertEquals(size, subscriptions.size());
    }
	
	//3
	@Test
    public void testSetSubscriptions() throws Exception {
		subDB.load(pathNames.subPath);
		subDB.addSub(subscription);
		subDB.update();
       
        List<Subscription> subscriptions = new ArrayList<>();
        Subscription newSub = new Subscription("NYTimes.com", "NYTimes", user, true);
        subscriptions.add(newSub);
        
        subDB.setSubs(subscriptions);

        assertFalse(subDB.getSubs().contains(subscription));
        assertTrue(subDB.getSubs().contains(newSub));
    }
	
	//4
	@Test
    public void testGetSubscriptions_1() {
        List<Subscription> subscriptions = subDB.getSubs();
        int size = subscriptions.size();

        assertEquals(size, subscriptions.size());
    }
	
	//5
	@Test
	public void testAddSubscription_2() throws Exception {
		UserDatabase prox = new MaintainUserProxy();
		prox.load(pathNames.path);
		user = prox.getRegisteredUserByEmail("student1@gmail.com");
		
//		student = new Student("student", "email", "password");
//		prox.addUser(student);

		Subscription sub;
		sub = new Subscription("CNN.com", "CNN", user, true);
		subDB.addSub(sub);

		List<Subscription> subscriptions = subDB.getSubs();
		assertTrue(subscriptions.contains(sub));
	}
	
	//6
	@Test
    public void testGetSubscriptions_2() {
        List<Subscription> subscriptions = subDB.getSubs();
        int size = subscriptions.size();

        assertEquals(size, subscriptions.size());
    }
	
	
	//7
	@Test
	public void testAddSubscription_3() throws Exception {
		UserDatabase prox = new MaintainUserProxy();
		prox.load(pathNames.path);
		user = prox.getRegisteredUserByEmail("student1@gmail.com");
		
//		student = new Student("student", "email", "password");
//		prox.addUser(student);

		Subscription sub;
		sub = new Subscription("theguardian.com", "The Guardian", user, true);
		subDB.addSub(sub);

		List<Subscription> subscriptions = subDB.getSubs();
		assertTrue(subscriptions.contains(sub));
	}
	
	//8
	@Test
    public void testGetSubscriptions_3() {
        List<Subscription> subscriptions = subDB.getSubs();
        int size = subscriptions.size();

        assertEquals(size, subscriptions.size());
    }
	
	//9
	@Test
    public void testGetSubscriptions_4() {
		subDB.addSub(subscription);
        List<Subscription> subscriptions = subDB.getSubs();
        int size = subscriptions.size();

        assertEquals(size, subscriptions.size());
    }
	
	//10
	@Test
    public void testGetSubscriptions_5() {
		subDB.addSub(subscription);
        List<Subscription> subscriptions = subDB.getSubs();
        int size = subscriptions.size();

       
        assertEquals(size, subscriptions.size());
    }
	
}

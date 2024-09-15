package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	private Account account;
    private User user;

    @Before
    public void setUp() {
        user = new Student("student", "test@gmail.com", "password");
        account = new Account(user);
    }

    //1
    @Test
    public void testGetItems() {
        assertTrue(account.getItems().isEmpty());
    }
    
    //2
    @Test
    public void testGetUser() {
        assertEquals(account.getUser(), user);
    }
    
    //3
    @Test
    public void testSetUser() {
    	Student user2 = new Student("student", "test2@gmail.com", "password");
    	account.setUser(user2);
    	assertEquals(account.getUser(), user2);
    	account.setUser(user);
    	
    }
    
    //4
    @Test
    public void testGetNotificationsNoItems() {
        assertEquals("URGENT DUE DATES:No near due dates\n\nAll rented items:", account.getNotifications());
    }
    
    //5
    @Test
    public void testGetNotificationsNotDue() {
        // Add an item due within 24 hours to the account
        Book item = new Book("ItemDBProxyWorks", "Chemistry1", "2", "SteacieBasement", true, new Date(), new Date(), user, "Wiley", 0.00, "false", "false", "1");
        Calendar c = Calendar.getInstance();
        item.setBorrowedDate(new Date("04/04/2024 00:00:00"));
        item.setDueDate(new Date("04/04/2025 00:00:00"));
        item.setLostDate(new Date("04/04/2025 00:00:00"));
        account.getItems().add(item);
        String notifications = account.getNotifications();
        assertTrue(notifications.contains("No near due dates"));
    }
    
    //6
    @Test
    public void testGetNotificationsDueWithin24Hours() {
        // Add an item due within 24 hours to the account
        Book item = new Book("ItemDBProxyWorks", "Chemistry1", "2", "SteacieBasement", true, new Date(), new Date(), user, "Wiley", 0.00, "false", "false", "1");
        Calendar c = Calendar.getInstance();
        item.setBorrowedDate(c.getTime());
        c.add(Calendar.HOUR, 23);
        item.setDueDate(c.getTime());
        account.getItems().add(item);
        String notifications = account.getNotifications();
        assertTrue(notifications.contains("URGENT DUE DATES:"));
        assertTrue(notifications.contains("is due in less than 24 hours."));
    }
    
    //7
    @Test
    public void testGetNotificationsOverdue() {
        // Add an item due within 24 hours to the account
        Book item = new Book("ItemDBProxyWorks", "Chemistry1", "2", "SteacieBasement", true, new Date(), new Date(), user, "Wiley", 0.00, "false", "false", "1");
        Calendar c = Calendar.getInstance();
        item.setBorrowedDate(c.getTime());
        c.add(Calendar.DATE, 2);
        item.setDueDate(c.getTime());
        account.getItems().add(item);
        String notifications = account.getNotifications();
        assertFalse(notifications.contains("overdue"));
    }
    
    //8
    @Test
    public void testGetNotificationsLost() {
        // Add an item due within 24 hours to the account
        Book item = new Book("ItemDBProxyWorks", "Chemistry1", "2", "SteacieBasement", true, new Date(), new Date(), user, "Wiley", 0.00, "false", "false", "1");
        Calendar c = Calendar.getInstance();
        item.setDueDate(new Date("04/04/2020 00:00:00"));
        account.getItems().add(item);
        String notifications = account.getNotifications();
        assertTrue(notifications.contains("lost"));
    }
    
    //9
    @Test
    public void testSetItems() {
    	List<Item> items = new ArrayList<Item>();
    	account.setItems(items);
    	assertTrue(account.getItems().isEmpty());
    }
    
    //10
    @Test
    public void testGetNotificationsDueExactlyIn24Hours() {
        // Add an item due within 24 hours to the account
        Book item = new Book("ItemDBProxyWorks", "Chemistry1", "2", "SteacieBasement", true, new Date(), new Date(), user, "Wiley", 0.00, "false", "false", "1");
        Calendar c = Calendar.getInstance();
        item.setBorrowedDate(c.getTime());
        c.add(Calendar.DATE, 1);
        item.setDueDate(c.getTime());
        account.getItems().add(item);
        String notifications = account.getNotifications();
        assertFalse(notifications.contains("is due in less than 24 hours."));
    }
    
    
    
    
}

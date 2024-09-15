package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import library.Magazine;
import library.Student;

public class MagazineTest {
	private Magazine item;

	@Before
	public void setUp() {
		item = new Magazine("magazine", "title", "id", "location", true, new Date(), new Date(), new Student(), "publisher", 0.0,  "false", "false", "edition");

	}

    //1
    @Test
    public void testConstructorAndGetters() {
        assertEquals("magazine", item.getItemType());
        assertEquals("title", item.getTitle());
        assertEquals("id", item.getID());
        assertEquals("location", item.getLocation());
        
        assertEquals("true", item.getRentable());
        assertEquals("false", item.getPurchasable());
        assertEquals(false, item.isOnDiscount());
        
        assertNotNull(item.getBorrowedDate());
        assertNotNull(item.getDueDate());
        assertNotNull(item.getOwner());
        assertEquals("publisher", item.getPublisher());
        assertTrue(0.0 == item.getCost());
        assertEquals("edition", item.getEdition());
    }

    //2
    @Test
    public void testSetters() {
    	item.setItemType("magazine");
        assertEquals("magazine", item.getItemType());
        
        item.setTitle("new title");
        assertEquals("new title", item.getTitle());
        
        item.setID("new id");
        assertEquals("new id", item.getID());
        
        item.setLocation("new location");
        assertEquals("new location", item.getLocation());
        
        item.setRentable("false");
        assertFalse(item.isRentable());
        
        item.setOwner(new Student("student", "student@gmail.com", "password"));
        assertEquals("student", item.getOwner().getuserType());
        
        item.setPublisher("bob");
        assertEquals("bob", item.getPublisher());
        
        item.setCost(0.0);
        assertTrue(0.0 == item.getCost());
        
        item.setEdition("2nd Edition");
        assertEquals("2nd Edition", item.getEdition());
        
        item.setLost(false);
        assertFalse(item.getIfLost());
        item.setPurchasable("false");
        assertEquals("false", item.getPurchasable());
        item.setOnDiscount("false");
        assertEquals("false", item.getOnDiscount());
    }

    //3
    @Test
    public void testDates() {
    	Date d = new Date();
    	item.setBorrowedDate(d);
        assertEquals(d, item.getBorrowedDate());
        
        Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.MONTH, 1); 
		item.setDueDate(c.getTime());
	    assertEquals(c.getTime(), item.getDueDate());
	    
	    c.add(Calendar.DATE, 15); 
	    item.setLostDate(c.getTime());
	    assertEquals(c.getTime(), item.getLostDate());
	    
         
    }
    //4
    @Test
    public void testCalcCost_BeforeDueDate() {
    	Date d = new Date();
    	item.setBorrowedDate(d);
    	Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		c.add(Calendar.DATE, 15);
    	
        item.calcCost(c.getTime());
        assertTrue(0.0 == item.getCost());
        assertEquals(false, item.getIfLost());
    }
    
    //5
    @Test
    public void testCalcCost_OnLostDay() {
    	Date d = new Date();
    	item.setBorrowedDate(d);
    	Calendar c = Calendar.getInstance();
    	c.setTime(d);

    	c.add(Calendar.DATE, 45);

    	item.calcCost(c.getTime());
    	assertTrue(7.5 == item.getCost());
    	assertEquals(false, item.getIfLost()); //15d inclusive

    }
    
    //6
    @Test
    public void testCalcCost_AfterLostDay() {
    	Date d = new Date();
    	item.setBorrowedDate(d);
    	Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		c.add(Calendar.DATE, 46);
    	
        item.calcCost(c.getTime());
        assertTrue(7.5 == item.getCost());
        assertEquals(true, item.getIfLost());
        
    }

    //7
    @Test
    public void testCalcCost_AfterDueDate() {
    	Date d = new Date();
    	item.setBorrowedDate(d);
    	Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		c.add(Calendar.DATE, 35);
    	
        item.calcCost(c.getTime());
        assertTrue(2.5 == item.getCost());
        assertEquals(false, item.getIfLost());
    }
    
    //8
    @Test
    public void testCalcCost_Lost() {
    	Date d = new Date();
    	item.setBorrowedDate(d);
    	Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		c.add(Calendar.DATE, 45);
    	
        item.calcCost(c.getTime());
        assertTrue(7.5 == item.getCost());
        assertEquals(false, item.getIfLost());
    }
    
    //9
    @Test
    public void testConsiderIfLost_A() {
    	Date d = new Date();
    	item.setBorrowedDate(d);
    	Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		c.add(Calendar.DATE, 46);
		item.considerIfLost(c.getTime());
    	
        assertEquals(true, item.getIfLost());
    }
    
    //10
    @Test
    public void testConsiderIfLost_B() {
    
    	Date d = new Date();
    	item.setBorrowedDate(d);
    	Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		c.add(Calendar.DATE, 15);
		item.considerIfLost(c.getTime());
    	
        assertEquals(false, item.getIfLost());
    }
}




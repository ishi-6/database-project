package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import library.*;



public class MaintainItemTest {


    private MaintainItems maintainItems;

    @Before
    public void setUp() {
        maintainItems = (MaintainItems) MaintainItems.getInstance();
    }

    @Test
    public void testAddItem() {
        Item item = new Book(); 
        item.setTitle("Book Title");
        item.setID("B001");
        maintainItems.addItem(item);
        assertEquals(10, maintainItems.getItems().size());
    }

    @Test
    public void testGetItemByID_ExistingID() {
        Item item = new CD(); 
        item.setTitle("CD Title");
        item.setID("C001");
        maintainItems.addItem(item);

        Item retrievedItem = maintainItems.getItemByID("C001");
        assertNotNull(retrievedItem);
        assertEquals("CD Title", retrievedItem.getTitle());
    }

    @Test
    public void testGetItemByID_NonExistingID() {
        Item retrievedItem = maintainItems.getItemByID("NonExistingID");
        assertNull(retrievedItem);
    }

    @Test
    public void testGetItemByTitle_ExistingTitle() {
        Item item = new Magazine(); 
        item.setTitle("Magazine Title");
        maintainItems.addItem(item);

        Item retrievedItem = maintainItems.getItemByTitle("Magazine Title");
        assertNotNull(retrievedItem);
        assertEquals("Magazine Title", retrievedItem.getTitle());
    }

    @Test
    public void testGetItemByTitle_NonExistingTitle() {
        Item retrievedItem = maintainItems.getItemByTitle("NonExistingTitle");
        assertNull(retrievedItem);
    }

    @Test
    public void testUpdate() {
    	try {
			maintainItems.load(pathNames.itemDBpath);
			maintainItems.getItems().get(0).setID("123");
			assertNotNull(maintainItems.getItemByID("123"));
			//maintainItems.update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    @Test
    public void testSetItems() {
        List<Item> retrievedItem = maintainItems.getItems();
        maintainItems.setItems(retrievedItem);
        assertEquals(retrievedItem, maintainItems.getItems());
    }
    
    @Test
    public void testGetItemByTitle_ExistingTitle2() {
        Item retrievedItem = maintainItems.getItemByTitle("title");
        assertNotNull(retrievedItem);
        assertEquals("title", retrievedItem.getTitle());
    }
    
    @Test
    public void testGetItemByTitle_ExistingTitle3() {

        Item retrievedItem = maintainItems.getItemByTitle("Chemistry1");
        assertNotNull(retrievedItem);
        assertEquals("Chemistry1", retrievedItem.getTitle());
    }
    
    @Test
    public void testGetItemByTitle_ExistingTitle4() {

        Item retrievedItem = maintainItems.getItemByTitle("Chemistry2");
        assertNotNull(retrievedItem);
        assertEquals("Chemistry2", retrievedItem.getTitle());
    }
    
   
    
    
}


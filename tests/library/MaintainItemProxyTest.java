package library;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import library.*;

public class MaintainItemProxyTest {

	private MaintainItemsProxy maintainItemsProxy;

    @Before
    public void setUp() {
        maintainItemsProxy = new MaintainItemsProxy();
    }
    
    @Test
    public void testAddItem() {
    	
    	maintainItemsProxy.load(pathNames.itemDBpath);
        Item item = new Book(); 
        item.setTitle("Book Title");
        item.setID("B001");
        maintainItemsProxy.addItem(item);
        assertTrue(maintainItemsProxy.getItems().contains(item));
        
    }
    
    @Test
    public void testAddItem2() {
    	maintainItemsProxy.load(pathNames.itemDBpath);
        Item item = new Book(); 
        item.setTitle("Book Title2");
        item.setID("B002");
        maintainItemsProxy.addItem(item);
        assertTrue(maintainItemsProxy.getItems().contains(item));
        
    }

    @Test
    public void testGetItemByID_ExistingID() {
        Item item = new CD(); 
        item.setTitle("CD Title");
        item.setID("C001");
        maintainItemsProxy.addItem(item);

        Item retrievedItem = maintainItemsProxy.getItemByID("C001");
        assertNotNull(retrievedItem);
        assertEquals("CD Title", retrievedItem.getTitle());
    }


    

    @Test
    public void testGetItemByTitle_NonExistingTitle() {
        Item retrievedItem = maintainItemsProxy.getItemByTitle("NonExistingTitle");
        assertNull(retrievedItem);
    }

    @Test
    public void testUpdate() {
    	try {
			maintainItemsProxy.load(pathNames.itemDBpath);
			maintainItemsProxy.getItems().get(0).setID("123");
			assertNotNull(maintainItemsProxy.getItemByID("123"));
			//maintainItemsProxy.update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    @Test
    public void testSetItems() {
        List<Item> retrievedItem = maintainItemsProxy.getItems();
        maintainItemsProxy.setItems(retrievedItem);
        assertEquals(retrievedItem, maintainItemsProxy.getItems());
    }
    
    @Test
    public void testGetItemByTitle_ExistingTitle2() {
        Item retrievedItem = maintainItemsProxy.getItemByTitle("title");
        assertNotNull(retrievedItem);
        assertEquals("title", retrievedItem.getTitle());
    }
    
    @Test
    public void testGetItemByTitle_ExistingTitle3() {

        Item retrievedItem = maintainItemsProxy.getItemByTitle("Chemistry1");
        assertNotNull(retrievedItem);
        assertEquals("Chemistry1", retrievedItem.getTitle());
    }
    
    @Test
    public void testGetItemByTitle_ExistingTitle4() {

        Item retrievedItem = maintainItemsProxy.getItemByTitle("Chemistry2");
        assertNotNull(retrievedItem);
        assertEquals("Chemistry2", retrievedItem.getTitle());
    }
    
    @Test
    public void testGetItemByID_ExistingID2() {
    	try {
			maintainItemsProxy.load(pathNames.itemDBpath);
			Item retrievedItem = maintainItemsProxy.getItemByID("2");
	        assertNotNull(retrievedItem);
	        assertEquals("2", retrievedItem.getID());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
    
    

}

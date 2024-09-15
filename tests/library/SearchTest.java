package library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import library.Book;
import library.Context;
import library.Item;
import library.ItemDatabase;
import library.MaintainItemsProxy;
import library.MaintainUserProxy;
import library.Search;
import library.Student;
import library.User;
import library.UserDatabase;
import library.pathNames;

public class SearchTest {
	
	static User newUser;
	static Item book1;
	static Item book2;
	static Item book3;
	static Item book4;
	static ItemDatabase itemDBprox;
	
	@BeforeClass
    public static void setUp() throws Exception {
		newUser = new Student("student", "student@gmail.com", "t4t4");
		book1 = new Book("ItemDBProxyWorks", "Chemistry1", "2", "SteacieBasement", true, new Date(), new Date(), newUser, "Wiley", 0.00, "false", "false", "1");
		book2 = new Book("ItemSearchTest", "Chemistry1", "2", "SteacieBasement", true, new Date(), new Date(), newUser, "Wiley", 0.00, "false", "false", "1");
		book3 = new Book("TestSearch", "Chemistry1", "3", "SteacieBasement", true, new Date(), new Date(), newUser, "Wiley", 0.00, "false", "false", "1");
		book4 =  new Book("ChemistryOfQuilting", "Chemistry1", "2", "SteacieBasement", true, new Date(), new Date(), newUser, "Wiley", 0.00, "false", "false", "1");
		itemDBprox = new MaintainItemsProxy();
	
		book3.setPurchasable("true");
		book3.setOnDiscount("true");
		
		itemDBprox.setItems(new ArrayList<Item>());
		itemDBprox.addItem(book1);
		itemDBprox.addItem(book2);
		itemDBprox.addItem(book3);
	}
		
	@Test
	public void singleSearchTest() {
		Context context = new Context(new Search());
		List<Item> search = context.strategyInput("ItemSearchTest", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		compare.add(book2);
		Assert.assertEquals(search.toString(), compare.toString());
	}
	
	@Test
	public void multiSearchTest() throws Exception {
		itemDBprox.load(pathNames.itemDBpath);
		Context context = new Context(new Search());
		List<Item> search = context.strategyInput("Test", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		compare.add(book2);
		compare.add(book3);
		Assert.assertEquals(search.toString(), compare.toString());
	}
	
	@Test
	public void lostSearchTest() {
		Context context = new Context(new Search());
		Item lostBook = new Book("404NotFound", "Chemistry1", "3", "SteacieBasement", true, new Date(), new Date(), newUser, "Wiley", 0.00, "false", "false", "1");
		lostBook.setBorrowedDate(new Date(0));
		lostBook.considerIfLost(new Date());
		itemDBprox.addItem(lostBook);
		List<Item> search = context.strategyInput("404NotFound", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		Assert.assertEquals(search.toString(), compare.toString());
	}
	
	@Test
	public void emptySearchTest() {
		Context context = new Context(new Search());
		List<Item> search = context.strategyInput("q", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		Assert.assertEquals(search.toString(), compare.toString());
	}
	
	@Test
	public void addBookSearchTest() {
		Context context = new Context(new Search());
		List<Item> search = context.strategyInput("Q", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		Assert.assertEquals(search.toString(), compare.toString());
		compare.add(book4);
		search = context.strategyInput("Q", itemDBprox);
		Assert.assertNotSame(search.toString(), compare.toString());
		itemDBprox.addItem(book4);
		search = context.strategyInput("Q", itemDBprox);
		Assert.assertEquals(search.toString(), compare.toString());
	}
	
	@Test
	public void persistencyTest() {
		Context context = new Context(new Search());
		List<Item> search = context.strategyInput("Q", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		compare.add(book4);
		Assert.assertEquals(search.toString(), compare.toString());
	}
	
	@Test
	public void totalTest() {
		Context context = new Context(new Search());
		List<Item> search = context.strategyInput("", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		compare = itemDBprox.getItems();
		Assert.assertEquals(search.toString(), compare.toString());
	}
	
	@Test
	public void removeBookTest() {
		Context context = new Context(new Search());
		List<Item> items = itemDBprox.getItems();
		items.remove(book4);
		itemDBprox.setItems(items);
		List<Item> search = context.strategyInput("Q", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		Assert.assertEquals(search.toString(), compare.toString());
	}
	
	@Test
	public void emptyDatabaseTest() throws Exception {
		Context context = new Context(new Search());
		itemDBprox.setItems(new ArrayList<Item>());
		List<Item> search = context.strategyInput("", itemDBprox);
		Assert.assertEquals(search.toString(), new ArrayList<Item>().toString());
		setUp();
	}
	
	@Test
	public void reloadedDatabaseTest() throws Exception {
		Context context = new Context(new Search());
		itemDBprox.setItems(new ArrayList<Item>());
		setUp();
		List<Item> search = context.strategyInput("", itemDBprox);
		List<Item> compare = itemDBprox.getItems();
		Assert.assertEquals(search.toString(), compare.toString());
	}

}

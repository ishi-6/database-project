package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import library.Book;
import library.CD;
import library.Context;
import library.DiscountOffers;
import library.Item;
import library.ItemDatabase;
import library.Magazine;
import library.MaintainItemsProxy;
import library.MaintainUserProxy;
import library.Student;
import library.User;
import library.UserDatabase;
import library.pathNames;

public class DiscountOfferTest {
	
	//static UserDatabase prox;
	static User newUser;
	static Item book1;
	static Item book2;
	static Item book3;
	static Item book4;
	static ItemDatabase itemDBprox;
	
	@BeforeClass
    public static void setUp() throws Exception {
	//	prox = new MaintainUserProxy();
		newUser = new Student("student", "student@gmail.com", "t4t4");
		book1 = new Book("ItemDBProxyWorks", "Chemistry1", "2", "SteacieBasement", true, new Date(), new Date(), newUser, "Wiley", 0.00, "false", "false", "1");
		book2 = new Book("ItemSearchTest", "Chemistry1", "2", "SteacieBasement", true, new Date(), new Date(), newUser, "Wiley", 0.00, "false", "false", "1");
		book3 = new Book("TestSearch", "Chemistry1", "3", "SteacieBasement", true, new Date(), new Date(), newUser, "Wiley", 0.00, "false", "false", "1");
		book4 =  new Book("ChemistryOfQuilting", "Chemistry1", "2", "SteacieBasement", true, new Date(), new Date(), newUser, "Wiley", 0.00, "false", "false", "1");
		itemDBprox = new MaintainItemsProxy();
	
		book3.setPurchasable("true");
		book3.setOnDiscount("true");
		
		itemDBprox.load(pathNames.itemDBpath);
		itemDBprox.addItem(book1);
		itemDBprox.addItem(book2);
		itemDBprox.addItem(book3);
	}
	
	@Test
	public void discountOffersTest() {
		Context context = new Context(new DiscountOffers());
		List<Item> discount = context.strategyInput("", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		compare.add(book3);
		Assert.assertEquals(discount.toString(), compare.toString());
	}
	
	@Test
	public void noDiscountOffersTest() {
		Context context = new Context(new DiscountOffers());
		itemDBprox.getItemByID("3").setPurchasable("false");
		itemDBprox.getItemByID("3").setOnDiscount("false");
		List<Item> discount = context.strategyInput("", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		Assert.assertEquals(discount.toString(), compare.toString());
		
		//return to original state
		itemDBprox.getItemByID("3").setPurchasable("true");
		itemDBprox.getItemByID("3").setOnDiscount("true");
	}
	
	//modified setPurchasable for this to work
	@Test
	public void notPurchasableTest() {
		Context context = new Context(new DiscountOffers());
		itemDBprox.getItemByID("3").setPurchasable("false");
		List<Item> compare = new ArrayList<Item>();
		List<Item> discount = context.strategyInput("", itemDBprox);
		assertEquals(discount.toString(), compare.toString());
		
		//return to original state
		itemDBprox.getItemByID("3").setPurchasable("true");
		itemDBprox.getItemByID("3").setOnDiscount("true");
	}
	
	@Test
	public void addDiscountsTest() throws Exception {
		Context context = new Context(new DiscountOffers());
		List<Item> compare = new ArrayList<Item>();
		compare.add(itemDBprox.getItemByID("2"));
		itemDBprox.getItemByID("2").setPurchasable("true");
		itemDBprox.getItemByID("2").setOnDiscount("true");
		List<Item> discount = context.strategyInput("", itemDBprox);
		compare.add(book3);
		assertTrue(discount.toString().contains(book3 + ""));
	//	assertEquals(discount.toString(), compare.toString());
		
		//return to original state
		itemDBprox.getItemByID("2").setPurchasable("false");
		itemDBprox.getItemByID("2").setOnDiscount("false");
	}
	
	//modified setOnDiscount for this to work
	@Test
	public void purchasableTest() {
		
		Context context = new Context(new DiscountOffers());
		itemDBprox.getItemByID("2").setOnDiscount("true");
		List<Item> compare = new ArrayList<Item>();
		List<Item> discount = context.strategyInput("", itemDBprox);
		compare.add(book3);
		assertTrue(discount.toString().contains(book3 + ""));
	//	assertFalse(discount.toString(), compare.toString());
		
		//return to original state
		itemDBprox.getItemByID("2").setPurchasable("false");
		itemDBprox.getItemByID("2").setOnDiscount("false");
	}
	
	@Test
	public void discountAlternateConstructorBookTest() {
		Context context = new Context(new DiscountOffers());
		Item Book = new CD();
		Book.setPurchasable("true");
		Book.setOnDiscount("true");
		itemDBprox.addItem(Book);
		List<Item> discount = context.strategyInput("", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		compare.add(book3);
		compare.add(Book);
		assertEquals(discount.toString(), compare.toString());
		
		//return to original state
		List<Item> temp = itemDBprox.getItems();
		temp.remove(Book);
		itemDBprox.setItems(temp);
	}
	
	@Test
	public void discountCDTest() {
		Context context = new Context(new DiscountOffers());
		Item CD = new CD();
		CD.setPurchasable("true");
		CD.setOnDiscount("true");
		itemDBprox.addItem(CD);
		List<Item> discount = context.strategyInput("", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		compare.add(book3);
		compare.add(CD);
		//assertEquals(discount.toString(), compare.toString());
		assertTrue(discount.toString().contains(book3 + "") && discount.toString().contains(CD + "") );
		
		//return to original state
		List<Item> temp = itemDBprox.getItems();
		temp.remove(CD);
		itemDBprox.setItems(temp);
	}
	
	@Test
	public void discountMagazineTest() {
		Context context = new Context(new DiscountOffers());
		Item Magazine = new Magazine();
		Magazine.setPurchasable("true");
		Magazine.setOnDiscount("true");
		itemDBprox = new MaintainItemsProxy();
		itemDBprox.addItem(Magazine);
		List<Item> discount = context.strategyInput("", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		compare.add(book3);
		compare.add(Magazine);
		assertEquals(discount.toString(), compare.toString());
		
		//return to original state
		List<Item> temp = itemDBprox.getItems();
		temp.remove(Magazine);
		itemDBprox.setItems(temp);
	}
	
	@Test
	public void emptyDatabaseTest() throws Exception {
		Context context = new Context(new DiscountOffers());
		
		itemDBprox.setItems(new ArrayList<Item>());
		List<Item> discount = context.strategyInput("", itemDBprox);
		assertEquals(discount.toString(), new ArrayList<Item>().toString());
		
		//return to original state
		setUp();
	}
	
	@Test
	public void reloadedDatabaseTest() throws Exception {
		Context context = new Context(new DiscountOffers());
		itemDBprox.setItems(new ArrayList<Item>());
		setUp();
		List<Item> discount = context.strategyInput("", itemDBprox);
		List<Item> compare = new ArrayList<Item>();
		compare.add(book3);
		assertEquals(discount.toString(), compare.toString());
	}
}

package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class NewsletterSystemTest {

	NewsletterSystem news;

	@Before
	public void setup() {
		news = new NewsletterSystem("example", "example.com");
	}
	
	//1 
	@Test
	public void testConstructorWithNonNullValues() {
		NewsletterSystem news = new NewsletterSystem("example2", "example2.com");
		assertEquals("example2.com", news.getWebsite());
		assertEquals("example2", news.getCompany());
	}

	//2
	@Test
	public void testDefaultConstructor() {
		NewsletterSystem news = new NewsletterSystem();

		assertNull(news.getWebsite());
		assertNull(news.getCompany());
	}

	//3
	@Test
	public void testSetSite() {
		news.setWebsite("NYTimes.com");
		assertEquals("NYTimes.com", news.getWebsite());
	}

	//4
	@Test
	public void testSetCompanyName() {
		news.setCompany("NYTimes");
		assertEquals("NYTimes", news.getCompany());
	}
	
	//5
	@Test
	public void testSetSite_2() {
		news.setWebsite("CNN.com");
		assertEquals("CNN.com", news.getWebsite());
	}
	
	//6
	@Test
	public void testSetCompanyName_2() {
		news.setCompany("CNN");
		assertEquals("CNN", news.getCompany());
	}
	
	//7
	@Test
	public void testSetSite_3() {
		news.setWebsite("MSN.com");
		assertEquals("MSN.com", news.getWebsite());
	}
	
	//8
	@Test
	public void testSetCompanyName_3() {
		news.setCompany("MSN");
		assertEquals("MSN", news.getCompany());
	}
	
	//9
	@Test
	public void testSetSite_4() {
		news.setWebsite("theguardian.com");
		assertEquals("theguardian.com", news.getWebsite());
	}
	
	//10
	@Test
	public void testSetCompanyName_4() {
		news.setCompany("The Guardian");
		assertEquals("The Guardian", news.getCompany());
	}

}

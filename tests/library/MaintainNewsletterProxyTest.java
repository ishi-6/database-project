package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import library.MaintainNewsletterProxy;
import library.pathNames;

public class MaintainNewsletterProxyTest {

	private NewsletterDatabase proxy;

	@Before
	public void setUp() throws Exception {
		proxy = new MaintainNewsletterProxy();
		proxy.load(pathNames.newsPath);
	}
	
	//1
	@Test
	public void testAddNews() throws Exception {
		NewsletterSystem news = new NewsletterSystem("NYTimes", "NYTimes.com");
        proxy.addNews(news);
        proxy.update();
        assertTrue(proxy.getNews().contains(news));
	}

	//2
	@Test
	public void testSetNews() throws Exception {
		List<NewsletterSystem> newsList2 = new ArrayList<>();
        NewsletterSystem news1 = new NewsletterSystem("example", "example.com");
        NewsletterSystem news2 = new NewsletterSystem("example2", "example2.com");
        newsList2.add(news1);
        newsList2.add(news2);
        proxy.setNews(newsList2);
        proxy.update();
        assertEquals(newsList2, proxy.getNews());
	}
	
	//3
	@Test
	public void testGetNews() {
		List<NewsletterSystem> newsList = proxy.getNews();
		assertEquals(newsList, proxy.getNews());
	}
	
	//4
	@Test
	public void testGetNewsByName() throws Exception {
		NewsletterSystem news3 = new NewsletterSystem("NYTimes2", "NYTimes2.com");
		proxy.addNews(news3);
		assertEquals(news3, proxy.getItemByName("NYTimes2"));
	}
	
	//5
	@Test
	public void testAddNews_2() throws Exception {
		NewsletterSystem news4 = new NewsletterSystem("CNN", "CNN.com");
        proxy.addNews(news4);
        proxy.update();
        assertTrue(proxy.getNews().contains(news4));
	}

	//6
	@Test
	public void testSetNews_2() throws Exception {
		List<NewsletterSystem> newsList2 = new ArrayList<>();
        NewsletterSystem news5 = new NewsletterSystem("example3", "example3.com");
        NewsletterSystem news6 = new NewsletterSystem("example4", "example4.com");
        newsList2.add(news5);
        newsList2.add(news6);
        proxy.setNews(newsList2);
        proxy.update();
        assertEquals(newsList2, proxy.getNews());
	}
	
	//7
	@Test
	public void testGetNews_2() {
		List<NewsletterSystem> newsList2 = proxy.getNews();
		assertEquals(newsList2, proxy.getNews());
	}
	
	//8
	@Test
	public void testGetNewsByName_2() throws Exception {
		NewsletterSystem news7 = new NewsletterSystem("NYTimes2", "NYTimes2.com");
		proxy.addNews(news7);
		assertEquals(news7, proxy.getItemByName("NYTimes2"));
	}
	
	//9
	@Test
	public void testGetNewsByName_3() throws Exception {
		assertNotNull(proxy.getItemByName("NYTimes"));
	}
	
	//10
	@Test
	public void testGetNewsByName_4() throws Exception {
		assertNotNull(proxy.getItemByName("NYTimes2"));
	}

}

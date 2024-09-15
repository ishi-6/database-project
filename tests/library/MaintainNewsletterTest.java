package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import library.MaintainNewsletterProxy;
import library.MaintainNewsletter;

public class MaintainNewsletterTest {
	
	private NewsletterDatabase newsDB;

	@Before
	public void setUp() throws Exception {
		newsDB = MaintainNewsletter.getInstance();
		newsDB.load(pathNames.newsPath);

	}
	
	//1
	@Test
	public void testAddNews() throws Exception {
		NewsletterSystem news = new NewsletterSystem("NYTimes", "NYTimes.com");
		newsDB.addNews(news);
		newsDB.update();
        assertTrue(newsDB.getNews().contains(news));
	}

	//2
	@Test
	public void testSetNews() throws Exception {
		List<NewsletterSystem> newsList2 = new ArrayList<>();
        NewsletterSystem news1 = new NewsletterSystem("example", "example.com");
        NewsletterSystem news2 = new NewsletterSystem("example2", "example2.com");
        newsList2.add(news1);
        newsList2.add(news2);
        newsDB.setNews(newsList2);
        newsDB.update();
        assertEquals(newsList2, newsDB.getNews());
	}
	
	//3
	@Test
	public void testGetNews() {
		List<NewsletterSystem> newsList = newsDB.getNews();
		assertEquals(newsList, newsDB.getNews());
	}
	
	//4
	@Test
	public void testGetNewsByName() throws Exception {
		NewsletterSystem news3 = new NewsletterSystem("NYTimes2", "NYTimes2.com");
		newsDB.addNews(news3);
		assertEquals(news3, newsDB.getItemByName("NYTimes2"));
	}
	
	//5
	@Test
	public void testGetNewsByName_2() throws Exception {
		assertNotNull(newsDB.getItemByName("NYTimes"));
	}
	
	//6
	@Test
	public void testGetNewsByName_3() throws Exception {
		assertNotNull(newsDB.getItemByName("example"));
	}
	
	//7
	@Test
	public void testGetNewsByName_4() throws Exception {
		assertNotNull(newsDB.getItemByName("example2"));
	}
	
	//8
	@Test
	public void testGetNews_2() {
		List<NewsletterSystem> newsList2 = newsDB.getNews();
		assertEquals(newsList2, newsDB.getNews());
	}
	
	//9
	@Test
	public void testGetNews_3() {
		List<NewsletterSystem> newsList3 = newsDB.getNews();
		assertEquals(newsList3, newsDB.getNews());
	}
	
	//10
	@Test
	public void testGetNews_4() {
		List<NewsletterSystem> newsList4 = newsDB.getNews();
		assertEquals(newsList4, newsDB.getNews());
	}



}

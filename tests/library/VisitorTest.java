package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class VisitorTest {
	
	private Visitor visitor;

	@Before
	public void setUp() {
		visitor = new Visitor();
		visitor = new Visitor("visitor", "visitor@gmail.com", "visitor password");
	}
	 
	@Test
	public void testConstructors() {
		assertNotNull(visitor);
		assertEquals("visitor", visitor.getuserType());
		assertEquals("visitor@gmail.com", visitor.getEmail());
		assertEquals("visitor password", visitor.getPassword());
	}

	@Test
	public void testGetuserType() {
		assertEquals("visitor", visitor.getuserType());
	}

	@Test
	public void testSetUserType() {
		visitor.setUserType("visitorType");
		assertEquals("visitorType", visitor.getuserType());
	}
	
	@Test
	public void testSetUserType2() { 
		visitor.setUserType("visitorABC");
		assertEquals("visitorABC", visitor.getuserType());
	}

	@Test
	public void testGetEmail() {
		assertEquals("visitor@gmail.com", visitor.getEmail());
	}

	@Test
	public void testSetEmail() {
		visitor.setEmail("visitorType@example.com");
		assertEquals("visitorType@example.com", visitor.getEmail());
	}
	
	@Test
	public void testSetEmail2() {
		visitor.setEmail("visitorABC@example.com");
		assertEquals("visitorABC@example.com", visitor.getEmail());
	}

	@Test
	public void testGetPassword() {
		assertEquals("visitor password", visitor.getPassword());
	}

	@Test
	public void testSetPassword() {
		visitor.setPassword("visitorType password");
		assertEquals("visitorType password", visitor.getPassword());
	}
	
	@Test
	public void testSetPassword2() {
		visitor.setPassword("visitorABC password");
		assertEquals("visitorABC password", visitor.getPassword());
	}

}

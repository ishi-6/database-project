package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class NonfacultyTest {
	
	private Nonfaculty nonfaculty;

	@Before
	public void setUp() {
		nonfaculty = new Nonfaculty();
		nonfaculty = new Nonfaculty("nonfaculty", "nonFac@gmail.com", "nonFac password");
	}

	@Test
	public void testConstructors() {
		assertNotNull(nonfaculty);
		assertEquals("nonfaculty", nonfaculty.getuserType());
		assertEquals("nonFac@gmail.com", nonfaculty.getEmail());
		assertEquals("nonFac password", nonfaculty.getPassword());
	}
	 
	@Test
	public void testGetuserType() {
		assertEquals("nonfaculty", nonfaculty.getuserType());
	}
 
	@Test
	public void testSetUserType() {
		nonfaculty.setUserType("nonFacType");
		assertEquals("nonFacType", nonfaculty.getuserType());
	}
	
	@Test
	public void testSetUserType2() {
		nonfaculty.setUserType("nonFacABC");
		assertEquals("nonFacABC", nonfaculty.getuserType());
	}

	@Test
	public void testGetEmail() {
		assertEquals("nonFac@gmail.com", nonfaculty.getEmail());
	}

	@Test
	public void testSetEmail() {
		nonfaculty.setEmail("nonFacType@example.com");
		assertEquals("nonFacType@example.com", nonfaculty.getEmail());
	}
	
	@Test
	public void testSetEmail2() {
		nonfaculty.setEmail("nonFacABC@example.com");
		assertEquals("nonFacABC@example.com", nonfaculty.getEmail());
	}

	@Test
	public void testGetPassword() {
		assertEquals("nonFac password", nonfaculty.getPassword());
	}

	@Test
	public void testSetPassword() {
		nonfaculty.setPassword("nonFacType password");
		assertEquals("nonFacType password", nonfaculty.getPassword());
	}
	
	@Test
	public void testSetPassword2() {
		nonfaculty.setPassword("nonFacABC password");
		assertEquals("nonFacABC password", nonfaculty.getPassword());
	}

}

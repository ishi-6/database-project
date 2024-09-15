package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import library.Course;



public class FacultyTest {
	
	private Faculty faculty;
	private Book i;
	private Date date;
	private User studentUser;
	private double cost;
	private Course course;
	private Faculty professor;
	private ArrayList<User> studentList;

	@Before 
	public void setUp() {
		faculty = new Faculty();
		faculty = new Faculty("faculty", "professor@gmail.com", "faculty password");
		i = new Book ("book", "bookTitle", "bookID", "location", true, date, date, studentUser, "publiser", cost, "purchase", "discounted", "edition");
		course = new Course("subject", "code", date, date, i, professor, studentList);
	}
	
	@Test
	public void testConstructors() {
		assertNotNull(faculty);
		assertEquals("faculty", faculty.getuserType());
		assertEquals("professor@gmail.com", faculty.getEmail());
		assertEquals("faculty password", faculty.getPassword());
	}

	@Test
	public void testGetuserType() {
		assertEquals("faculty", faculty.getuserType());
	}

	@Test
	public void testSetUserType() {
		faculty.setUserType("facultyType");
		assertEquals("facultyType", faculty.getuserType());
	}

	@Test
	public void testGetEmail() {
		assertEquals("professor@gmail.com", faculty.getEmail());
	}

	@Test
	public void testSetEmail() {
		faculty.setEmail("facultyType@example.com");
		assertEquals("facultyType@example.com", faculty.getEmail());
	}

	@Test
	public void testGetPassword() {
		assertEquals("faculty password", faculty.getPassword());
	}

	@Test
	public void testSetPassword() {
		faculty.setPassword("facultyType password");
		assertEquals("facultyType password", faculty.getPassword());
	}

	@Test
	public void testAddBookItem() {
		faculty.addBookItem(i);
		assertEquals(true, faculty.getBookItems().contains(i)); 
	}

	@Test
	public void testAddCourse() {
		faculty.addCourse(course);
		assertEquals(true, faculty.getCourses().contains(course));
	}

	@Test
	public void testGetCourses() {
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course);
		faculty.addCourse(course);
		
		assertEquals(true, faculty.getCourses().equals(courses));
	}

	@Test
	public void testGetBookItems() {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(i);
		faculty.addBookItem(i);
		
		assertEquals(true, faculty.getBookItems().equals(books));
	}

}

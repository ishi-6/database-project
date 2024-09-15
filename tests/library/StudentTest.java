package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class StudentTest {

	private Student student;
	private Book i;
	private Date date;
	private User studentUser;
	private double cost;
	private Course course;
	private Faculty professor;
	private ArrayList<User> studentList;
	
	@Before
	public void setup() {
		student = new Student();
		student = new Student("student", "student@gmail.com", "student password");
		i = new Book("book", "bookTitle", "bookID", "location", true, date, date, studentUser, "publiser", cost, "purchase", "discounted", "edition");
		course = new Course("subject", "code", date, date, i, professor,studentList);
	}  
	
	@Test
	public void testConstructors() {
		assertNotNull(student);
		assertEquals("student", student.getuserType());
		assertEquals("student@gmail.com", student.getEmail());
		assertEquals("student password", student.getPassword());
	}
	
	@Test
	public void testGetuserType() {
		assertEquals("student", student.getuserType());
	}

	@Test 
	public void testSetUserType() {
		student.setUserType("studentType");
		assertEquals("studentType", student.getuserType());
	}

	@Test
	public void testGetEmail() {
		assertEquals("student@gmail.com", student.getEmail());
	}

	@Test
	public void testSetEmail() {
		student.setEmail("studentType@example.com");
		assertEquals("studentType@example.com", student.getEmail());
	}

	@Test
	public void testGetPassword() {
		assertEquals("student password", student.getPassword());
	}

	@Test
	public void testSetPassword() {
		student.setPassword("studentType password");
		assertEquals("studentType password", student.getPassword());
	}

	@Test
	public void testAddBookItem() {
		student.addBookItem(i);
		assertEquals(true, student.getBookItems().contains(i));
	}

	@Test
	public void testAddCourse() {
		student.addCourse(course);
		assertEquals(true, student.getCourses().contains(course));
	}

	@Test
	public void testGetCourses() {
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course);
		student.addCourse(course);
		
		assertEquals(true, student.getCourses().equals(courses));
	}

	@Test
	public void testGetBookItems() {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(i);
		student.addBookItem(i);
		
		assertEquals(true, student.getBookItems().equals(books));
	}

}

package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MaintainCoursesProxyTest {

	private CourseDatabase proxy;

	@Before
	public void setUp() throws Exception {
		proxy = new MaintainCoursesProxy();
		
	}

	//1
	@Test
	public void testGetCourse() throws Exception {
		proxy.load(pathNames.COURSEDBPATH);
		Course course = new Course();
		Course foundCourse = proxy.getCourse(course);
		assertNull(foundCourse);

		proxy.addCourse(course);
		foundCourse = proxy.getCourse(course);
		assertEquals(course, foundCourse);
	}

	//2
	@Test
	public void testGetCourses() throws Exception {
		proxy.load(pathNames.COURSEDBPATH);
		List<Course> courses = proxy.getCourses();
		assertNotNull(courses);

	}

	//3
	@Test
	public void testSetCourses() throws Exception {
		proxy.load(pathNames.COURSEDBPATH);
		List<Course> courses = new ArrayList<>();
		proxy.setCourses(courses);
		assertEquals(courses, proxy.getCourses());
	}
	
	//4
	@Test
	public void testAddCourse() throws Exception {
		proxy.load(pathNames.COURSEDBPATH);
		Date date = new Date();
		Faculty professorFaculty = new Faculty("faculty", "faculty@gmail.com", "password");
		Book textbook = new Book("book", "textbook title", "idcoursetextbook", "location", false, date, date, professorFaculty, "publisher", 0.00, "false", "false", "edition 1" );
		ArrayList<User> students = new ArrayList<>();
		Student student = new Student("student", "student1@gmail.com", "password");
		students.add(student);
		Course course = new Course("math", "MATH1000", new Date(), new Date(), textbook, professorFaculty, students);
		
		proxy.addCourse(course);
		proxy.update();
		assertTrue(proxy.getCourses().contains(course));

	}
	
	//5
	@Test
	public void testSetCourses_2() throws Exception {
		proxy.load(pathNames.COURSEDBPATH);
		List<Course> courses2 = new ArrayList<>();
		proxy.setCourses(courses2);
		assertEquals(courses2, proxy.getCourses());
	}
	
	//6
	@Test
	public void testSetCourses_3() throws Exception {
		proxy.load(pathNames.COURSEDBPATH);
		List<Course> courses3 = new ArrayList<>();
		proxy.setCourses(courses3);
		assertEquals(courses3, proxy.getCourses());
	}

	//7
	@Test
	public void testGetCourses_2() throws Exception {
		proxy.load(pathNames.COURSEDBPATH);
		List<Course> courses2 = proxy.getCourses();
		assertNotNull(courses2);

	}
	
	//8
	@Test
	public void testGetCourses_3() throws Exception {
		proxy.load(pathNames.COURSEDBPATH);
		List<Course> courses3 = proxy.getCourses();
		assertNotNull(courses3);

	}
	
	//9
	@Test
	public void testGetCourse_2() throws Exception {
		proxy.load(pathNames.COURSEDBPATH);
		Course course = new Course();
		Course foundCourse = proxy.getCourse(course);
		assertNull(foundCourse);


		proxy.addCourse(course);
		foundCourse = proxy.getCourse(course);
		assertEquals(course, foundCourse);
	}
	
	//10
	@Test
	public void testGetCourse_3() throws Exception {
		proxy.load(pathNames.COURSEDBPATH);
		Course course = new Course();
		Course foundCourse = proxy.getCourse(course);
		assertNull(foundCourse);


		proxy.addCourse(course);
		foundCourse = proxy.getCourse(course);
		assertEquals(course, foundCourse);
	}




}

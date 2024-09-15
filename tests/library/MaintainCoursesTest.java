package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.FileWriter;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

public class MaintainCoursesTest {

	private MaintainCourses courseDB;
	private Course course;

	private Book textbook;
	private Faculty professorFaculty;
	private ArrayList<User> students;
	private Student student;
	private Date date;
	private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	// private SimpleDateFormat formatter;

	@Before
	public void setUp() throws Exception {
		date = new Date();
		courseDB = new MaintainCourses();
		//	courseDB.load(pathNames.COURSEDBPATH);
		// formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		textbook = new Book("book", "textbook title", "idcoursetextbook", "location", false, date, date, professorFaculty, "publisher", 0.00, "false", "false", "edition 1" );
		professorFaculty = new Faculty("faculty", "faculty@gmail.com", "password");
		student = new Student();
		students = new ArrayList<>();
		students.add(student);
		course = new Course("math", "MATH1000", new Date(), new Date(), textbook, professorFaculty, students);
	}

	//1
	@Test
	public void testGetCourse() {
		Course course = new Course();
		Course foundCourse = courseDB.getCourse(course);
		assertNull(foundCourse);


		courseDB.addCourse(course);
		foundCourse = courseDB.getCourse(course);
		assertEquals(course, foundCourse);

	}

	//2
	@Test
	public void testGetCourses() {
		List<Course> courses = courseDB.getCourses();
		assertNotNull(courses);

	}

	//3
	@Test
	public void testSetCourses() throws Exception {
		List<Course> courses = new ArrayList<>();
		courseDB.setCourses(courses);
		courseDB.update();
		assertEquals(courses, courseDB.getCourses());
	}

	//4
	@Test
	public void testAddCourse() throws Exception {
		courseDB.load(pathNames.COURSEDBPATH);
		courseDB.addCourse(this.course);
		courseDB.update();
		assertTrue(courseDB.getCourses().contains(course));

	}

	//5
	@Test
	public void testLoad() {
		String csvData = "subject,coursecode,startdate,enddate,textbook,faculty,students\n" +
				"math,math1000,01/01/2024 00:00:00,04/01/2024 00:00:00,textbook,faculty@gmail.com,student1@gmail.com,student2@example.com\n";

		try (FileWriter writer = new FileWriter("test.csv")) {
			writer.write(csvData);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			courseDB.load("test.csv");
		} catch (Exception e) {

		}
	}

	//6
	@Test
	public void testGetCourses_2() {
		List<Course> courses2 = courseDB.getCourses();
		assertNotNull(courses2);

	}
	
	//7
	@Test
	public void testLoad_2() {
		String csvData = "subject,coursecode,startdate,enddate,textbook,faculty,students\n" +
				"phys,phys1000,01/01/2024 00:00:00,04/01/2024 00:00:00,textbook,faculty@gmail.com,student1@gmail.com,student2@example.com\n";

		try (FileWriter writer = new FileWriter("test.csv")) {
			writer.write(csvData);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			courseDB.load("test.csv");
		} catch (Exception e) {

		}
	}
	
	//8
	@Test
	public void testSetCourses_2() throws Exception {
		List<Course> courses2 = new ArrayList<>();
		courseDB.setCourses(courses2);
		courseDB.update();
		assertEquals(courses2, courseDB.getCourses());
	}
	
	//9
	@Test
	public void testSetCourses_3() throws Exception {
		List<Course> courses3 = new ArrayList<>();
		courseDB.setCourses(courses3);
		courseDB.update();
		assertEquals(courses3, courseDB.getCourses());
	}
	
	//10
	@Test
	public void testSetCourses_4() throws Exception {
		List<Course> courses4 = new ArrayList<>();
		courseDB.setCourses(courses4);
		courseDB.update();
		assertEquals(courses4, courseDB.getCourses());
	}


}

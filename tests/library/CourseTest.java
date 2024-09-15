package library;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import library.User;
import library.MaintainUserProxy;
import library.Course;

public class CourseTest {
	private Course course;

	private Book textbook;
	private Faculty professorFaculty;
	private ArrayList<User> students;
	private Student student;

	@Before
	public void setUp() {
		textbook = new Book();
		professorFaculty = new Faculty("faculty", "faculty@gmail.com", "password");
		students = new ArrayList<>();
		student = new Student("student", "student1@gmail.com", "password");
		students.add(student);

		course = new Course("math", "MATH1000", new Date(), new Date(), textbook, professorFaculty, students);
	}

	//1
	@Test
	public void testSetAndGetSubject() {
		course.setSubject("physics");
		assertEquals("physics", course.getSubject());
	}

	//2
	@Test
	public void testSetAndGetCourseCode() {
		course.setCourseCode("PHYS1000");
		assertEquals("PHYS1000", course.getCourseCode());
	}

	//3
	@Test
	public void testSetAndGetStartDate() {
		Date startDate = new Date(2024, 01, 01);
		course.setStartDate(startDate);
		assertEquals(startDate, course.getStartDate());
	}

	//4
	@Test
	public void testSetAndGetEndDate() {
		Date endDate = new Date(2024, 04, 01);
		course.setEndDate(endDate);
		assertEquals(endDate, course.getEndDate());
	}

	//5
	@Test
	public void testSetAndGetTextbooks() {
		Book newTextbook = new Book();
		course.setTextbooks(newTextbook);
		assertEquals(newTextbook, course.getTextbooks());
	}

	//6
	@Test
	public void testSetAndGetFaculty() {
		Faculty newFaculty = new Faculty("faculty", "faculty2@gmail.com", "password");
		course.setFaculty(newFaculty);
		assertEquals(newFaculty, course.getProfessorFaculty());
	}

	//7
	@Test
	public void testGetStudentsToString() {
		assertEquals("student1@gmail.com," , course.getStudentsToString());
	}

	//8
	@Test
	public void testSetAndGetStudents() {
		ArrayList<User> newStudents = new ArrayList<>();
		newStudents.add(new Student("student", "student20@gmail.com", "password"));
		course.setStudents(newStudents);
		assertEquals(newStudents, course.getStudents());
		assertEquals("student20@gmail.com,", course.getStudentsToString());

	}

	//9
	@Test
	public void testSetAndGetCourseCode_2() {
		course.setCourseCode("CHEM1000");
		assertEquals("CHEM1000", course.getCourseCode());
	}

	//10
	@Test
	public void testSetAndGetSubject_2() {
		course.setSubject("physics");
		assertEquals("physics", course.getSubject());
	}
}





package library;

import java.util.List;
import java.util.ArrayList;

public interface CourseDatabase {
	

	void update() throws Exception;

	Course getCourse(Course Course);

	List<Course> getCourses();

	void setCourses(List<Course> course);
	public void addCourse(Course courses);

	void load(String path) throws Exception;

}

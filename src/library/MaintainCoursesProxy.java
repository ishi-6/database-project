package library;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class MaintainCoursesProxy implements CourseDatabase{
    
    private List<Course> courses = new ArrayList<Course>();
	private String path=pathNames.COURSEDBPATH;
	private static CourseDatabase maintainCoursesPInstance = new MaintainCourses();
	

	
	private void initializeProxy() throws Exception {
		if (courses.isEmpty()) {
			maintainCoursesPInstance.load(pathNames.COURSEDBPATH);
			setCourses((maintainCoursesPInstance.getCourses()));
		}
	}

	@Override
	public void load(String path) {
		try {
			initializeProxy();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void update() throws Exception{
		initializeProxy();
		maintainCoursesPInstance.setCourses(this.courses);
		maintainCoursesPInstance.update();
	}
	
	@Override
	public Course getCourse(Course course) {
		for (Course i : courses) {
			if (i.equals(course)) {
				return i;
			}
		}
		return null;
	}
	
	@Override
	public List<Course> getCourses(){
		return this.courses;
	}
	
	@Override
	public void setCourses(List<Course> course){
		this.courses =course;
	}

	@Override
    public void addCourse(Course courses){
        this.courses.add(courses);
    }
}
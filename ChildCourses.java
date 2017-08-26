package project3;

public class ChildCourses extends Courses {
	String grade;
	public ChildCourses(String id, String name, String grade){
		super(id, name);
		super.grade = grade;
	}
}

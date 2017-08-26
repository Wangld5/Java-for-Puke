package project3;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	public List<Courses> course;
	public TestGeneric(){
		course = new ArrayList<Courses>();
	}
	public void Test(){
		Courses cr = new Courses("1", "Rome");
		course.add(cr);
		course.add(new Courses("2", "Italy"));
		course.add(new ChildCourses("3", "Mosco","13"));
		for(Courses temp: course){
			System.out.println(temp.id+temp.name);
		}
		System.out.println(course.get(2).grade);
	}
	public static void main(String[] args){
		TestGeneric tem = new TestGeneric();
		tem.Test();
	}
}

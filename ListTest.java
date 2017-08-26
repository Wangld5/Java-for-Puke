package project3;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListTest {
	public List courseToSelect;
	public ListTest(){
		this.courseToSelect = new ArrayList();
	}
	public void testAdd(){
		Courses cr1 = new Courses("1", "English");
		courseToSelect.add(cr1);
		System.out.println("添加课程： ");
	    Courses temp = (Courses)courseToSelect.get(0);
	    System.out.println(temp.id + temp.name);
	    
	    //使用Add另一种格式
	    Courses pr = new Courses("2", "数学");
	    courseToSelect.add(1, pr);
	    
	    //用addAll实现添加
	    Courses[] temp1 = {new Courses("3", "语文"), new Courses("4", "体育")};
	    courseToSelect.addAll(1,Arrays.asList(temp1));
	    
	    //用addAll另一种实现
	    Courses[] temp2 = {new Courses("5", "高数"), new Courses("6", "数据结构")};
	    courseToSelect.addAll(Arrays.asList(temp2));
	}
	public void TestGet(){
		for(Object i:courseToSelect){
			Courses temp = (Courses)i;
			System.out.println(temp.id+temp.name);
		}
	}
	public void TestGet2(){
		Iterator it = courseToSelect.iterator();
		while(it.hasNext()){
			Courses temp = (Courses)it.next();
			System.out.println(temp.id+temp.name);
		}
		
	}
	public void TestModify(){
		courseToSelect.set(4, new Courses("4", "毛概"));
	}
	public void TestRemove(){
		Courses temp = (Courses)courseToSelect.get(4);
		courseToSelect.remove(temp);
		courseToSelect.remove(2);
	}
	public void TestRemoveAll(){
		courseToSelect.removeAll(courseToSelect);
	}
	public static void main(String[] args){
		ListTest It = new ListTest();
		It.testAdd();
		//It.TestModify();
		//It.TestGet2();
		//It.TestRemove();
		//It.TestGet2();
		It.TestRemoveAll();
		It.TestGet2();
	}
}

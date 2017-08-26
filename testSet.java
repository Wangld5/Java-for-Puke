package project3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class testSet {
	public List<Courses> select;
	public testSet(){
		select = new ArrayList<Courses>();
	}
	public void testAdd(){
		Courses cr1 = new Courses("1", "English");
		select.add(cr1);
		System.out.println("添加课程： ");
	    Courses temp = (Courses)select.get(0);
	    System.out.println(temp.id + temp.name);
	    
	    //使用Add另一种格式
	    Courses pr = new Courses("2", "数学");
	    select.add(1, pr);
	    
	    //用addAll实现添加
	    Courses[] temp1 = {new Courses("3", "语文"), new Courses("4", "体育")};
	    select.addAll(1,Arrays.asList(temp1));
	    
	    //用addAll另一种实现
	    Courses[] temp2 = {new Courses("5", "高数"), new Courses("6", "数据结构")};
	    select.addAll(Arrays.asList(temp2));
	}
	public void TestGet(){
		for(Object i:select){
			Courses temp = (Courses)i;
			System.out.println(temp.id+temp.name);
		}
	}
	/*
	 * 测试序列是否包含某个元素
	 */
	public void testContain(){
		Courses course = select.get(0);
		Courses course2 = new Courses();
		Scanner console = new Scanner(System.in);
		String name = console.next();
		course2.name = name;
		if(select.contains(course2)){
			System.out.println("存在这个元素");
		}
		else{
			System.out.println("不存在该元素");
		}
	}
	public static void main(String[] args){
		testSet temp  = new testSet();
		temp.testAdd();
		temp.TestGet();
		temp.testContain();
		Scanner choose = new Scanner(System.in);
		Student student = new Student("1", "小明");
		for(int i=0; i<3; i++){
			String toch = choose.next();
			for(Courses temp2: temp.select){
				if(temp2.id.equals(toch)){
					student.course.add(temp2);
				}
			}
		}
		for(Courses temp3:student.course){
			System.out.println(temp3.id+temp3.name);
		}
		System.out.println("请输入课程：");
		String HasSelect = choose.next();
		Courses course2 = new Courses();
		course2.name = HasSelect;
		if(student.course.contains(course2)){
			System.out.println("课程已选");
		}
		else{
			System.out.println("课程未被选");
		}
	}
}

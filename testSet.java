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
		System.out.println("��ӿγ̣� ");
	    Courses temp = (Courses)select.get(0);
	    System.out.println(temp.id + temp.name);
	    
	    //ʹ��Add��һ�ָ�ʽ
	    Courses pr = new Courses("2", "��ѧ");
	    select.add(1, pr);
	    
	    //��addAllʵ�����
	    Courses[] temp1 = {new Courses("3", "����"), new Courses("4", "����")};
	    select.addAll(1,Arrays.asList(temp1));
	    
	    //��addAll��һ��ʵ��
	    Courses[] temp2 = {new Courses("5", "����"), new Courses("6", "���ݽṹ")};
	    select.addAll(Arrays.asList(temp2));
	}
	public void TestGet(){
		for(Object i:select){
			Courses temp = (Courses)i;
			System.out.println(temp.id+temp.name);
		}
	}
	/*
	 * ���������Ƿ����ĳ��Ԫ��
	 */
	public void testContain(){
		Courses course = select.get(0);
		Courses course2 = new Courses();
		Scanner console = new Scanner(System.in);
		String name = console.next();
		course2.name = name;
		if(select.contains(course2)){
			System.out.println("�������Ԫ��");
		}
		else{
			System.out.println("�����ڸ�Ԫ��");
		}
	}
	public static void main(String[] args){
		testSet temp  = new testSet();
		temp.testAdd();
		temp.TestGet();
		temp.testContain();
		Scanner choose = new Scanner(System.in);
		Student student = new Student("1", "С��");
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
		System.out.println("������γ̣�");
		String HasSelect = choose.next();
		Courses course2 = new Courses();
		course2.name = HasSelect;
		if(student.course.contains(course2)){
			System.out.println("�γ���ѡ");
		}
		else{
			System.out.println("�γ�δ��ѡ");
		}
	}
}

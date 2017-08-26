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
		System.out.println("��ӿγ̣� ");
	    Courses temp = (Courses)courseToSelect.get(0);
	    System.out.println(temp.id + temp.name);
	    
	    //ʹ��Add��һ�ָ�ʽ
	    Courses pr = new Courses("2", "��ѧ");
	    courseToSelect.add(1, pr);
	    
	    //��addAllʵ�����
	    Courses[] temp1 = {new Courses("3", "����"), new Courses("4", "����")};
	    courseToSelect.addAll(1,Arrays.asList(temp1));
	    
	    //��addAll��һ��ʵ��
	    Courses[] temp2 = {new Courses("5", "����"), new Courses("6", "���ݽṹ")};
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
		courseToSelect.set(4, new Courses("4", "ë��"));
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

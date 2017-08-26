package project3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class collectionsTest {
	public void test1() {
		List<Integer> integerList = new ArrayList<Integer>();
		Random random = new Random();
		Integer k;
		for(int i=0; i<10; i++){
			do{
				k = random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("success");
		}
		System.out.println("-----------------ÅÅÐòÇ°----------------------");
		for(Integer in:integerList){
			System.out.println(in);
		}
		Collections.sort(integerList);
		System.out.println("-----------------ÅÅÐòºó----------------------");
		for(Integer in:integerList){
			System.out.println(in);
		}
	}
	public void test2() {
		List<String> stringList = new ArrayList<String>();
		Random random = new Random();
		String k = "QWERTYUIOPASDFGHJKLZXCVBNMabcdefghijklmnopqrstuvwxyz0123456789";
		int m = 0;
		StringBuffer f = new StringBuffer();
		for(int i=0; i<10; i++){
			for(int j=0;j<10;j++){
				m = random.nextInt(k.length());
				f.append(k.charAt(m));
			}
			stringList.add(f.toString());
		}
		System.out.println("-----------------ÅÅÐòÇ°----------------------");
		for(String in:stringList){
			System.out.println(in);
		}
		Collections.sort(stringList);
		System.out.println("-----------------ÅÅÐòºó----------------------");
		for(String in:stringList){
			System.out.println(in);
		}
	}
	public void test3(){
		List<Student> Liststudents = new ArrayList<Student>();
		Liststudents.add(new Student("1", "Mike"));
		Liststudents.add(new Student("2", "Joke"));
		Liststudents.add(new Student("3", "Lucy"));
		Collections.sort(Liststudents);
		for(Student i: Liststudents){
			System.out.println(i.id+i.name);
		}
		Collections.sort(Liststudents, new studentsort());
		for(Student i: Liststudents){
			System.out.println(i.id+i.name);
		}
	}
	public static void main(String[] args) {
		collectionsTest temp = new collectionsTest();
		temp.test1();
		temp.test3();
	}
}

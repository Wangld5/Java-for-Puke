package project3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	public Map<String, Student> students;
	/*
	 * 实现学生对象的添加
	 */
	public MapTest(){
		students = new HashMap<String, Student>();
	}
	public void testPut(){
		Scanner console = new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("请输入学生ID： ");
			String st = console.next();
			Student st1 = students.get(st);
			if(st1==null){
				System.out.println("请输入学生姓名： ");
				String name = console.next();
				Student st2 = new Student(st, name);
				students.put(st, st2);
			}
			else{
				System.out.println("学生ID已被占用！");
			}
		}
	}
	/*
	 * 使用keySet遍历Map中的元素
	 */
	public void testKeySet(){
		Set<String> stuID = students.keySet();
		for(String st: stuID){
			Student one = students.get(st);
			System.out.println("学生信息： "+one.id+one.name);
		}
	}
	/*
	 * 使用entrySet遍历
	 */
	public void testEntrySet(){
		Set<Entry<String, Student>> entry = students.entrySet();
		for(Entry<String, Student> in: entry){
			System.out.println("取得的键为："+in.getKey());
			System.out.println("取得的值为："+in.getValue().name);
		}
	}
	/*
	 * 测试删除操作
	 */
	public void testRemove(){
		Scanner re = new Scanner(System.in);
		while(true){
			System.out.println("请输入学生ID：");
			String Id = re.next();
			Student If_in = students.get(Id);
			if(If_in == null){
				System.out.println("学生ID不存在！");
				continue;
			}
			else{
				students.remove(Id);
				System.out.println("成功删除");
				break;
			}
		}
	}
	/*
	 * 修改Map中的值
	 */
	public void testModify(){
		Scanner console = new Scanner(System.in);
		System.out.println("请输入学生ID：");
		while(true){
			String mm = console.next();
			Student It = students.get(mm);
			if(It == null){
				System.out.println("学生不存在");
				continue;
			}
			System.out.println("当前学生为： "+It.name);
			System.out.println("请输入新学生名字：");
			String newName = console.next();
			Student newStudent = new Student(mm, newName);
			students.put(mm, newStudent);
			System.out.println("修改成功");
			break;
		}
	}
	/*
	 * 测试Map中是否有对应的Key值和Value值
	 */
	public void testKeyorValue(){
		System.out.println("请输入学生ID：");
		Scanner console = new Scanner(System.in);
		String Id = console.next();
		if(students.containsKey(Id)){
			System.out.println("该学生为："+students.get(Id).name);
		}
		else{
			System.out.println("学生不存在");
		}
		System.out.println("请输入学生姓名：");
		String Name = console.next();
		if(students.containsValue(new Student(null, Name))){
			Set<Entry<String, Student>> stuID = students.entrySet();
			for(Entry<String, Student> in: stuID){
				if(in.getValue().name.equals(Name)){
					System.out.println("学生ID为："+in.getKey());
				}
			}
		}
		else{
			System.out.println("学生不存在");
		}
	}
	public static void main(String[] args){
		MapTest MyMap = new MapTest();
		MyMap.testPut();
		MyMap.testKeySet();
		MyMap.testRemove();
		MyMap.testEntrySet();
		MyMap.testModify();
		MyMap.testKeySet();
		MyMap.testKeyorValue();
	}
}

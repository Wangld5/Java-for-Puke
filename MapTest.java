package project3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	public Map<String, Student> students;
	/*
	 * ʵ��ѧ����������
	 */
	public MapTest(){
		students = new HashMap<String, Student>();
	}
	public void testPut(){
		Scanner console = new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("������ѧ��ID�� ");
			String st = console.next();
			Student st1 = students.get(st);
			if(st1==null){
				System.out.println("������ѧ�������� ");
				String name = console.next();
				Student st2 = new Student(st, name);
				students.put(st, st2);
			}
			else{
				System.out.println("ѧ��ID�ѱ�ռ�ã�");
			}
		}
	}
	/*
	 * ʹ��keySet����Map�е�Ԫ��
	 */
	public void testKeySet(){
		Set<String> stuID = students.keySet();
		for(String st: stuID){
			Student one = students.get(st);
			System.out.println("ѧ����Ϣ�� "+one.id+one.name);
		}
	}
	/*
	 * ʹ��entrySet����
	 */
	public void testEntrySet(){
		Set<Entry<String, Student>> entry = students.entrySet();
		for(Entry<String, Student> in: entry){
			System.out.println("ȡ�õļ�Ϊ��"+in.getKey());
			System.out.println("ȡ�õ�ֵΪ��"+in.getValue().name);
		}
	}
	/*
	 * ����ɾ������
	 */
	public void testRemove(){
		Scanner re = new Scanner(System.in);
		while(true){
			System.out.println("������ѧ��ID��");
			String Id = re.next();
			Student If_in = students.get(Id);
			if(If_in == null){
				System.out.println("ѧ��ID�����ڣ�");
				continue;
			}
			else{
				students.remove(Id);
				System.out.println("�ɹ�ɾ��");
				break;
			}
		}
	}
	/*
	 * �޸�Map�е�ֵ
	 */
	public void testModify(){
		Scanner console = new Scanner(System.in);
		System.out.println("������ѧ��ID��");
		while(true){
			String mm = console.next();
			Student It = students.get(mm);
			if(It == null){
				System.out.println("ѧ��������");
				continue;
			}
			System.out.println("��ǰѧ��Ϊ�� "+It.name);
			System.out.println("��������ѧ�����֣�");
			String newName = console.next();
			Student newStudent = new Student(mm, newName);
			students.put(mm, newStudent);
			System.out.println("�޸ĳɹ�");
			break;
		}
	}
	/*
	 * ����Map���Ƿ��ж�Ӧ��Keyֵ��Valueֵ
	 */
	public void testKeyorValue(){
		System.out.println("������ѧ��ID��");
		Scanner console = new Scanner(System.in);
		String Id = console.next();
		if(students.containsKey(Id)){
			System.out.println("��ѧ��Ϊ��"+students.get(Id).name);
		}
		else{
			System.out.println("ѧ��������");
		}
		System.out.println("������ѧ��������");
		String Name = console.next();
		if(students.containsValue(new Student(null, Name))){
			Set<Entry<String, Student>> stuID = students.entrySet();
			for(Entry<String, Student> in: stuID){
				if(in.getValue().name.equals(Name)){
					System.out.println("ѧ��IDΪ��"+in.getKey());
				}
			}
		}
		else{
			System.out.println("ѧ��������");
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

package kai.mavenDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import kai.mavenDemo.vo.Student;

public class ListTest {

	@Test
	public void testOne(){
		List<String> list=new ArrayList<String>();
		list.add("3");
		list.add("8");
		list.add("5");
		list.add("12");
		list.sort(new Comparator<String>() {public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
		});
		System.out.println(list.toString());
		Iterator<String> iterator = list.iterator();
		iterator.hasNext();
		iterator.remove();
	}

	@Test
	public void testTwo(){
		List<String> list=new LinkedList<String>();
		list.add("3");
		list.add("8");
		list.add("5");
		list.add("12");
		System.out.println(list.toString());
	}
	@Test
	public void testThree(){
		Student student1=new Student();
		student1.setId(1);
		student1.setName("学生1");
		Student student2=new Student();
		student2.setId(2);
		student2.setName("学生2");
		Student student3=new Student();
		student3.setId(3);
		student3.setName("学生3");
		List<Student> list=new ArrayList<Student>();
		list.add(student3);
		list.add(student1);
		list.add(student2);
		for(Student stu:list){
			System.out.println(stu);
		}
		list.sort(new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getId()-o2.getId();
			}
		});
		System.out.println("修改后------------------------------");
		for(Student stu:list){
			System.out.println(stu);
		}
	}
}

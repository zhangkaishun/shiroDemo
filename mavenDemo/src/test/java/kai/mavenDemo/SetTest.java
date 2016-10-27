package kai.mavenDemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import kai.mavenDemo.vo.Student;

public class SetTest {

	@Test
	public void testOne(){
		Student student1=new Student();
		student1.setId(1);
		student1.setName("学生1");
		Student student2=new Student();
		student2.setId(2);
		student2.setName("学生2");
		Student student3=new Student();
		student3.setId(3);
		student3.setName("学生3");
		Set<Student> set=new HashSet<Student>();
		set.add(student3);
		set.add(student1);
		set.add(student2);
		for(Student stu:set){
			System.out.println(stu);
		}
		
		
	}
	@Test
	public void testTwo(){
		Student student1=new Student();
		student1.setId(1);
		student1.setName("学生1");
		Student student2=new Student();
		student2.setId(2);
		student2.setName("学生2");
		Student student3=new Student();
		student3.setId(3);
		student3.setName("学生3");
		Set<Student> set=new TreeSet<Student>();
		set.add(student3);
		set.add(student1);
		set.add(student2);
		for(Student stu:set){
			System.out.println(stu);
		}
		
		
	}
}

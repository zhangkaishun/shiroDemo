package kai.mavenDemo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import kai.mavenDemo.vo.Person;
import kai.mavenDemo.vo.Student;

public class 泛型<T extends Person> {
	@Test
	public void testOne(){
		Student student=new Student();
		/*List<? super Person> list=new ArrayList<>();
		list.add(student);*/
	}
	
	@Test
	public void testTwo(){
		Student student=new Student();
		Person person=new Person();
		/*List<? super Student> list=new ArrayList<Student>();
		
		List<Person> personList=new ArrayList<Person>();
		List<Student> peopleList=new ArrayList<Student>();
		
		List<?> listOne=personList;*/
		
	/*	List<? extends Number> list=new ArrayList<Number>();
        list.add(4.0);//编译错误
        //list.add(3);
		*/
	}
}

package kai.mavenDemo;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import kai.mavenDemo.vo.Student;

public class CollectionTest {

@Test
public void testOne(){
	Map<String,Object> map=new HashMap<String,Object>();
	Student student=new Student();
	student.setAddress("地址1");
	student.setId(1);
	student.setName("student1");
	map.put("student", student);
	student=null;
	Student student2 = (Student) map.get("student");
	System.out.println(student2);
	map.clear();
			
}

}

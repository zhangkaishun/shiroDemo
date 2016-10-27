package kai.mavenDemo;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayTest {

	@Test 
	public void testOne(){
		Integer[] array=new Integer[]{1,2,3,4};
		List<Integer> asList = Arrays.asList(array);
		for(Integer i:asList){
		System.out.println(i);
		}
		
	}
}

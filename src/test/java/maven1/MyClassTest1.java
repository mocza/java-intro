package maven1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyClassTest1 {

	@Test
	public void test1() {
		MyClass myClass = new MyClass();
		
		String output = myClass.getName();
		
		assertEquals("hi", output);		
	}
	
}

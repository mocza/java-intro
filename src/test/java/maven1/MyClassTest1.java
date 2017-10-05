package maven1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyClassTest1 {

	@Test
	public void test1() {
		// given
		MyClass myClass = new MyClass();
		
		// when
		String output = myClass.getName();
		
		// then
		assertEquals("hi", output);		
	}
	
}

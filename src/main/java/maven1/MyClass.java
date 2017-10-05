package maven1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClass {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MyClass.class);
	
	public String getName() {
		LOGGER.info("I'm in the middle of execution");
		return "Hello World";
	}

}

package org.selenium.test.objrepo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 **********reads all the xpaths required for the automation
 * @author sarthak-pc
 *
 */
public class ReadXpathData {

	
	public Properties getXpaths() throws IOException {
		
		FileReader file = new FileReader("src/test/resources/Xpaths.properties");
		
		Properties prop= new Properties();
		prop.load(file);
		
		return prop;
	}
	
	
	
}

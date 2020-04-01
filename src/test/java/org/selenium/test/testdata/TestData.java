package org.selenium.test.testdata;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author sarthak-pc
 *
 */
public class TestData {

	private String username;
	private String password;

	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public TestData() throws IOException {
		
		FileReader file = new FileReader("src/test/resources/TestData.properties");
		
		Properties prop = new Properties();
		
		prop.load(file);
		
		username = prop.getProperty("username");
		password=prop.getProperty("password");
		
	}

	


}

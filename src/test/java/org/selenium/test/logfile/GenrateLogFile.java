package org.selenium.test.logfile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * 
 * @author sarthak-pc
 *
 */
public class GenrateLogFile {

	public void generateLogFile() throws IOException {
		
		
		Date date = new Date();
		
		
		  FileWriter file=new FileWriter("src/test/resources/log.txt");    
          file.write( "The execution date and time : " + date);  
          
          System.out.println(date);
		
		
		
	}
	
	
}

package Utility;
import java.awt.*;
import java.util.*;
import java.io.*;

public class EX11D {
	
	public static void main(String [] args) {
		
		Properties props1 = new Properties();
		
		props1.put("prop1", "put one");
		props1.put("props2", "put two");
		props1.put("prop3", "put three");
		
		String prop1 = props1.getProperty("prop1","one");
		String prop2 = props1.getProperty("prop2", "two");
		String prop3 = props1.getProperty("prop3");
		
		try {
			props1.save(new FileOutputStream("test.ini"), "My header");
		}
		catch(IOException e) {
			return;
		}
		
		Properties props2 = new Properties();
		
		try {
			FileInputStream inStr = new FileInputStream("test.ini");
			props2.load(inStr);
		}
		catch(IOException e) {
			return;
		}
		
		String pop = props2.getProperty("prop2", "two");
	}

}

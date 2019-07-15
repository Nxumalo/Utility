package Utility;
import java.applet.*;
import java.awt.*;
import java.util.*;

public class EX11C extends Applet{
	
	TextArea results = new TextArea(10,75);
	
	public void init() {
		
		add(results);
		
		Hashtable ht = new Hashtable();
		
		ht.put("Pulse",new Integer(1995));
		ht.put("Dark Side of the Moon",new Integer(1973));
		ht.put("Wish you were Here", new Integer(1975));
		ht.put("Animals", new Integer(1977));
		ht.put("Ummagumma", new Integer(1969));
		
		results.appendText("Initially:"+ht.toString()+"\r\n");
		
		if(ht.contains(new Integer(1969)))
			results.appendText("An album from 1969 exists\r\n");
		
		if(ht.containsKey("Animals"))
			results.appendText("Animals was found\r\n");
		
		Integer year = (Integer)ht.get("Wish you were Here");
		results.appendText("Wish you were Here was released in "+ year.toString()+ "\r\n");
		
		results.appendText("Removing Ummagumma\r\n");
		ht.remove("Ummagumma");
		
		results.appendText("Remaining:\r\n");
		for(Enumeration enum = ht.keys(); enum.hasMoreElements();
				results.appendText((String) enum.nextElement()+"\r\n");
		resize(500,240);
	}
}

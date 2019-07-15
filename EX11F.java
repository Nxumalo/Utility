package Utility;
import java.applet.*;
import java.util.*;
import java.awt.*;

public class EX11F extends Applet {
	
	TextArea results = new TextArea(10,75);
	
	public void init() {
		resize(500,240);
		add(results);
		
		Vector v1 = new Vector(10,4);
		
		v1.addElement(new Integer(1));
		
		v1.addElement(new Integer(2));
		v1.addElement(new Integer(3));
		v1.addElement("Four");
		v1.addElement(new Integer(5));
		
		results.appendText(v1.toString()+"\r\n");
		
		if(v1.contains(new Integer(2)))
			results.appendText("It contains 2\r\n");
		
		if(v1.contains("Four"))
			results.appendText("It contains Four\r\n");
		
		int capacity = v1.capacity();
		
		results.appendText("Can hold"+
					String.valueOf(capacity) +"\r\n");
		
		results.appendText("ElementAt 3= "+
						(String)v1.elementAt(3)+"\r\n");
		
		v1.removeAllElements();
		
		v1.addElement("Piper At The Gates of Dawn");
		v1.addElement("Saucerfil of Secrets");
		v1.addElement("Ummagumma");
		v1.addElement("Meddle");
		v1.addElement("The Dar Side of the Moon");
		
		for(Enumeration enum = v1.elements();
				enum.hasMoreElement();)
			results.appendText((String)enum.nextElement()+"\r\n");
	}

}

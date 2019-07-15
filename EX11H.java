package Utility;
import java.applet.*;
import java.awt.*;
import java.util.*;

public class EX11H extends Applet{
	
	TextArea results = new TextArea(14,25);
	
	public void init() {
		resize(320,240);
		add(results);
		
		String mathExpr = "4*3+2/4";
		StringTokenizer str1 = new StringTokenizer(mathExpr,"*+/-",true);
		
		results.appendText("Tokends of mathExpr:\r\n");
		while(str1.hasMoreTokens())
			results.appendText(str1.nextToken()+"\r\n");
		
		String commas = "field1,field2,field3, and field 4";
		StringTokenizer st2 = new StringTokenizer(commas,",",false);
		
		results.appendText("Comma-delimited tokens:\r\n");
		while(st2.hasMoreTokens())
			results.appendText(st2.nextToken()+"\r\n");
	}

}

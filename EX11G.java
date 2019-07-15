package Utility;
import java.applet.*;
import java.awt.*;
import java.util.*;

public class EX11G extends Applet {
	
	TextArea results = new TextArea(10,30);
	
	public void init() {
		resize(320,240);
		add(results);
		
		Stack stk = new Stack();
		
		stk.push("1");
		stk.push("2");
		stk.push("3");
		
		results.appendText("Stack="+stk.toString()+"\r\n");
		
		String str = (String) stk.peek();
		results.appendText("Peek at: "+str +"\r\n");
		
		if(stk.search("2") != -1)
			results.appendText("Found 2\r\n");
		
		str = (String)stk.pop();
		
		results.appendText("Popped: "+str+"\r\n");
		
		results.appendText("Stack =" +stk.toString()+"\r\n");
	}

}

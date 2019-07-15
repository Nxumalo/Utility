package Utility;
import java.applet.*;
import java.awt.*;
import java.util.*;

public class EX11B extends Applet{
	
	TextArea results = new TextArea(10,50);
	
	public void init() {
		
		add(results);
		
		Date today = new Date();
		results.appendText("Today is:"+today.toString()+"\r\n");
		results.appendText("Local Time:"+today.toLocaleString()+"\r\n");
		results.appendText("GMT:"+today.toGMTString()+"\r\n");
		
		Date BastilledDay = new Date(96,6,14);
		
		BastilledDay.setYear(today.getYear());
		
		if(today.after(BastilledDay))
			results.appendText("You missed Bastilled Day!\r\n");
		else
			results.appendText("Bastille Day is coming!\r\n");
		resize(320,240);
	}

}

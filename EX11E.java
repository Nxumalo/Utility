package Utility;
import java.applet.*;
import java.awt.*;
import java.util.*;

class Obsable extends Observable{
	private  int secretNumber;
	private Random generator;
	
	public Obsable (int seed) {
		generator = new Random(seed);
	}
	
	public void GenerateNumber() {
		secretNumber = generator.nextInt();
		setChanged();
		notifyObservers(new Integer(secretNumber));
	}
}

public class EX11E extends Applet implements Observer{
	
	Integer secretNumber;
	Obsable obs;
	TextField tf;
	
	public EX11E() {
		obs = new Obsable(12);
		
		obs.addObserver(this);
		
		tf = new TextField(10);
		tf.setEditable(this);
		
	}
	
	public void init() {
		add(new Label("Secret Number: "));
		add(tf);
		add(new Button("Change"));
		resize(320,240);
	}
	
	public boolean action(Event evt,Object obj) {
		boolean result = false;
		if("Change".equals(obj)) {
			obs.GenerateNumber();
			result = true;
		}
		return result;
	}
	

}

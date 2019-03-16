package model4;

import java.util.ArrayList;

public class Subject {
	protected ArrayList observers = new ArrayList();
	public void attach(Observer obs) {
		observers.add(obs);
	}
	
	public void detach(Observer obs) {
		observers.add(obs);
	}
	
	public void notifys(double num) {
		
	}
}

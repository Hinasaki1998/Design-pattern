package model4;

public class Test {
	public static void main(String []args){
		Subject sub = new ConcreteSubject();
		Observer obs1 = new ConcreteObserver("����");
		Observer obs2 = new ConcreteObserver("����");
		Observer obs3 = new ConcreteObserver("����");
		sub.attach(obs1);
		sub.attach(obs2);
		sub.attach(obs3);
		sub.notifys(0.01);
		sub.notifys(0.05);
		sub.notifys(-0.05);
	}
}

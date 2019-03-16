package model4;

public class Test {
	public static void main(String []args){
		Subject sub = new ConcreteSubject();
		Observer obs1 = new ConcreteObserver("张三");
		Observer obs2 = new ConcreteObserver("李四");
		Observer obs3 = new ConcreteObserver("王二");
		sub.attach(obs1);
		sub.attach(obs2);
		sub.attach(obs3);
		sub.notifys(0.01);
		sub.notifys(0.05);
		sub.notifys(-0.05);
	}
}

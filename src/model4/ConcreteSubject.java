package model4;
public class ConcreteSubject extends Subject {
	public void notifys(double num) {
		if(num>=0.05){
			System.out.println("股票变化幅度为正。");
			for(Object obs:observers){
				((Observer)obs).Update(num);
			}
		}
		else if(num<=-0.05){
			System.out.println("股票变化幅度为负。");
			for(Object obs:observers){
				((Observer)obs).Update(num);
			}
		}
		else{
			System.out.println("股票变化幅度正常。");
		}
	}
}

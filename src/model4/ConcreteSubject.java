package model4;
public class ConcreteSubject extends Subject {
	public void notifys(double num) {
		if(num>=0.05){
			System.out.println("��Ʊ�仯����Ϊ����");
			for(Object obs:observers){
				((Observer)obs).Update(num);
			}
		}
		else if(num<=-0.05){
			System.out.println("��Ʊ�仯����Ϊ����");
			for(Object obs:observers){
				((Observer)obs).Update(num);
			}
		}
		else{
			System.out.println("��Ʊ�仯����������");
		}
	}
}

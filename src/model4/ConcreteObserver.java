package model4;
public class ConcreteObserver implements Observer {
	private String name;
	private double price;
	public ConcreteObserver(String name){
		this.name=name;
	}
	public void Update(double num) {
		if(num>=0.05){
			price=300;
			price = price+price*num;
			System.out.println("����֪ͨ�����Ա��"+name+"����Ʊ�۸�仯���ȴﵽ5%..Ŀǰ��Ʊ�۸�Ϊ��"+price);
		}
		else if(num<=-0.05){
			price=300;
			price = price-price*Math.abs(num);
			System.out.println("����֪ͨ�����Ա��"+name+"����Ʊ�۸�仯���ȴﵽ5%..Ŀǰ��Ʊ�۸�Ϊ��"+price);
		}
	}
}

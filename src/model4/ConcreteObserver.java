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
			System.out.println("发送通知股民成员："+name+"。股票价格变化幅度达到5%..目前股票价格为："+price);
		}
		else if(num<=-0.05){
			price=300;
			price = price-price*Math.abs(num);
			System.out.println("发送通知股民成员："+name+"。股票价格变化幅度达到5%..目前股票价格为："+price);
		}
	}
}

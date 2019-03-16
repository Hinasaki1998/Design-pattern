package First;

public class Fan {
	final int SLOW=1;
	final int MEDIUM=2;
	final int FAST=3;
	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	String color="blue";
	
	public static void main(String[] args){
		Fan fan1 = new Fan();
		fan1.setspeed(fan1.FAST);
		fan1.seton(true);
		fan1.setcolor("yellow");
		fan1.setradius(10);
		System.out.println(fan1.toString());
		Fan fan2 = new Fan();
		fan2.setspeed(fan2.MEDIUM);
		fan2.seton(false);
		fan2.setcolor("blue");
		fan2.setradius(5);
		System.out.println(fan2.toString());
	}
	
	public int getspeed(){
		return speed;		
	}
	
	public void setspeed(int newspeed){
		speed=newspeed;
	}
	
	public boolean geton(){
		return on;		
	}
	
	public void seton(boolean newon){
		on=newon;
	}
	
	public double getradius(){
		return radius;		
	}
	
	public void setradius(double newradius){
		radius=newradius;
	}
	
	public String getcolor(){
		return color;		
	}
	
	public void setcolor(String newcolor){
		color=newcolor;
	}
	
	Fan(){
	}
	
	public String toString(){
		return "速度:" + speed + "  颜色:" + color + "  半径:" + radius + "  开关状态:" + ((on)?"fan is on":"fan is off");		
	}
}

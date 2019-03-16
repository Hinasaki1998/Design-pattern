package Test;

public abstract class Component {
	protected Mediator mediator;
	public void change(){
		mediator.change(this);
	}
	public abstract void update();

}

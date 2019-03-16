package Test;

public class Mediator {
	private Button button;
	private List list;
	private ComboBox cb;
	private TextBox tb;
	private Label label;
	public void change(Component component){
		if(component==button){
			list.update();
			cb.update();
			tb.update();
			label.update();			
		}
		else if(component==list){
			cb.update();
			tb.update();
		}
		else if(component==cb){
			list.update();
			tb.update();			
		}
		else if(component==tb){
			list.update();
			cb.update();			
		}
	}

}

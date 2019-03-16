package Third;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class tq extends Applet implements ActionListener{
TextField name=new TextField(30);
TextField say=new TextField(30);
Label la1=new Label();
Label la2=new Label();
Button b1=new Button("ok");
    public void actionPerformed(ActionEvent e){
    	String str = name.getText();
    	if(e.getSource()==b1) say.setText(str.toLowerCase());
    }
    public void init(){
    	this.setLayout(new FlowLayout());
    	la1.setText(" name£º");
    	this.add(la1);
    	this.add(name);  	
    	
    	say.addActionListener(this);
    	la2.setText("say:");
    	this.add(la2);    	
    	this.add(say);
    	this.add(b1);
    	b1.addActionListener(this);
    
    
    }
}

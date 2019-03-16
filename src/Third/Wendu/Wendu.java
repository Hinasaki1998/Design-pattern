package Third.Wendu;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Wendu extends JFrame implements ActionListener{
	private JFrame f = new JFrame("温度转换器");
	private JTextField huashi = new JTextField(20);
	private JTextField sheshi = new JTextField(20);
	private JLabel jbhuashi = new JLabel("华氏温度");
	private JLabel jbsheshi = new JLabel("摄氏温度");
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JButton b1 = new JButton("huashi");
	private JButton b2 = new JButton("sheshi");
	public static void main(String[] args) {
		new Wendu();
	}
	public Wendu(){
		p1.add(jbhuashi);
		p1.add(huashi);
		p1.add(jbsheshi);
		p1.add(sheshi);
		p1.setLayout(new GridLayout(2,2));
		p2.add(b1);
		p2.add(b2);
		p2.setLayout(new GridLayout(1,2));
		f.add(p1,BorderLayout.CENTER);
		f.add(p2, BorderLayout.SOUTH);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.setVisible(true);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String label1 = e.getActionCommand();
		if(label1.equals("huashi")){
			tranhuashi();
		}
			else if(label1.equals("sheshi")){
				transheshi();
			}
		
	}
	private void transheshi() {
		// TODO Auto-generated method stub
		String text = sheshi.getText();
		int text1 = Integer.parseInt(text)+273;
		huashi.setText(String.format("%.2f", text1));
	}
	private void tranhuashi() {
		// TODO Auto-generated method stub
		
	}

}

package Third;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.CharacterIterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class stu extends JFrame implements ActionListener{
	private JTextField jtf1 = new JTextField();
	private JTextField jtf2 = new JTextField();
	
	private JButton jbt1 = new JButton("change");
	
	stu(){
		JPanel p1 = new JPanel(new GridLayout(2,2));
		p1.add(new JLabel("old"));
		p1.add(jtf1);
		p1.add(new JLabel("new"));
		p1.add(jtf2);
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(jbt1);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		jbt1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		String str = jtf1.getText();
    	jtf2.setText(str.toLowerCase());
	}
	public static void main(String[] args) {
		stu frame = new stu();
		frame.pack();
		frame.setTitle("LoanCalculator");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

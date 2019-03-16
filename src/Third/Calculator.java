package Third;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	private JFrame f = new JFrame("���׼�����");
	// �������
	private JPanel inputPanel = new JPanel();
	// ce
	private JPanel operationPanel = new JPanel();
	// �������
	private JPanel buttonsPanel = new JPanel();
	// ���������ı���
	private JTextField input = new JTextField(40);
	private JButton zero = new JButton("0");
	private JButton one = new JButton("1");
	private JButton two = new JButton("2");
	private JButton three = new JButton("3");
	private JButton four = new JButton("4");
	private JButton five = new JButton("5");
	private JButton six = new JButton("6");
	private JButton seven = new JButton("7");
	private JButton eight = new JButton("8");
	private JButton nine = new JButton("9");
	private JButton backspace = new JButton("BackSpace");
	private JButton CE = new JButton("CE");
	private JButton C = new JButton("C");
	private JButton add = new JButton("+");
	private JButton sub = new JButton("-");
	private JButton mul = new JButton("*");
	private JButton div = new JButton("/");
	private JButton decimal = new JButton(".");
	private JButton equal = new JButton("=");
	private JButton sqrt = new JButton("sqrt");
	private JButton rec = new JButton("1/x");
	private JButton pm = new JButton("+/-");
	private JButton mod = new JButton("%");
	private String num1 = "";// �����һ����������
	private String operator = "";// �����������
	private double result = 0.0; // ������м�����
	private boolean operateValidFlag = true;// �����Ƿ�Ϸ�
	// ��־�û������Ƿ����������ʽ�ĵ�һ������,�������������ĵ�һ������
	private boolean firstDigit = true;

	public static void main(String[] args) {
		new Calculator();
	}

	public Calculator() {
		// ������������
		inputPanel.add(input);
		f.add(inputPanel, BorderLayout.NORTH);

		operationPanel.add(CE);
		operationPanel.add(C);
		operationPanel.add(backspace);
		operationPanel.setLayout(new GridLayout(1, 3, 10, 20));
		operationPanel.setPreferredSize(new Dimension(0, 200));
		f.add(operationPanel, BorderLayout.CENTER);

		buttonsPanel.add(sqrt);
		buttonsPanel.add(rec);
		buttonsPanel.add(pm);
		buttonsPanel.add(mod);

		buttonsPanel.add(seven);
		buttonsPanel.add(eight);
		buttonsPanel.add(nine);
		buttonsPanel.add(add);

		buttonsPanel.add(four);
		buttonsPanel.add(five);
		buttonsPanel.add(six);
		buttonsPanel.add(sub);

		buttonsPanel.add(one);
		buttonsPanel.add(two);
		buttonsPanel.add(three);
		buttonsPanel.add(div);

		buttonsPanel.add(zero);
		buttonsPanel.add(decimal);
		buttonsPanel.add(equal);
		buttonsPanel.add(mul);

		buttonsPanel.setLayout(new GridLayout(5, 4, 5, 5));
		buttonsPanel.setPreferredSize(new Dimension(0, 200));
		f.add(buttonsPanel, BorderLayout.SOUTH);

		// ע�������������¼�
		backspace.addActionListener(this);
		CE.addActionListener(this);
		C.addActionListener(this);
		decimal.addActionListener(this);
		equal.addActionListener(this);
		// ע���������
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		sqrt.addActionListener(this);
		rec.addActionListener(this);
		pm.addActionListener(this);
		mod.addActionListener(this);
		// ע�����ּ����¼�
		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		f.setVisible(true);
		f.pack();
		f.setSize(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		// ��ȡ�¼�Դ�ı�ǩ
		String label = e.getActionCommand();
		if (label.equals("BackSpace")) {
			// �û�����"Backspace"��
			handleBackspace();
		} else if (label.equals("CE")) {
			// �û�����"CE"��
			input.setText("0");
		} else if (label.equals("C")) {
			// �û�����"C"��
			handleC();
		} else if ("0123456789.".indexOf(label) >= 0) {
			// �û��������ּ�����С�����
			handleNumber(label);
		} else {
			// �û������������
			handleOperator(label);
		}
	}

	/**
	 * ����Backspace�������µ��¼�
	 */
	private void handleBackspace() {
		String text = input.getText();
		int i = text.length();
		if (i > 0) {
			// �˸񣬽��ı����һ���ַ�ȥ��
			text = text.substring(0, i - 1);
			if (text.length() == 0) {
				// ����ı�û�������ݣ����ʼ���������ĸ���ֵ
				input.setText("0");
				firstDigit = true;
				operator = "=";
			} else {
				// ��ʾ�µ��ı�
				input.setText(text);
			}
		}
	}

	/**
	 * �������ּ������µ��¼�
	 *
	 */
	private void handleNumber(String key) {
		if (firstDigit) {
			// ����ĵ�һ������
			input.setText(key);
		} else if ((key.equals(".")) && (input.getText().indexOf(".") < 0)) {
			// �������С���㣬����֮ǰû��С���㣬��С���㸽�ڽ���ı���ĺ���
			input.setText(input.getText() + ".");
		} else if (!key.equals(".")) {
			// �������Ĳ���С���㣬�����ָ��ڽ���ı���ĺ���
			input.setText(input.getText() + key);
		}
		// �Ժ�����Ŀ϶����ǵ�һ��������
		firstDigit = false;
	}

	/**
	 * ����C�������µ��¼�
	 */
	private void handleC() {
		// ��ʼ���������ĸ���ֵ
		input.setText("0");
		firstDigit = true;
		operator = "=";
	}

	/**
	 * ����������������µ��¼�
	 *
	 */
	private void handleOperator(String key) {
		if (operator.equals("/")) {
			// ��������
			// �����ǰ����ı����е�ֵ����0
			if (getNumberFromText() == 0.0) {
				// �������Ϸ�
				operateValidFlag = false;
				input.setText("��������Ϊ��");
			} else {
				result /= getNumberFromText();
			}
		} else if (operator.equals("1/x")) {
			// ��������
			if (result == 0.0) {
				// �������Ϸ�
				operateValidFlag = false;
				input.setText("��û�е���");
			} else {
				result = 1 / result;
			}
		} else if (operator.equals("+")) {
			// �ӷ�����
			result += getNumberFromText();
		} else if (operator.equals("-")) {
			// ��������
			result -= getNumberFromText();
		} else if (operator.equals("*")) {
			// �˷�����
			result *= getNumberFromText();
		} else if (operator.equals("sqrt")) {
			// ƽ��������
			result = Math.sqrt(result);
		} else if (operator.equals("%")) {
			// �ٷֺ����㣬����100
			result = result / 100;
		} else if (operator.equals("+/-")) {
			// ������������
			result = result * (-1);
		} else if (operator.equals("=")) {
			// ��ֵ����
			result = getNumberFromText();
		}
		if (operateValidFlag) {
			// ˫���ȸ�����������
			long t1;
			double t2;
			t1 = (long) result;
			t2 = result - t1;
			if (t2 == 0) {
				input.setText(String.valueOf(t1));
			} else {
				input.setText(String.valueOf(result));
			}
		}
		// ����������û����İ�ť
		operator = key;
		firstDigit = true;
		operateValidFlag = true;
	}

	private double getNumberFromText() {
		double result = 0;
		try {
			result = Double.valueOf(input.getText()).doubleValue();
		} catch (NumberFormatException e) {
		}
		return result;
	}
}

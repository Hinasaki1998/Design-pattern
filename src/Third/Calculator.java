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
	private JFrame f = new JFrame("简易计算器");
	// 输入面扳
	private JPanel inputPanel = new JPanel();
	// ce
	private JPanel operationPanel = new JPanel();
	// 数字面板
	private JPanel buttonsPanel = new JPanel();
	// 输入数据文本框
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
	private String num1 = "";// 保存第一个运算数字
	private String operator = "";// 保存运算符号
	private double result = 0.0; // 计算的中间结果。
	private boolean operateValidFlag = true;// 操作是否合法
	// 标志用户按的是否是整个表达式的第一个数字,或者是运算符后的第一个数字
	private boolean firstDigit = true;

	public static void main(String[] args) {
		new Calculator();
	}

	public Calculator() {
		// 添加组件，布局
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

		// 注册各个组件监听事件
		backspace.addActionListener(this);
		CE.addActionListener(this);
		C.addActionListener(this);
		decimal.addActionListener(this);
		equal.addActionListener(this);
		// 注册运算监听
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		sqrt.addActionListener(this);
		rec.addActionListener(this);
		pm.addActionListener(this);
		mod.addActionListener(this);
		// 注册数字监听事件
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
		// 获取事件源的标签
		String label = e.getActionCommand();
		if (label.equals("BackSpace")) {
			// 用户按了"Backspace"键
			handleBackspace();
		} else if (label.equals("CE")) {
			// 用户按了"CE"键
			input.setText("0");
		} else if (label.equals("C")) {
			// 用户按了"C"键
			handleC();
		} else if ("0123456789.".indexOf(label) >= 0) {
			// 用户按了数字键或者小数点键
			handleNumber(label);
		} else {
			// 用户按了运算符键
			handleOperator(label);
		}
	}

	/**
	 * 处理Backspace键被按下的事件
	 */
	private void handleBackspace() {
		String text = input.getText();
		int i = text.length();
		if (i > 0) {
			// 退格，将文本最后一个字符去掉
			text = text.substring(0, i - 1);
			if (text.length() == 0) {
				// 如果文本没有了内容，则初始化计算器的各种值
				input.setText("0");
				firstDigit = true;
				operator = "=";
			} else {
				// 显示新的文本
				input.setText(text);
			}
		}
	}

	/**
	 * 处理数字键被按下的事件
	 *
	 */
	private void handleNumber(String key) {
		if (firstDigit) {
			// 输入的第一个数字
			input.setText(key);
		} else if ((key.equals(".")) && (input.getText().indexOf(".") < 0)) {
			// 输入的是小数点，并且之前没有小数点，则将小数点附在结果文本框的后面
			input.setText(input.getText() + ".");
		} else if (!key.equals(".")) {
			// 如果输入的不是小数点，则将数字附在结果文本框的后面
			input.setText(input.getText() + key);
		}
		// 以后输入的肯定不是第一个数字了
		firstDigit = false;
	}

	/**
	 * 处理C键被按下的事件
	 */
	private void handleC() {
		// 初始化计算器的各种值
		input.setText("0");
		firstDigit = true;
		operator = "=";
	}

	/**
	 * 处理运算符键被按下的事件
	 *
	 */
	private void handleOperator(String key) {
		if (operator.equals("/")) {
			// 除法运算
			// 如果当前结果文本框中的值等于0
			if (getNumberFromText() == 0.0) {
				// 操作不合法
				operateValidFlag = false;
				input.setText("除数不能为零");
			} else {
				result /= getNumberFromText();
			}
		} else if (operator.equals("1/x")) {
			// 倒数运算
			if (result == 0.0) {
				// 操作不合法
				operateValidFlag = false;
				input.setText("零没有倒数");
			} else {
				result = 1 / result;
			}
		} else if (operator.equals("+")) {
			// 加法运算
			result += getNumberFromText();
		} else if (operator.equals("-")) {
			// 减法运算
			result -= getNumberFromText();
		} else if (operator.equals("*")) {
			// 乘法运算
			result *= getNumberFromText();
		} else if (operator.equals("sqrt")) {
			// 平方根运算
			result = Math.sqrt(result);
		} else if (operator.equals("%")) {
			// 百分号运算，除以100
			result = result / 100;
		} else if (operator.equals("+/-")) {
			// 正数负数运算
			result = result * (-1);
		} else if (operator.equals("=")) {
			// 赋值运算
			result = getNumberFromText();
		}
		if (operateValidFlag) {
			// 双精度浮点数的运算
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
		// 运算符等于用户按的按钮
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

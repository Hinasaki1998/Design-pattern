package First;

import java.util.Scanner;
//��дһ��Java������if-else����ж�ĳ����Ƿ�Ϊ���ꡣ(��֧)
public class Year {
	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner(System.in);
		year=input.nextInt();
		if((year%4==0&&year%100!=0)||year%100==0&&year%400==0)
			System.out.println(year+"��������");
		else
			System.out.println(year+"�겻������");
	}
}

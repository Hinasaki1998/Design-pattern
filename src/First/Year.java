package First;

import java.util.Scanner;
//编写一个Java程序，用if-else语句判断某年份是否为闰年。(分支)
public class Year {
	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner(System.in);
		year=input.nextInt();
		if((year%4==0&&year%100!=0)||year%100==0&&year%400==0)
			System.out.println(year+"年是闰年");
		else
			System.out.println(year+"年不是闰年");
	}
}

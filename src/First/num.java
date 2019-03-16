package First;

import java.util.Scanner;

public class num {
	public static void main(String[] args) {
		double grade;
		char stu;
		Scanner input = new Scanner(System.in);
		grade=input.nextDouble();
		stu=(grade>=9090)?'A':((grade<60)?'C':'B');
		System.out.println(stu);
		}
}

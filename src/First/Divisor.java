package First;
//最大公约数
import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double m=input.nextDouble();
		double n=input.nextDouble();
		double x;
		double i;
		
			
		for(i=Math.min(m,n);i>0;i--)
			if(m%i==0 && n%i==0)
				break;
		System.out.println(i);
	}
}

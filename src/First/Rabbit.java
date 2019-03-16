package First;
import java.util.Scanner;
public class Rabbit {
	public static void main(String[] args){
		int tuzi_num1=1;
		int tuzi_num2=1;
		int tuzi_num3;
		int x;
		Scanner input =new Scanner(System.in);
		System.out.print("输入月数：" );
		x=input.nextInt();
		for(int i=1;i<=x;i++){
			if(i==1){
				System.out.print("第"+i+"个月的兔子数目: ");
				System.out.println(tuzi_num1);
				}
			else if(i==2){
				System.out.print("第"+i+"个月的兔子数目: ");
				System.out.println(tuzi_num2);
				}
			else{
				tuzi_num3=tuzi_num2;
				tuzi_num2=tuzi_num1+tuzi_num2;
				tuzi_num1=tuzi_num3;
				System.out.print("第"+i+"个月的兔子数目: ");
				System.out.println(tuzi_num2);
			}	
		}
	}
}

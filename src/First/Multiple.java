package First;
//��С������
import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=a*b;
		if(a<b){
			int r=0;
			r=a;a=b;b=r;
		}
		while(true){
			int r=a%b;
			if(r==0){
				System.out.println("��С��������"+c/b);
				break;
			}else{
				a=b;
				b=r;
			}
		}
	}
}

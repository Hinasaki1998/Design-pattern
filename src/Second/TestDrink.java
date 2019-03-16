package Second;
import java.util.Scanner;
public class TestDrink {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("输入参数：");
		int drinkType=input.nextInt();
		Drink drink = Drink.getDrink(drinkType);
		if(drinkType>3){
			System.out.println("对不起！没有你要的饮料类型。");
		}
		else {
			drink.taste();
		}
	}
}
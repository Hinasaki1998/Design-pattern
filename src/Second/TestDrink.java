package Second;
import java.util.Scanner;
public class TestDrink {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������");
		int drinkType=input.nextInt();
		Drink drink = Drink.getDrink(drinkType);
		if(drinkType>3){
			System.out.println("�Բ���û����Ҫ���������͡�");
		}
		else {
			drink.taste();
		}
	}
}
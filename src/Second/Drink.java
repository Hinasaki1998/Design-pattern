package Second;
public abstract class Drink {
	public abstract void taste();
	int drinkType;
	int Coffee=1;
	int Beer=2;
	int Milk=3;
	Drink(){
	}
	static Drink getDrink(int drinkType){
		switch(drinkType){
		case 1:
			return new Coffee();
		case 2:
			return new Beer();
		case 3:
			return new Milk();
		}
		return null;
	}
}


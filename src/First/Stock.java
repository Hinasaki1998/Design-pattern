package First;
public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	public Stock(){
	}
	
	Stock(String newsymbol,String newname,double newpreviousClosingPrice,double newcurrentPrice){
		this.symbol=newsymbol;
		this.name=newname;
		this.previousClosingPrice=newpreviousClosingPrice;
		this.currentPrice=newcurrentPrice;
	}
	
	double getChangePercent(){
		return currentPrice/previousClosingPrice;		
		}
	
	public static void main(String[] args){
		Stock stock1=new Stock();
		stock1.previousClosingPrice=4.5;
		stock1.currentPrice=4.35;
		stock1.name="Sun_Microsystems_Inc";
		stock1.symbol="java";
		System.out.println("��Ʊ���룺" + stock1.symbol);
		System.out.println("��Ʊ���֣�" + stock1.name);
		System.out.println("ǰһ�չ�Ʊֵ��" + stock1.previousClosingPrice);
		System.out.println("��ǰ��Ʊֵ��" + stock1.currentPrice);
		System.out.println("��ֵ�仯�ٷֱȣ�" + stock1.getChangePercent()+"%");
	}
}

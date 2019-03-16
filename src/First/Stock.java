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
		System.out.println("股票代码：" + stock1.symbol);
		System.out.println("股票名字：" + stock1.name);
		System.out.println("前一日股票值：" + stock1.previousClosingPrice);
		System.out.println("当前股票值：" + stock1.currentPrice);
		System.out.println("市值变化百分比：" + stock1.getChangePercent()+"%");
	}
}

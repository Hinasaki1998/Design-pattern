package First;
import java.util.Date;
public class Account {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private java.util.Date dateCreated= new java.util.Date();
	public static void main(String[] args){
		Account account1 =new Account();
		account1.setid(1122);
		account1.setbalance(20000);
		account1.annualInterestRate(0.045);
		System.out.println("�˻�ID��" + account1.getid());
		System.out.println("�˻���" + account1.getnewbalance() + "��Ԫ");
		System.out.println("����Ϣ��" + account1.getMonthlyInterestRate()*account1.getnewbalance());
		System.out.println("�������ڣ�" + account1.dateCreated.toString());
	}
	
	Account(){
	}
	
	Account(int newid,double newbalance){
		this.balance=newbalance;
		this.id=newid;
	}
	
	public int getid(){
		return id;		
	}
	
	public void setid(int newid){
		id=newid;
	}
	
	public double getbalance(){
		return balance;		
	}
	
	public void setbalance(double newbalance){
		balance=newbalance;
	}
	
	public double getannualInterestRate(){
		return annualInterestRate;		
	}
	
	public void annualInterestRate(double newannualInterestRate){
		annualInterestRate=newannualInterestRate;
	}
	
	public Date dateCreated(Date newdateCreated){
		return newdateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	public double getwithDraw(){
		return 2500;
	}
	
	public double getdeposit(){
		return 3000;
	}
	
	public double getnewbalance(){
		return balance-getwithDraw()+getdeposit();
	}
}

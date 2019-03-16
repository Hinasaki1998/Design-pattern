package First;
//ËØÊý
public class PrimeNUmber {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMS=50;
		final int NUMBER_OF_PRIMS_PER_LINE=10;
		int count=0;
		int number=2;
		System.out.println("The first 50 prime number are\n");
		while(count< NUMBER_OF_PRIMS) {
			boolean isPrime=true;
			for(int divisor=2;divisor<=number/2;divisor++) {
				if(number%divisor==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				count++;
				if(count%NUMBER_OF_PRIMS_PER_LINE==0) {
					System.out.println(number);					
				}
				else
					System.out.print(number+" ");
			}
			number++;
		}
	}
}

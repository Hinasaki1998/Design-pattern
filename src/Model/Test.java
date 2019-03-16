package Model;
public class Test {
    public static void main(String args[]) {
    	AirCondition_Factory AIRfactory1=new HaierAirCondition_Factory();
    	AirCondition air1=AIRfactory1.prduceAirCondition();    
    	air1.play();
    	
    	AirCondition_Factory AIRfactory2=new MideaAirCondition_Factory();
    	AirCondition air2=AIRfactory2.prduceAirCondition();
    	air2.play();
    }
}
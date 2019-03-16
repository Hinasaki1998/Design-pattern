package Model;
public class HaierAirCondition_Factory implements AirCondition_Factory {
    public HaierAirCondition_Factory() {
    	
    }
    public HaierAirCondition prduceAirCondition() {
    	System.out.println("º£¶û¿Õµ÷ produced£¡");
        return new HaierAirCondition(); 
    }

}
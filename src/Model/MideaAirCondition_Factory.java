package Model;
public class MideaAirCondition_Factory implements AirCondition_Factory {
    public MideaAirCondition_Factory() {
    }
    public MideaAirCondition prduceAirCondition() {
    	System.out.println("���Ŀյ� produced��");
        return new MideaAirCondition(); 
    }
}
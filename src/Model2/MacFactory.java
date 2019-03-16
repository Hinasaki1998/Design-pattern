package Model2;
public class MacFactory implements ComputerFactory {
    public MacFactory() {
    }
    public CPU produceCPU() {
    	System.out.println("生产MacCPU");
        return new MacCPU();
    }
    public RAM produceRAM() {
    	System.out.println("生产MacRAM");
        return new MacRAM();
    }

}
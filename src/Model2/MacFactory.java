package Model2;
public class MacFactory implements ComputerFactory {
    public MacFactory() {
    }
    public CPU produceCPU() {
    	System.out.println("����MacCPU");
        return new MacCPU();
    }
    public RAM produceRAM() {
    	System.out.println("����MacRAM");
        return new MacRAM();
    }

}
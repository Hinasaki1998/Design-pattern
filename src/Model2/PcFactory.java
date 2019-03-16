package Model2;
public class PcFactory implements ComputerFactory {
    public PcFactory() {
    }
    public CPU produceCPU() {
    	System.out.println("����PcCPU");
        return new PcCPU();
    }
    public RAM produceRAM() {
    	System.out.println("����PcRAM");
        return new PcRAM();
    }
}
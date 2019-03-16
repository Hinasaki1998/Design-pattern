package Model2;
public class PcFactory implements ComputerFactory {
    public PcFactory() {
    }
    public CPU produceCPU() {
    	System.out.println("生产PcCPU");
        return new PcCPU();
    }
    public RAM produceRAM() {
    	System.out.println("生产PcRAM");
        return new PcRAM();
    }
}
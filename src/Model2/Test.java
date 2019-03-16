package Model2;
public class Test {
	 public static void main(String args[]) {
		 ComputerFactory pcFactory = new PcFactory();
		 CPU pc_cpu = pcFactory.produceCPU();
		 RAM pc_ram = pcFactory.produceRAM();
		 pc_cpu.work();
		 pc_ram.work();
		 ComputerFactory MacFactory =new MacFactory();
		 CPU mac_cpu = MacFactory.produceCPU();
		 RAM mac_ram = MacFactory.produceRAM();
		 mac_cpu.work();
		 mac_ram.work();
	    }
}

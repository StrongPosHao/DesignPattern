package expr5;

public class ConfigAComputer extends Computer {
	
	public ConfigAComputer() {
		cpu = new CPU("i7-6900K HQ", 5000);
		graphicCard = new GraphicCard("GTX 1080", 8000);
		memory = new Memory("16GB", 1000);
		hardDisk = new HardDisk("2TB", 1500);
	}
	
	public ConfigAComputer configStoreB() {
		ConfigAComputer computer = new ConfigAComputer();
		computer.cpu.setPrice(6000);
		computer.graphicCard.setPrice(8300);
		computer.memory.setPrice(1100);
		computer.hardDisk.setPrice(1300);
		return computer;
	}
}

package expr5;

public class ConfigBComputer extends Computer {
	
	public ConfigBComputer() {
		cpu = new CPU("i5-6300 HQ", 1000);
		graphicCard = new GraphicCard("GTX 950M", 1500);
		memory = new Memory("8GB", 800);
		hardDisk = new HardDisk("1TB", 500);
	}
	
	public ConfigBComputer configStoreB() {
		ConfigBComputer computer = new ConfigBComputer();
		computer.cpu.setPrice(900);
		computer.graphicCard.setPrice(1400);
		computer.memory.setPrice(700);
		computer.hardDisk.setPrice(400);
		return computer;
	}
}

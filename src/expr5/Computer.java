package expr5;

public abstract class Computer {
	
	protected CPU cpu;
	protected GraphicCard graphicCard;
	protected HardDisk hardDisk;
	protected Memory memory;
	protected int price;
	
	String equipCPU() {
		price += cpu.getPrice();
		return "装配CPU: " + cpu.getName();
	}
	
	String equipGraphicCard() {
		price += graphicCard.getPrice();
		return "装配显卡：" + graphicCard.getName();
	}
	
	String equipHardDisk() {
		price += hardDisk.getPrice();
		return "装配硬盘：" + hardDisk.getName();
	}
	
	String equipMemory() {
		price += memory.getPrice();
		return "装配内存：" + memory.getName();
	}

	
}

package expr5;

public abstract class Computer {
	
	protected CPU cpu;
	protected GraphicCard graphicCard;
	protected HardDisk hardDisk;
	protected Memory memory;
	protected int price;
	
	String equipCPU() {
		price += cpu.getPrice();
		return "װ��CPU: " + cpu.getName();
	}
	
	String equipGraphicCard() {
		price += graphicCard.getPrice();
		return "װ���Կ���" + graphicCard.getName();
	}
	
	String equipHardDisk() {
		price += hardDisk.getPrice();
		return "װ��Ӳ�̣�" + hardDisk.getName();
	}
	
	String equipMemory() {
		price += memory.getPrice();
		return "װ���ڴ棺" + memory.getName();
	}

	
}

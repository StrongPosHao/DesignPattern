package expr5;

public abstract class ComputerStore {
	
	public Computer configComputer(String type) {
		Computer computer;
		
		computer = createComputer(type);
		
		computer.equipCPU();
		computer.equipGraphicCard();
		computer.equipHardDisk();
		computer.equipMemory();
		
		return computer;
	}
	
	protected abstract Computer createComputer(String type);
	
}

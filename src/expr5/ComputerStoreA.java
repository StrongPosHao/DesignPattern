package expr5;

public class ComputerStoreA extends ComputerStore {
	
	protected Computer createComputer(String type) {
		if (type.equals("configurationA")) {
			return new ConfigAComputer();
		}
		else if (type.equals("configurationB")) {
			return new ConfigBComputer();
		}
		else {
			return null;
		}
	}
}

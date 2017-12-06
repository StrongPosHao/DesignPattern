package expr5;

public class ComputerStoreB extends ComputerStore {
	
	protected Computer createComputer(String type) {
		if (type.equals("configurationA")) {
			return new ConfigAComputer().configStoreB();
		}
		else if (type.equals("configurationB")) {
			return new ConfigBComputer().configStoreB();
		}
		else {
			return null;
		}
	}
}

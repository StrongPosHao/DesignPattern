package exer6;

public class ModuleControl {
	private static ModuleControl uniqueInstance = new ModuleControl();
	
	private ModuleControl() {}
	
	public static ModuleControl getInstance() {
		return uniqueInstance;
	}
	
	public String hellowMessage(RuntimeEnv re) {
		return "Hello, " + re.getUsername() + "!\nThis a simple application framework and more functions is building.";
	}
}

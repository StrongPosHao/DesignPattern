package expr4;

public abstract class RiceNoodle {
	String description = "Unknown RiceNoodle";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}

package expr4;

public class WaterNoodle extends RiceNoodle {

	public WaterNoodle() {
		description = "Ë®Ã×Ïß";
	}
	
	public String getDescription() {
		return description;
	}
	
	
	@Override
	public double cost() {
		return 2.2;
	}
	
}

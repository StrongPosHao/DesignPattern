package expr4;

public class WaterNoodle extends RiceNoodle {

	public WaterNoodle() {
		description = "ˮ����";
	}
	
	public String getDescription() {
		return description;
	}
	
	
	@Override
	public double cost() {
		return 2.2;
	}
	
}

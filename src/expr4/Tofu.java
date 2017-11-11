package expr4;

public class Tofu extends  CondimentDecorator {
	
	RiceNoodle rice_noodle;
	
	public Tofu(RiceNoodle rice_noodle) {
		this.rice_noodle = rice_noodle;
	}

	@Override
	public String getDescription() {
		return rice_noodle.getDescription() + ", ¶¹¸¯";
	}

	@Override
	public double cost() {
		return 0.5 + rice_noodle.cost();
	}
	
}

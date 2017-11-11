package expr4;

public class Egg extends CondimentDecorator {

	RiceNoodle rice_noodle;
	
	public Egg(RiceNoodle rice_noodle) {
		this.rice_noodle = rice_noodle;
	}
	
	@Override
	public String getDescription() {
		return rice_noodle.getDescription() + ", ¼¦µ°";
	}

	@Override
	public double cost() {
		return 1.00 + rice_noodle.cost();
	}

}

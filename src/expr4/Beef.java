package expr4;

public class Beef extends CondimentDecorator {

	RiceNoodle rice_noodle;
	
	public Beef(RiceNoodle rice_noodle) {
		this.rice_noodle = rice_noodle;
	}
	
	@Override
	public String getDescription() {
		return rice_noodle.getDescription() + ", ЕЈИв";
	}

	@Override
	public double cost() {
		return 2.00 + rice_noodle.cost();
	}

}

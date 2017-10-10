package expr1;

public class Tank extends Vehicle{

	
	@Override
	public boolean drive(double speed) {
	
		return (speed >= 50 && speed <=100)? true : false;
	}
	
	public String getType() {
		return "tank";
	}
	
}

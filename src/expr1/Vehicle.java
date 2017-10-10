package expr1;

public abstract class Vehicle implements Driveable{
	
	private double speed;
	private String name;
	
	public double getSpeed() {
		return this.speed;
	}
	
	public String getType() {
		return name;
	}
	

}

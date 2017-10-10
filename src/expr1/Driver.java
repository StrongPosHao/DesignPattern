package expr1;

public class Driver {
	
	private boolean drive_license;
	
	public Driver(boolean drive_license) {
		this.drive_license = drive_license;
	}
	
	public boolean driverable() {
		return this.drive_license;
	}

}

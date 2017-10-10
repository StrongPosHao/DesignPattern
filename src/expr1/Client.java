package expr1;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Car(110));
		vehicles.add(new Car(130));
		vehicles.add(new Car(150));
		vehicles.add(new Car(170));
		vehicles.add(new Car(190));
		vehicles.add(new Ship(310));
		vehicles.add(new Ship(330));
		vehicles.add(new Ship(350));
		vehicles.add(new Ship(370));
		vehicles.add(new Ship(390));
		vehicles.add(new Plane(650));
		vehicles.add(new Plane(650));
		vehicles.add(new Plane(750));
		vehicles.add(new Plane(850));
		vehicles.add(new Plane(950));
		System.out.println("Vehicle rent system");
		Scanner in = new Scanner(System.in);
		String cmd;
		System.out.println("1. If you want to rent a vehicle, please input 1 ");
		System.out.println("2. If you want to add a new vehicle type, please input 2 ");
		System.out.println("3. If you want to quit this program, please input q");
		while(true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.print("Your input:");
			cmd = in.next();
			if (cmd.equals("1")) {
				double speed;
				System.out.print("Please input the speed£º");
				speed = in.nextDouble();
				Driver driver = new Driver(true);
				rent(speed, driver, vehicles);
				continue;
			}
			else if (cmd.equals("2")) {
				Driver d = new Driver(true);
				addNewVehicle(new Tank(), d, vehicles);
				continue;
			}
			else if (cmd.equals("q")) {
				System.exit(0);
			}
			else {
				System.out.println("Wrong input!");
				continue;
			}
		}
	}
	
	public static Tank addNewVehicle(Vehicle v, Driver d, ArrayList<Vehicle> vehicles) {
		String str;
		if (d.driverable()) {
			vehicles.add(v);
			System.out.println("Tank successfully added!");
			System.out.println("Do you want to rent a tank? [Y/N]");
			Scanner in = new Scanner(System.in);
			while (true) {
				str = in.nextLine();
				if (str.equals("Y") || str.equals("y")) {
					System.out.println("Rent a tank!");
					return new Tank();
				}
				else if (str.equals("N") || str.equals("n"))
					return null;
				else {
					System.out.println("Wrong input!");
				}
			}
		}
		return null;
	}
	
	public static Vehicle rent(double speed, Driver d, ArrayList<Vehicle> vehicles) {
		Car car = new Car();
		Plane plane = new Plane();
		Ship ship = new Ship();
		if (isDrivable(car, speed, d))
			return giveVehicle(new Car(), speed, d, vehicles);
		else if (isDrivable(plane, speed, d)) 
			return giveVehicle(new Plane(), speed, d, vehicles);
		else if (isDrivable(ship, speed, d))
			return giveVehicle(new Ship(), speed, d, vehicles);
		else 
			System.out.println("No vehicle satisfy your speed need!");
		return null;
	}
	
	public static boolean isDrivable(Vehicle v, double speed, Driver d) {
		return (v.drive(speed) && d.driverable());
	}
	
	public static Vehicle giveVehicle(Vehicle v, double speed, Driver d, ArrayList<Vehicle> vehicles) {
		
		if (v.drive(speed) && d.driverable()) {
			for (int i = 0; i < vehicles.size(); i++) {
				if (vehicles.get(i).getClass().equals(v.getClass()) ) {
					System.out.println("Rent a " + v.getType());
					return vehicles.remove(i);
				}
			}
		}
		return null;
	}
	
	

}

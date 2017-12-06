package expr5;

public class ComputerComponent {
	
	private String name;
	private int price;
	
	public ComputerComponent() {
		
	}
	
	public ComputerComponent(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	};
	
	

}

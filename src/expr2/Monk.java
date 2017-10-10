package expr2;

/**
 * The Monk Class which extends Character class. 
 * @author ZhangHao
 *
 */
public class Monk extends Character{
	
	private String look = "Looks like a monk.\nInitial HP/MP: 200/50";
	
	public Monk(double HP, double MP) {
		this.setHP(HP);
		this.setMP(MP);
	}
	
	public String display() {
		return look;
	}
	
}

package expr2;

/**
 * The SwordWoman class which extends Character class. 
 * @author ZhangHao
 *
 */
public class Ninja extends Character {
	
	private String look = "Looks like a ninja.\nInitial HP/MP: 100/150";
	
	public Ninja(double HP, double MP) {
		this.setHP(HP);
		this.setMP(MP);;
	}
	
	public String display() {
		return look;
	}
}

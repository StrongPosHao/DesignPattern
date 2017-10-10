package expr2;

/**
 * The SwordWoman Class which extends character class.
 * @author ZhangHao
 *
 */
public class SwordWoman extends Character{
	
	private String look = "Looks like a SwordWoman.\nInitial HP/MP: 150/100";
	
	public SwordWoman(double HP, double MP) {
		this.setHP(HP);
		this.setMP(MP);
	}
	
	public String display() {
		return look;
	}
	
}

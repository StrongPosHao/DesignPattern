
/**
 * The Character class.
 * @author ZhangHao
 *
 */
public class Character {
	
	MagicAttack magic_attack;
	PhysicsAttack physics_attack;
	
	private double HP;
	private double MP;
	private String look;
	
	public Character() {
		
	}
	
	public Character(double HP, double MP) {
		this.setHP(HP);
		this.setMP(MP);
	}
	
	/**
	 * To call the magic attack method depend on the concrete class that implements MagicAttack. 
	 * @param magic_attack
	 * @return
	 */
	public String attackWithMagic(MagicAttack magic_attack) {
		return magic_attack.attackWithMagic();
	}
	
	/**
	 * To call the magic attack method depend on the concrete magic_attack class. 
	 * @param magic_attack
	 * @return
	 */
	public String attackWithPhysics(PhysicsAttack physics_attack) {
		return physics_attack.attackWithPhysics();
	}
	
	public String display() {
		return "This is a character";
	}

	public double getHP() {
		return HP;
	}

	public void setHP(double hP) {
		HP = hP;
	}

	public double getMP() {
		return MP;
	}

	public void setMP(double mP) {
		MP = mP;
	}

	public String getLook() {
		return look;
	}

	public void setLook(String look) {
		this.look = look;
	};
	
}

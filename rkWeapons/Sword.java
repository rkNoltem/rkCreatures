package rkWeapons;

public class Sword extends Weapon {
	private static final int damage = 5;
	private static final int range = 1;
	private static final int maxDurability = 100;

	public Sword() {
		super(damage, range, maxDurability);
	}
	
	public String toString() {
		return "Sword";
	}

}

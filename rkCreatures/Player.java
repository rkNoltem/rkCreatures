/**
 * 
 */
package rkCreatures;

import rkWeapons.*;

/**
 * @author Sean Harris
 *
 */
public final class Player extends Creature 
	implements WeaponUser {
	
	private static final int health = 20;
	private static final int speed = 1;
	private Weapon weapon;
	private boolean armed = false;
	
	public Player(int xCoord, int yCoord) {
		super(xCoord, yCoord, health, speed);
	}
	/**
	 * @param name
	 */
	public Player(String name, int xCoord, int yCoord) {
		super(name, xCoord, yCoord, health, speed);
	}
	
	@Override
	public Weapon getWeapon() {
		return weapon;
	}
	
	@Override
	public void equip(Weapon weapon) {
		this.weapon = weapon;
		armed = true;
	}
	
	@Override
	public Weapon drop() {
		Weapon dropped = weapon;
		weapon = null;
		armed = false;
		return dropped;
	}
	
	@Override
	public void attack(Creature target) {
		if (armed)
			weapon.use(target);
		else
			super.attack(target);
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Name: " + getName() + "\n");
		s.append("Health: " + getHealth() + "/" + getMaxHP() + "\n");
		s.append("Speed: " + getSpeed() + "\n");
		s.append("Weapon: " + getWeapon() + "\n");
		s.append("Location: (" + getX() + ", " + getY() + ")\n");
		return s.toString();
	}
}

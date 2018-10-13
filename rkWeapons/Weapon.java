/**
 * 
 */
package rkWeapons;

import rkCreatures.Creature;

/**
 * @author Sean Harris
 *
 */
public abstract class Weapon {
	private int damage;
	private int range;
	private int maxDurability;
	private int durability;

	/**
	 * 
	 */
	Weapon(int damage, int range, int maxDurability) {
		this.damage = damage;
		this.range = range;
		this.maxDurability = maxDurability;
		durability = maxDurability;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getRange() {
		return range;
	}
	
	public int getMaxDurability() {
		return maxDurability;
	}
	
	public int getDurability() {
		return durability;
	}
	
	public void use(Creature target) {
		target.takeDamage(damage);
		durability--;
	}
	
	public void repair() {
		durability = maxDurability;
	}
	
	@Override
	abstract public String toString();
}

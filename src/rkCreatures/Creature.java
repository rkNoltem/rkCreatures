/**
 * TODO install jdk to enable javadoc generation
 */
package rkCreatures;

import rkWeapons.*;

/**
 * @author Sean Harris
 * @since 0.1
 * @version 0.1
 */
public abstract class Creature {
	private int maxHP;
	private int health;
	private int speed;
	private int xCoord, yCoord;
	private String name;
	
	/*protected enum Weapon {
		SWORD(0),
		HAMMER(1),
		BOW(5);
		
		private int weaponCode;
		private int durability;
		
		Weapon(int weaponCode) {
			this.weaponCode = weaponCode;
			durability = getMaxDurability();
		}
		
		int getWeaponCode() {
			return weaponCode;
		}
		
		int getDamage() {
			int damage = 0;
			switch (weaponCode) {
			case 0: damage = 5;//SWORD
					break;
			case 1: damage = 3;//HAMMER
					break;
			case 5: damage = 1;//BOW
					break;
			}
			return damage;
		}
		
		int getRange() {
			int range = 0;
			switch (weaponCode) {
			case 0:	range = 1;//SWORD
					break;
			case 1:	range = 1;//HAMMER
					break;
			case 5:	range = 20;//BOW
					break;
			}
			return range;
		}
		
		int getMaxDurability() {
			int durability = 0;
			switch (weaponCode) {
			case 0: durability = 50;//SWORD
					break;
			case 1: durability = 100;//HAMMER
					break;
			case 5: durability = 50;//BOW
			}
			return durability;
		}
		
		int getDurability() {
			return durability;
		}
		
		void use(Creature target) {
			durability--;
		}
		
		void repair() {
			durability = getMaxDurability();
		}
	}

	protected interface WeaponUser {
		default void equip(Weapon weapon) {}
		
		Weapon drop();
		
		void attack(Creature target);
		
		Weapon getWeapon();
	}*/
	
	/**
	 * TODO javadoc
	 * @param xCoord
	 * @param yCoord
	 * @param maxHP
	 * @param speed
	 */
	Creature(int xCoord, int yCoord, int maxHP, int speed) {
		this.maxHP = maxHP;
		health = maxHP;
		this.speed = speed;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	/**
	 * TODO javadoc
	 * @param name
	 * @param xCoord
	 * @param yCoord
	 * @param maxHP
	 * @param speed
	 */
	Creature(String name, int xCoord, int yCoord, int maxHP, int speed) {
		this.name = name;
		this.maxHP = maxHP;
		health = maxHP;
		this.speed = speed;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	/**
	 * TODO javadoc
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * TODO javadoc
	 * @return
	 */
	public int getMaxHP() {
		return maxHP;
	}
	
	/**
	 * TODO javadoc
	 * @param maxHP
	 */
	protected void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	
	/**
	 * TODO javadoc
	 * @return
	 */
	public int getHealth() {
		return health;
	}
	
	/**
	 * TODO javadoc
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * TODO javadoc
	 * @return
	 */
	public int getX() {
		return xCoord;
	}
	
	/**
	 * TODO javadoc
	 * @return
	 */
	public int getY() {
		return yCoord;
	}
	
	/**
	 * TODO javadoc
	 * @param damage
	 */
	public void takeDamage(int damage) {
		health = (health - damage);
	}
	
	/**
	 * TODO javadoc
	 */
	public void heal() {
		health = maxHP;
	}
	
	/**
	 * TODO javadoc
	 * @param target
	 */
	public void attack(Creature target) {
		target.takeDamage(1);
	}
	
	//TODO range
	
	//TODO movement
	
	/**
	 * TODO javadoc
	 */
	@Override
	abstract public String toString();
	
	/**
	 * TODO javadoc
	 * @param args
	 */
	public static void main(String[] args) {
		Player player1 = new Player("Steve", 0, 0);
		Sword masterSword = new Sword();
		
		player1.equip(masterSword);
		
		System.out.println(player1);
		//System.out.println(player1.getWeapon());
	}
}

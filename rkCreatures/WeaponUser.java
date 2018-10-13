/**
 * 
 */
package rkCreatures;
import rkWeapons.*;

/**
 * @author Sean Harris
 *
 */
public interface WeaponUser {
	void equip(Weapon weapon);
	
	Weapon drop();
	
	void attack(Creature target);
	
	Weapon getWeapon();
}

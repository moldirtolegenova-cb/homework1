package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.*;
public interface Character {
    void displayStats();
    void useSpecialAbility();
    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);
}
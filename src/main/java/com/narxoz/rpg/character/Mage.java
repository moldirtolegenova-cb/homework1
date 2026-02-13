package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.*;
public class Mage implements Character {
    private String name;
    private Weapon weapon;
    private Armor armor;
    public Mage(String name) { this.name = name; }
    public void equipWeapon(Weapon w) { this.weapon = w; }
    public void equipArmor(Armor a) { this.armor = a; }
    public void useSpecialAbility() { System.out.println(name + " casts: Fireball!"); }
    public void displayStats() {
        System.out.println("Mage: " + name);
        System.out.println(" - " + (weapon != null ? weapon.getWeaponInfo() : "No Weapon"));
        System.out.println(" - " + (armor != null ? armor.getArmorInfo() : "No Armor"));
    }
}
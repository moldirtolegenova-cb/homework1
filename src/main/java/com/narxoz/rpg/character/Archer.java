package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.*;
public class Archer implements Character {
    private String name;
    private Weapon weapon;
    private Armor armor;
    public Archer(String name) { this.name = name; }
    public void equipWeapon(Weapon w) { this.weapon = w; }
    public void equipArmor(Armor a) { this.armor = a; }
    public void useSpecialAbility() { System.out.println(name + " uses: Volley of Arrows!"); }
    public void displayStats() {
        System.out.println("Archer: " + name + " | Weapon: " + (weapon != null ? weapon.getWeaponInfo() : "None"));
    }
}
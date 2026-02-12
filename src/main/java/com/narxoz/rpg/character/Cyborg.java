package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.*;
import com.narxoz.rpg.factory.EquipmentFactory;

public class Cyborg implements Character {
    private String name;
    private int health = 200;
    private int energy = 100;
    private Weapon weapon;
    private Armor armor;

    public Cyborg(String name) { this.name = name; }

    public String getName() { return name; }

    public void equip(EquipmentFactory factory) {
        this.weapon = factory.createWeapon();
        this.armor = factory.createArmor();
    }

    public void attack() {
        if (weapon != null) weapon.attack();
        else System.out.println(name + " uses robotic fist!");
    }

    public void useSpecialAbility() {
        System.out.println(name + " activates OVERDRIVE: Attack speed doubled!");
    }

    public void displayStats() {
        System.out.println("=== " + name + " (Cyborg) ===");
        System.out.println("Health: " + health + " | Energy: " + energy);
        if (weapon != null) System.out.println("Equipped Weapon: " + weapon.getWeaponInfo());
        if (armor != null) System.out.println("Equipped Armor: " + armor.getArmorInfo());
    }
}
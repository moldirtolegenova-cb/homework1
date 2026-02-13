package com.narxoz.rpg;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- RPG SYSTEM: FINAL 3x3 DEMO ---\n");
        runDemo(new WarriorFactory(), new MedievalFactory(), "Aragorn");
        runDemo(new MageFactory(), new CyberpunkFactory(), "Gandalf-Neon");
        runDemo(new ArcherFactory(), new RangerFactory(), "Legolas");
        System.out.println("\n--- ASSIGNMENT COMPLETE ---");
    }
    private static void runDemo(CharacterFactory cf, EquipmentFactory ef, String name) {
        Character c = cf.createCharacter(name);
        c.equipWeapon(ef.createWeapon());
        c.equipArmor(ef.createArmor());
        c.displayStats();
        c.useSpecialAbility();
        System.out.println("--------------------------------");
    }
}
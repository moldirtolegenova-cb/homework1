package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.*;
import com.narxoz.rpg.factory.EquipmentFactory;

public interface Character {
    String getName();
    void displayStats();
    void useSpecialAbility();
    void equip(EquipmentFactory factory); // Connects Abstract Factory here
    void attack();
}
package com.narxoz.rpg.factory;
import com.narxoz.rpg.equipment.Weapon; 
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.PlasmaBlade; 
import com.narxoz.rpg.equipment.ShieldGenerator;
public class CyberpunkFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new PlasmaBlade(); 
    }
    @Override
    public Armor createArmor() {
        return new ShieldGenerator();
    }
}
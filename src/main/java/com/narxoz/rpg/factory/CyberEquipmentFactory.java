package com.narxoz.rpg.factory;
import com.narxoz.rpg.equipment.*;
public class CyberEquipmentFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new PlasmaBlade(); }
    public Armor createArmor() { return new ExoSuit(); }
}
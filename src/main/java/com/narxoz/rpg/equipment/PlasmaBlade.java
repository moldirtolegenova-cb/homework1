package com.narxoz.rpg.equipment; 
public class PlasmaBlade implements Weapon { 
    private int damage = 85;
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getWeaponInfo() {
        return "Thermal-Edge Plasma Blade (Cyberpunk Set)";
    }
}
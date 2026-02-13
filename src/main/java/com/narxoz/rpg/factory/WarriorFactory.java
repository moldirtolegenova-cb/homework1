package com.narxoz.rpg.factory;
import com.narxoz.rpg.character.*;
import com.narxoz.rpg.character.Character;
public class WarriorFactory extends CharacterFactory {
    public Character createCharacter(String name) { 
        return new Warrior(name); 
    }
}
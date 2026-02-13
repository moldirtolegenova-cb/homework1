package com.narxoz.rpg.factory;
import com.narxoz.rpg.character.*;
import com.narxoz.rpg.character.Character;
public class MageFactory extends CharacterFactory {
    public Character createCharacter(String name) {
         return new Mage(name);
         }
}
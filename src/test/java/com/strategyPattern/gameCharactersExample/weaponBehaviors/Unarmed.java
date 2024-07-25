package com.strategyPattern.gameCharactersExample.weaponBehaviors;

public class Unarmed implements WeaponBehavior{

    @Override
    public void fight() {
        System.out.println("Unarmed character!");
    }
}

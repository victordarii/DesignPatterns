package com.strategyPattern.gameCharactersExample.weaponBehaviors;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void fight() {
        System.out.println("Firing arrows from a bow!");
    }
}

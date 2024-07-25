package com.strategyPattern.gameCharactersExample.weaponBehaviors;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void fight() {
        System.out.println("Stabbing with a knife!");
    }
}

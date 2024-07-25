package com.strategyPattern.gameCharactersExample.weaponBehaviors;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void fight() {
        System.out.println("Swinging with a Sword!");
    }
}

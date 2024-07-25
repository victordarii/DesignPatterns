package com.strategyPattern.gameCharactersExample.weaponBehaviors;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void fight() {
        System.out.println("Chopping with an AXE!");
    }
}

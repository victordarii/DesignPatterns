package com.strategyPattern.gameCharactersExample;

import com.strategyPattern.gameCharactersExample.weaponBehaviors.WeaponBehavior;

public abstract class Character {

    // Encapsulate the changing behavior
    private WeaponBehavior weaponBehavior;

    // Set weapon behavior on runtime
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    // Delegate weapon behavior
    public void useWeapon(){
        weaponBehavior.fight();
    }
}

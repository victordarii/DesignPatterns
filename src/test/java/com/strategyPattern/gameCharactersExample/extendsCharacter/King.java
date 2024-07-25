package com.strategyPattern.gameCharactersExample.extendsCharacter;

import com.strategyPattern.gameCharactersExample.Character;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.Unarmed;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.WeaponBehavior;

public class King extends Character {

    // Decide default weapon behavior
    public King() {
        setWeaponBehavior(new Unarmed());
    }

    // Set new weapon behavior at runtime
    public King(WeaponBehavior wb) {
        setWeaponBehavior(wb);
    }

}

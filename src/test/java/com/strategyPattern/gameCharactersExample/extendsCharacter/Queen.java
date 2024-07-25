package com.strategyPattern.gameCharactersExample.extendsCharacter;

import com.strategyPattern.gameCharactersExample.Character;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.KnifeBehavior;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.Unarmed;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.WeaponBehavior;

public class Queen extends Character {

    public Queen() {
        setWeaponBehavior(new KnifeBehavior());
    }

    public Queen(WeaponBehavior wb) {
        setWeaponBehavior(wb);
    }
}

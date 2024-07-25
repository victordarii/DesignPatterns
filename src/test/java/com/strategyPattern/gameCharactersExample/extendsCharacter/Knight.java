package com.strategyPattern.gameCharactersExample.extendsCharacter;

import com.strategyPattern.gameCharactersExample.Character;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.SwordBehavior;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.Unarmed;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.WeaponBehavior;

public class Knight extends Character {

    public Knight() {
        setWeaponBehavior(new Unarmed());
    }

    public Knight(WeaponBehavior wb){
        setWeaponBehavior(wb);
    }
}

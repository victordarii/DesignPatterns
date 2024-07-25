package com.strategyPattern.gameCharactersExample.extendsCharacter;

import com.strategyPattern.gameCharactersExample.Character;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.BowAndArrowBehavior;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.Unarmed;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.WeaponBehavior;

public class Troll extends Character {

    public Troll() {
        setWeaponBehavior(new Unarmed());
    }

    public Troll(WeaponBehavior wb) {
        setWeaponBehavior(wb);
    }
}

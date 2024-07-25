package com.strategyPattern.gameCharactersExample;

import com.strategyPattern.gameCharactersExample.extendsCharacter.King;
import com.strategyPattern.gameCharactersExample.extendsCharacter.Knight;
import com.strategyPattern.gameCharactersExample.extendsCharacter.Queen;
import com.strategyPattern.gameCharactersExample.extendsCharacter.Troll;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.AxeBehavior;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.BowAndArrowBehavior;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.KnifeBehavior;
import com.strategyPattern.gameCharactersExample.weaponBehaviors.SwordBehavior;

public class PerformCharacterImplementation {

    public static void main(String[] args) {

        System.out.println("-----------------------King------------------");

        King king1 = new King();
        king1.useWeapon();

        King king2 = new King(new AxeBehavior());
        king2.useWeapon();

        System.out.println("-----------------------Queen------------------");

        Queen queen1 = new Queen();
        queen1.useWeapon();

        Queen queen2 = new Queen(new KnifeBehavior());
        queen2.useWeapon();

        System.out.println("-----------------------Troll------------------");

        Troll troll1 = new Troll();
        troll1.useWeapon();

        Troll troll2 = new Troll(new BowAndArrowBehavior());
        troll2.useWeapon();

        System.out.println("-----------------------Knight------------------");

        Knight knight1 = new Knight();
        knight1.useWeapon();

        Knight knight2 = new Knight(new SwordBehavior());
        knight2.useWeapon();

    }
}

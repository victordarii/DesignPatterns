package com.strategyPattern.ducksExample.extendsDuck;

import com.strategyPattern.ducksExample.abstractDuck.Duck;
import com.strategyPattern.ducksExample.behaviors.flyBehavior.FlyWithWings;
import com.strategyPattern.ducksExample.behaviors.quackBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }



}

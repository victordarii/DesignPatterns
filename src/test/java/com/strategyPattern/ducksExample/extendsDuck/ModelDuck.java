package com.strategyPattern.ducksExample.extendsDuck;

import com.strategyPattern.ducksExample.abstractDuck.Duck;
import com.strategyPattern.ducksExample.behaviors.flyBehavior.FlyNoWay;
import com.strategyPattern.ducksExample.behaviors.quackBehavior.MuteQuack;
import com.strategyPattern.ducksExample.behaviors.FlyBehavior;
import com.strategyPattern.ducksExample.behaviors.QuackBehavior;

public class ModelDuck extends Duck {

    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());     // set by default to not fly
        setQuackBehavior(new MuteQuack());  // set by default to not quack
    }

    // change at run time by overloading the constructor
    public ModelDuck(FlyBehavior fb, QuackBehavior qb) {
        setFlyBehavior(fb);
        setQuackBehavior(qb);
    }

}

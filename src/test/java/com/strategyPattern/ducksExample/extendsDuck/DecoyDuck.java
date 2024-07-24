package com.strategyPattern.ducksExample.extendsDuck;

import com.strategyPattern.ducksExample.abstractDuck.Duck;
import com.strategyPattern.ducksExample.behaviors.flyBehavior.FlyNoWay;
import com.strategyPattern.ducksExample.behaviors.quackBehavior.DuckQuackDevice;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new DuckQuackDevice());
    }

}

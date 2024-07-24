package com.strategyPattern.ducksExample.behaviors.quackBehavior;

import com.strategyPattern.ducksExample.behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Silence");
    }
}

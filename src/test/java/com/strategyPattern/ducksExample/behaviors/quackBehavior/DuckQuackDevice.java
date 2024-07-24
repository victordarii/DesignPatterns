package com.strategyPattern.ducksExample.behaviors.quackBehavior;

import com.strategyPattern.ducksExample.behaviors.QuackBehavior;

public class DuckQuackDevice implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Mimic the quacks!");
    }
}

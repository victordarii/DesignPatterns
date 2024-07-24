package com.strategyPattern.ducksExample.behaviors.quackBehavior;

import com.strategyPattern.ducksExample.behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacks that squeak!");
    }
}

package com.strategyPattern.ducksExample.abstractDuck;

import com.strategyPattern.ducksExample.behaviors.FlyBehavior;
import com.strategyPattern.ducksExample.behaviors.QuackBehavior;

/**
 * Duck class delegates the flying and quacking behaviors to the FlyBehavior and QuackBehavior interfaces, respectively.
 * This allows for dynamic changes of behaviors at runtime, promoting flexibility and reusability of code.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

/**
 * The Strategy Pattern is a design pattern that uses composition to achieve flexibility. It defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable. This allows the behavior of a class to be selected at runtime.
 * The context class (Duck) uses composition to hold a reference to the strategy objects.
 */
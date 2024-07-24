package com.strategyPattern.ducksExample.behaviors.flyBehavior;

import com.strategyPattern.ducksExample.behaviors.FlyBehavior;

/**
 * Concrete Strategies: Implement different versions of the behaviors.
 */
public class FlyWithRockets implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with rockets!");
    }
}

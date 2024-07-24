package com.strategyPattern.ducksExample;

import com.strategyPattern.ducksExample.behaviors.flyBehavior.FlyWithRockets;
import com.strategyPattern.ducksExample.behaviors.flyBehavior.FlyWithWings;
import com.strategyPattern.ducksExample.behaviors.quackBehavior.MuteQuack;
import com.strategyPattern.ducksExample.behaviors.quackBehavior.Squeak;
import com.strategyPattern.ducksExample.extendsDuck.DecoyDuck;
import com.strategyPattern.ducksExample.extendsDuck.MallardDuck;
import com.strategyPattern.ducksExample.extendsDuck.ModelDuck;

public class PerformDucksImplementation {
    public static void main(String[] args) {

        System.out.println("--------------------------MallardDuck---------------------------------");

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();   // set by default to FlyWithWings
        mallardDuck.performQuack(); // set by default to Quack

        System.out.println("--------------------------ModelDuck---------------------------------");

        ModelDuck modelDuck = new ModelDuck();

        modelDuck.performFly();     // set by default to not fly
        modelDuck.performQuack();   // set by default to not quack

        // change behavior at run time
        modelDuck = new ModelDuck(new FlyWithRockets(), new Squeak());
        modelDuck.performFly();     // Flying with rockets!
        modelDuck.performQuack();   // Quacks that squeak!

        System.out.println("--------------------------DecoyDuck---------------------------------");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.performFly();     // set by default to Doesn't fly!
        decoyDuck.performQuack();   // set by default to Mimic the quacks!


    }
}

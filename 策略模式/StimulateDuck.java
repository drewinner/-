package strategy;

import strategy.duck.Duck;
import strategy.duck.GreenHeadDuck;
import strategy.duck.RedHeadDuck;
import strategy.flybehavior.NoFlyBehavior;
import strategy.quackbehavior.NoQuackBehavior;

public class StimulateDuck {
    public static void main(String[] args) {
        Duck mGreenHeadDuck = new GreenHeadDuck();
        Duck mRedHeadDuck = new RedHeadDuck();

        mGreenHeadDuck.display();
        mGreenHeadDuck.fly();
        mGreenHeadDuck.Quack();
        mGreenHeadDuck.swim();

        mRedHeadDuck.display();
        mRedHeadDuck.fly();
        mRedHeadDuck.Quack();
        mRedHeadDuck.swim();
        mRedHeadDuck.display();
        mRedHeadDuck.setmFlyBehavior(new NoFlyBehavior());
        mRedHeadDuck.fly();
        mRedHeadDuck.setmQuackBehavior(new NoQuackBehavior());
        mRedHeadDuck.Quack();
    }
}

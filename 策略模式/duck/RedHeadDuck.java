package strategy.duck;

import strategy.flybehavior.BadFlyBehavior;
import strategy.quackbehavior.GeGeQuackBehavior;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        mFlyBehavior = new BadFlyBehavior();
        mQuackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("**RedHead**");
    }
}

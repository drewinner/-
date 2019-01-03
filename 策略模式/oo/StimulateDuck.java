package strategy.oo;

public class StimulateDuck {
    public static void main(String[] args) {
        GreenHeadDuck mGreenHeadDuck = new GreenHeadDuck();
        RedHeadDuck mRedHeadDuck = new RedHeadDuck();

        mGreenHeadDuck.display();
        mGreenHeadDuck.fly();
        mGreenHeadDuck.Quack();
        mGreenHeadDuck.swim();

        mRedHeadDuck.display();

        mRedHeadDuck.Quack();
        mRedHeadDuck.swim();
        mRedHeadDuck.fly();
    }
}

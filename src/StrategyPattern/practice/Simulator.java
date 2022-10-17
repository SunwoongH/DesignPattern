package StrategyPattern.practice;

public class Simulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck(new FlyWithWings(), new Quack());
        mallard.performFly();
        mallard.performQuack();
        Duck model = new ModelDuck(new FlyNoWay(), new MuteQuack());
        model.performQuack();
        model.setQuackBehavior(new Quack());
        model.performQuack();
    }
}

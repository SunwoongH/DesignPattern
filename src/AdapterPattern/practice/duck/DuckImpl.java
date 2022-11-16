package AdapterPattern.practice.duck;

public class DuckImpl implements Duck {
    @Override
    public void quack() {
        System.out.println("quack!");
    }

    @Override
    public void fly() {
        System.out.println("duck fly!");
    }
}

package AdapterPattern.practice.duck;

public class TurkeyImpl implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble!");
    }

    @Override
    public void fly() {
        System.out.println("turkey fly!");
    }
}

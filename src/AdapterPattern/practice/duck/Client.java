package AdapterPattern.practice.duck;

public class Client {
    public static void main(String[] args) {
        Duck duck = new DuckImpl();
        Turkey turkey = new TurkeyImpl();
        Duck adapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("The Duck says...");
        testDuck(duck);
        System.out.println("The TurkeyAdapter says...");
        testDuck(adapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

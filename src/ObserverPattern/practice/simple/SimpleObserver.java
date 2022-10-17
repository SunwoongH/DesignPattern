package ObserverPattern.practice.simple;

public class SimpleObserver implements Observer {
    private int value;
    private final SimpleSubject simpleSubject;

    public SimpleObserver(SimpleSubject simpleSubject) {
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update() {
        this.value = simpleSubject.getValue();
        display();
    }

    public void display() {
        System.out.println("value : " + value);
    }
}

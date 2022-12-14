package ObserverPattern.practice.simple;

import java.util.ArrayList;

public class SimpleSubject implements Subject {
    private final ArrayList<Observer> observers;
    private int value = 0;

    public SimpleSubject() {
        this.observers = new ArrayList<>();
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    public int getValue() {
        return value;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

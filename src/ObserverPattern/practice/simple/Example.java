package ObserverPattern.practice.simple;

public class Example {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
        simpleSubject.setValue(100);
        simpleSubject.removeObserver(simpleObserver);
    }
}

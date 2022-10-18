package DecoratorPattern.assignment;

public abstract class DisplayDecorator extends Display {
    Display display;

    public DisplayDecorator(Display display, int width, int height) {
        super(width, height);
        this.display = display;
    }
}


package DecoratorPattern.assignment;

public class SpeedometerDisplay extends BaseDisplayDecorator {
    public SpeedometerDisplay(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    public String getText() {
        return "Speed: 50";
    }
}

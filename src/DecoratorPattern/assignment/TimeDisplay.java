package DecoratorPattern.assignment;

import java.time.LocalDateTime;

public class TimeDisplay extends BaseDisplayDecorator {
    public TimeDisplay(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    public String getText() {
        return "Date: " + LocalDateTime.now();
    }
}

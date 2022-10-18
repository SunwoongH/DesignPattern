package DecoratorPattern.assignment;

import javax.swing.*;
import java.awt.*;

public abstract class BaseDisplayDecorator extends DisplayDecorator {
    JPanel panel;
    LabelPanel labelPanel;

    public BaseDisplayDecorator(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    public JPanel create() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        labelPanel = new LabelPanel();
        panel.add(display.create());
        panel.add(labelPanel.createPanel(getWidth(), super.getHeight()));
        return panel;
    }

    @Override
    public void show() {
        display.show();
        labelPanel.updateText(getText());
    }

    @Override
    public int getHeight() {
        return display.getHeight() + super.getHeight();
    }

    public abstract String getText();
}

package AbstractFactory.uiComponent.text;

import AbstractFactory.ThemeFactory.IText;

public class LightText implements IText {
    @Override
    public void style() {
        System.out.println("Light Text Theme activated");
    }
}

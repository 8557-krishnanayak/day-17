package AbstractFactory.uiComponent.text;

import AbstractFactory.ThemeFactory.IText;

public class DarkText implements IText {
    @Override
    public void style() {
        System.out.println("Dark Text Theme activated");
    }
}

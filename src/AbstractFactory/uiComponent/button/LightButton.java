package AbstractFactory.uiComponent.button;

import AbstractFactory.ThemeFactory.IButton;

public class LightButton implements IButton {
    @Override
    public void style() {
        System.out.println("Light button theme activate");
    }
}

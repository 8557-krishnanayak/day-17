package AbstractFactory.uiComponent.button;

import AbstractFactory.ThemeFactory.IButton;

public class DarkButton implements IButton {
    @Override
    public void style() {
        System.out.println("Dark Button Theme activate");
    }
}

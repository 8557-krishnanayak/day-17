package AbstractFactory;

import AbstractFactory.ThemeFactory.IButton;
import AbstractFactory.ThemeFactory.IText;
import AbstractFactory.ThemeFactory.IThemeFactory;
import AbstractFactory.uiComponent.button.LightButton;
import AbstractFactory.uiComponent.text.LightText;

public class LightTheme implements IThemeFactory {
    @Override
    public IButton createButton() {
        return new LightButton();
    }

    @Override
    public IText createText() {
        return new LightText();
    }
}

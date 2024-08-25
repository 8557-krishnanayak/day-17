package AbstractFactory;

import AbstractFactory.ThemeFactory.IThemeFactory;
import AbstractFactory.ThemeFactory.IButton;
import AbstractFactory.ThemeFactory.IText;
import AbstractFactory.uiComponent.button.DarkButton;
import AbstractFactory.uiComponent.text.DarkText;

public class DarkTheme implements IThemeFactory {
    @Override
    public IButton createButton() {
        return new DarkButton();
    }

    @Override
    public IText createText() {
        return new DarkText();
    }
}

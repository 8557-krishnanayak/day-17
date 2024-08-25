package AbstractFactory;

import AbstractFactory.ThemeFactory.IButton;
import AbstractFactory.ThemeFactory.IText;
import AbstractFactory.ThemeFactory.IThemeFactory;

public class ApplicationUi {
    private IButton button;
    private IText text;


    public ApplicationUi(IThemeFactory factory) {
        this.button = factory.createButton();
        this.text = factory.createText();
    }


    public void status() {
        System.out.println("Status of the application theme");
        button.style();
        text.style();
    }

//    REST of the function


    public void setTheme(IThemeFactory factory) {
        this.button = factory.createButton();
        this.text = factory.createText();
    }

}

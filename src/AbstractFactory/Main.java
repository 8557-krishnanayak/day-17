package AbstractFactory;

import AbstractFactory.ThemeFactory.IThemeFactory;

public class Main {
    final static String THEME_MODE = "dark";

    public static void main(String[] args) {
        IThemeFactory themeMode = getThemeMode(THEME_MODE);

        //
        ApplicationUi application = new ApplicationUi(themeMode);

        application.status();
        System.out.println("*********************** Change Made ***********************");
        themeMode = getThemeMode("light");
        application.setTheme(themeMode);

        application.status();


    }


    public static IThemeFactory getThemeMode(String mode) {
        if (mode.equalsIgnoreCase("light")) {
            return new LightTheme(); // impl IThemeFactory
        } else {
            return new DarkTheme(); // impl IThemeFactory
        }
    }
}


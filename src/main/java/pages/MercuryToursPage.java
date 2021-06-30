package pages;

import org.openqa.selenium.By;

public class MercuryToursPage {

    private static By registerLinkLocator = By.linkText("REGISTER");
    private static By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']");
    private static By usernameLocator = By.id("email");
    private static By passwordLocator = By.name("password");
    private static By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");
    private static By registerBtnLocator = By.name("submit");
    private static By userLocator = By.name("userName");
    private static By passLocator = By.name("password");
    private static By singBtnLocator = By.name("submit");
    private static By lblSingRegister = By.xpath("//h3[contains(text(),'Login Successfull')]");

    private static By fonts = By.tagName("font");

    public static By getRegisterLinkLocator() {
        return registerLinkLocator;
    }

    public static By getRegisterPageLocator() {
        return registerPageLocator;
    }

    public static By getUsernameLocator() {
        return usernameLocator;
    }

    public static By getPasswordLocator() {
        return passwordLocator;
    }

    public static By getConfirmPasswordLocator() {
        return confirmPasswordLocator;
    }

    public static By getRegisterBtnLocator() {
        return registerBtnLocator;
    }

    public static By getUserLocator() {
        return userLocator;
    }

    public static By getPassLocator() {
        return passLocator;
    }

    public static By getSingBtnLocator() {
        return singBtnLocator;
    }

    public static By getFonts() {
        return fonts;
    }

    public static By getLblSingRegister() {
        return lblSingRegister;
    }
}

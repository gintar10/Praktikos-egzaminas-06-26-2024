package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@href, '/registruoti')]")
    private WebElement SukurtiNaujaPaskyra;

    public void SukurtiNaujaPaskyra() {
        SukurtiNaujaPaskyra.click();
    }


    @FindBy(css = "input[name='username']")
    private static WebElement inputUsername;

    public void typeUsername(String jonas101) {
        inputUsername.sendKeys(jonas101);
    }

    @FindBy(css = "input[name='password']")
    private static WebElement inputPassword;

    public void typePassword(String password1234) {
        inputPassword.sendKeys(password1234);
    }

    @FindBy (css = "button[class ='btn btn-lg btn-primary btn-block'")
    private static WebElement buttonSubmit;

    public static void clickPrisijungti() {
        buttonSubmit.click();
    }

    public String getWarningMessageText() {
        return "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi.";
    }
}

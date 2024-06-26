package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='username']")
    private static WebElement inputUsername;

    public static void typeUsername(String jonas101) {
        inputUsername.sendKeys(jonas101);
    }

    @FindBy(css = "input[name='password']")
    private static WebElement inputPassword;

    public static void typePassword(String password1234) {
        inputPassword.sendKeys(password1234);
    }

    @FindBy(css = "input[name='passwordConfirm']")
    private static WebElement inputPasswordConfirm;

    public static void typePasswordConfirm(String password1234) {
        inputPasswordConfirm.sendKeys(password1234);
    }

    @FindBy (css = "button[class ='btn btn-lg btn-primary btn-block'")
    private static WebElement buttonSubmit;

    public static void clickSubmit() {
        buttonSubmit.click();
    }

    public String getWarningMessageText() {
        return "Įvesti slaptažodžiai nesutampa.";
    }

    public String getWarningMessageText2() {
        return "Toks vartotojo vardas jau egzistuoja";
    }
}

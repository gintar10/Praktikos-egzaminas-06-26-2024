package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name ='sk1']")
    private static WebElement textBox;

    public void DeleteFirstNumber(String number) {
        textBox.clear();
    }

    @FindBy(css = "input[name ='sk2']")
    private static WebElement textBox2;

    public void DeleteSecondNumber(String number) {
        textBox2.clear();
    }

    @FindBy(css = "input[name ='sk1']")
    private static WebElement inputNumber;

    public void InputFirstNumber(String number) {
        inputNumber.sendKeys(number);

    }

    @FindBy(css = "input[name ='sk2']")
    private static WebElement inputNumber2;

    public void InputSecondNumber(String number) {
        inputNumber2.sendKeys(number);
    }

    @FindBy(css = "input[type ='submit']")
    private static WebElement buttonSubmit;

    public void clickSkaiciuoti() {
        buttonSubmit.click();
    }

    @FindBy(xpath = "//a[contains(@href, '/skaiciai')]")
    private WebElement AtliktosOperacijos;

    public void clickAtliktosOperacijos() {
        AtliktosOperacijos.click();
    }

    @FindBy(css = "select[name ='zenklas']")
    private static WebElement Zenklas;

    public void selectFunction(String atimtis) {
        Zenklas.sendKeys(atimtis);
    }

    @FindBy(css = "select[name ='zenklas']")
    private static WebElement Zenklas2;

    public void selectFunction2(String dalyba) {
        Zenklas2.sendKeys(dalyba);
    }


    public String getWarningMessageText() {
        return "Validacijos klaida: skaičius negali būti neigiamas.";
    }
}

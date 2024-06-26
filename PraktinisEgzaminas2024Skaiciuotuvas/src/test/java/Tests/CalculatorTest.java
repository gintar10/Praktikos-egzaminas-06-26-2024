package Tests;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest extends BaseTest{

    MainPage mainPage;
    LoginPage loginPage;

    @Nested
    class SuiteTest {

        @Test
        void userCanPerformBasicMathOperations() {

        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);

        mainPage.typeUsername("Jonas101");
        mainPage.typePassword("Password1234");

        MainPage.clickPrisijungti();

        loginPage.DeleteFirstNumber("0");
        loginPage.DeleteSecondNumber("0");
        loginPage.InputFirstNumber("12");
        loginPage.InputSecondNumber("8");
        loginPage.selectFunction("Atimtis");

        loginPage.clickSkaiciuoti();
    }

        @Test
        void userCannotPerformBasicMathOperations() {

            mainPage = new MainPage(driver);
            loginPage = new LoginPage(driver);

            mainPage.typeUsername("Jonas101");
            mainPage.typePassword("Password1234");

            MainPage.clickPrisijungti();

            loginPage.DeleteFirstNumber("0");
            loginPage.DeleteSecondNumber("0");
            loginPage.InputFirstNumber("-3");
            loginPage.InputSecondNumber("6");

            loginPage.clickSkaiciuoti();

            String expectedWarning = "Validacijos klaida: skaičius negali būti neigiamas.";
            String actualWarning = loginPage.getWarningMessageText();
            assertEquals(expectedWarning, actualWarning);
        }

        @Test
        void userCanPerformNewBasicCalculationFunctions() {

            mainPage = new MainPage(driver);
            loginPage = new LoginPage(driver);

            mainPage.typeUsername("Jonas101");
            mainPage.typePassword("Password1234");

            MainPage.clickPrisijungti();

            loginPage.DeleteFirstNumber("0");
            loginPage.DeleteSecondNumber("0");
            loginPage.InputFirstNumber("36");
            loginPage.InputSecondNumber("6");
            loginPage.selectFunction2("Dalyba");
            loginPage.clickSkaiciuoti();
        }

        @Test
        void userCanSearchAllPerformedOperations() {

            mainPage = new MainPage(driver);
            loginPage = new LoginPage(driver);

            mainPage.typeUsername("Jonas101");
            mainPage.typePassword("Password1234");

            MainPage.clickPrisijungti();
            loginPage.clickAtliktosOperacijos();
        }
    }
}

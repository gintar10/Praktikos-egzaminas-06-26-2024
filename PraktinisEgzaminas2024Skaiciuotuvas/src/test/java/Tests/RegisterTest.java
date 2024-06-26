package Tests;

import PageObjects.MainPage;
import PageObjects.RegisterPage;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterTest extends BaseTest{

    MainPage mainPage;
    RegisterPage registerPage;

    @Nested
    class SuiteTest {

        @Test
        void userCanCreateNewAccount() {
            mainPage = new MainPage(driver);
            registerPage = new RegisterPage(driver);

            mainPage.SukurtiNaujaPaskyra();

            RegisterPage.typeUsername("Jonas101");
            RegisterPage.typePassword("Password1234");
            RegisterPage.typePasswordConfirm("Password1234");

            RegisterPage.clickSubmit();
        }

        @Test
        void userCannotCreateNewAccountWithIncorrectCredentials() {

            mainPage = new MainPage(driver);
            registerPage = new RegisterPage(driver);

            mainPage.SukurtiNaujaPaskyra();

            RegisterPage.typeUsername("Jonas101");
            RegisterPage.typePassword("Password1234");
            RegisterPage.typePasswordConfirm("Password345610");

            RegisterPage.clickSubmit();

            String expectedWarning = "Įvesti slaptažodžiai nesutampa.";
            String actualWarning = registerPage.getWarningMessageText();
            assertEquals(expectedWarning, actualWarning);
        }
    }
}

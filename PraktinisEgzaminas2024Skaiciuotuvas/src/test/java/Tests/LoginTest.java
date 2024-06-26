package Tests;

import PageObjects.MainPage;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest{

    MainPage mainPage;

    @Nested
    class SuiteTest {

        @Test
        void userCanLogIn() {

            mainPage = new MainPage(driver);

            mainPage.typeUsername("Jonas101");
            mainPage.typePassword("Password1234");

            MainPage.clickPrisijungti();
        }

        @Test
        void userCannotLogInWithIncorrectCredentials() {

            mainPage = new MainPage(driver);

            mainPage.typeUsername("Jonas101");
            mainPage.typePassword("Password12340000112");

            MainPage.clickPrisijungti();

            String expectedWarning = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi.";
            String actualWarning = mainPage.getWarningMessageText();
            assertEquals(expectedWarning, actualWarning);
        }
    }
}

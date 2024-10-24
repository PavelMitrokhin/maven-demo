package byITacademyMPA.svyatoslav.biz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

    @Test
    public void positiveLoadedPageTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.getLoadedPageText();

        Assertions.assertTrue(LoginPageMessages.LOADED_PAGE.contains
                ("© CoolSoft by Somebody\n" + "fhlrhwelrwerhwerh"), "Должен быть: Расчёт веса");
    }

    @Test
    public void negativeHeightOnlyTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.sendKeysInputHeight("177");
        loginPage.clickButtonCalculate();
        loginPage.getErrorMessageText();

        Assertions.assertEquals(LoginPageMessages.INVALID_NAME_WEIGHT_GENDER, loginPage.getErrorMessageText());
    }

    @Test
    public void negativeWeightOnlyTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.sendKeysInputWeight("77");
        loginPage.clickButtonCalculate();
        loginPage.getErrorMessageText();

        Assertions.assertEquals(LoginPageMessages.INVALID_NAME_HEIGHT_GENDER, loginPage.getErrorMessageText());
    }

    @Test
    public void negativeNoGenderTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);

        loginPage.sendKeysInputName("Gena");
        loginPage.sendKeysInputHeight("177");
        loginPage.sendKeysInputWeight("75");
        loginPage.clickButtonCalculate();

        Assertions.assertEquals(LoginPageMessages.INVALID_GENDER_MESSAGE, loginPage.getErrorMessageText());
    }

    @Test
    public void positiveHeavyWeightTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);

        loginPage.sendKeysInputName("Gena");
        loginPage.sendKeysInputHeight("222");
        loginPage.sendKeysInputWeight("222");
        loginPage.selectButtonMaleGender();
        loginPage.clickButtonCalculate();
        loginPage.getResultText();

        Assertions.assertEquals(LoginPageMessages.HEAVYWEIGHT, loginPage.getResultText());
    }

    @Test
    public void negativeTest1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);

        loginPage.sendKeysInputName("Gena");
        loginPage.clickButtonCalculate();

    }

    @Test
    public void negativeTest2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);

        loginPage.sendKeysInputName("Gena");
        loginPage.sendKeysInputHeight("177");
        loginPage.clickButtonCalculate();
    }

    @Test
    public void negativeTest3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);

        loginPage.sendKeysInputName("Gena");
        loginPage.sendKeysInputHeight("177");
        loginPage.sendKeysInputWeight("75");
        loginPage.clickButtonCalculate();
    }

    @Test
    public void positiveIdealWeightTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);

        loginPage.sendKeysInputName("Gena");
        loginPage.sendKeysInputHeight("177");
        loginPage.sendKeysInputWeight("75");
        loginPage.selectButtonMaleGender();
        loginPage.clickButtonCalculate();
        loginPage.getResultText();

        Assertions.assertEquals(LoginPageMessages.IDEAL_WEIGHT, loginPage.getResultText());
    }
}

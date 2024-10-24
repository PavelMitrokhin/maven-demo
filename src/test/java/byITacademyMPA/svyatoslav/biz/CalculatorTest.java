package byITacademyMPA.svyatoslav.biz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

    @Test
    public void negativeCheckTest1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String textHeaderXpath = "/html/body/table/tbody/tr[1]/td";
        By textHeaderBy = By.xpath(textHeaderXpath);
        WebElement textHeaderWebElement = webDriver.findElement(textHeaderBy);

        String actual = textHeaderWebElement.getText();

        Assertions.assertTrue(actual.contains("Расчёт веса"), "Должен быть: Расчёт веса");
    }

    @Test
    public void negativeHeightOnlyTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.sendKeysInputHeight("177");
        loginPage.clickButtonCalculate();
        loginPage.getErrorMessageText();

        Assertions.assertEquals(LoginPageMessages.INVALID_NAME_WEIGHT_GENDER, LoginPageMessages.INVALID_NAME_WEIGHT_GENDER);
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

        Assertions.assertEquals(LoginPageMessages.INVALID_GENDER_MESSAGE,loginPage.getErrorMessageText());
    }

    @Test
    public void positiveCheckTest1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);

        loginPage.sendKeysInputName("Gena");
        loginPage.sendKeysInputHeight("222");
        loginPage.sendKeysInputWeight("222");
        loginPage.selectButtonMaleGender();
        loginPage.clickButtonCalculate();
        loginPage.getResultText();

        Assertions.assertEquals(LoginPageMessages.RESULT_, LoginPageMessages.RESULT_);
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
    public void positiveTest1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(webDriver);

        loginPage.sendKeysInputName("Gena");
        loginPage.sendKeysInputHeight("177");
        loginPage.sendKeysInputWeight("75");
        loginPage.selectButtonMaleGender();
        loginPage.clickButtonCalculate();
    }
}

package byITacademyMPA.svyatoslav.biz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickButtonCalculate() {
        By buttonCalculateBy = By.xpath(LoginPageXpath.BUTTON_CALCULATE_XPATH);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();
    }

    public void sendKeysInputName(String name) {
        By inputNameBy = By.xpath(LoginPageXpath.INPUT_NAME_XPATH);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys(name);
    }

    public void sendKeysInputHeight(String height) {
        By inputHeightBy = By.xpath(LoginPageXpath.INPUT_HEIGHT_XPATH);
        WebElement inputNameWebElement = webDriver.findElement(inputHeightBy);
        inputNameWebElement.sendKeys(height);
    }

    public void sendKeysInputWeight(String weight) {
        By inputWeightBy = By.xpath(LoginPageXpath.INPUT_WEIGHT_XPATH);
        WebElement inputNameWebElement = webDriver.findElement(inputWeightBy);
        inputNameWebElement.sendKeys(weight);
    }

    public void selectButtonMaleGender() {
        By inputMaleGenderBy = By.xpath(LoginPageXpath.INPUT_MALE_GENDER_XPATH);
        WebElement inputMaleGenderWebElement = webDriver.findElement(inputMaleGenderBy);
        inputMaleGenderWebElement.click();
    }

    public void selectButtonFemaleGender() {
        By inputFemaleGenderBy = By.xpath(LoginPageXpath.INPUT_FEMALE_GENDER_XPATH);
        WebElement inputFemaleGenderWebElement = webDriver.findElement(inputFemaleGenderBy);
        inputFemaleGenderWebElement.click();
    }

    public String getErrorMessageText() {
        By errorTextBy = By.xpath(LoginPageXpath.ERROR_MESSAGE_XPATH);
        WebElement errorTextWebElement = webDriver.findElement(errorTextBy);
        return errorTextWebElement.getText();
    }
    public String getResultText() {
        By errorTextBy = By.xpath(LoginPageXpath.RESULT_XPATH);
        WebElement errorTextWebElement = webDriver.findElement(errorTextBy);
        return errorTextWebElement.getText();
    }
}

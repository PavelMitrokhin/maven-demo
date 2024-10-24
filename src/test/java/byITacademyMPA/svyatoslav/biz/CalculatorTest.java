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

        String actual =textHeaderWebElement.getText();

        Assertions.assertTrue(actual.contains("Расчёт веса"),"Должен быть: Расчёт веса");
    }

    @Test
    public void negativeCheckTest2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String errorTextXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By errorTextBy = By.xpath(errorTextXpath);
        WebElement errorTextWebElement = webDriver.findElement(errorTextBy);

        String actual =errorTextWebElement.getText();
        String expected = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void negativeCheckTest3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("177");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String errorTextXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By errorTextBy = By.xpath(errorTextXpath);
        WebElement errorTextWebElement = webDriver.findElement(errorTextBy);

        String actual =errorTextWebElement.getText();
        String expected = "Не указано имя.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void negativeCheckTest4() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("Gena");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String errorTextXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By errorTextBy = By.xpath(errorTextXpath);
        WebElement errorTextWebElement = webDriver.findElement(errorTextBy);

        String actual =errorTextWebElement.getText();
        String expected = "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void negativeCheckTest5() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("Gena");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("177");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("75");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String errorTextXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By errorTextBy = By.xpath(errorTextXpath);
        WebElement errorTextWebElement = webDriver.findElement(errorTextBy);

        String actual =errorTextWebElement.getText();
        String expected = "Не указан пол.";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void negativeCheckTest6() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("Gena");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("2222");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("75");

        String inputMaleGenderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By inputMaleGenderBy = By.xpath(inputMaleGenderXpath);
        WebElement inputMaleGenderWebElement = webDriver.findElement(inputMaleGenderBy);
        inputMaleGenderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String errorTextXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By errorTextBy = By.xpath(errorTextXpath);
        WebElement errorTextWebElement = webDriver.findElement(errorTextBy);

        String actual =errorTextWebElement.getText();
        String expected = "Рост должен быть в диапазоне 50-300 см.";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void positiveCheckTest1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("Gena");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("222");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("222");

        String inputMaleGenderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By inputMaleGenderBy = By.xpath(inputMaleGenderXpath);
        WebElement inputMaleGenderWebElement = webDriver.findElement(inputMaleGenderBy);
        inputMaleGenderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String errorTextXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By errorTextBy = By.xpath(errorTextXpath);
        WebElement errorTextWebElement = webDriver.findElement(errorTextBy);

        String actual =errorTextWebElement.getText();
        String expected = "Значительный избыток массы тела, тучность";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void negativeTest1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("Gena");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();
    }

    @Test
    public void negativeTest2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("Gena");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("177");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();
    }

    @Test
    public void negativeTest3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("Gena");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("177");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("75");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();
    }

    @Test
    public void positiveTest1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("Gena");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("177");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("75");

        String inputMaleGenderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By inputMaleGenderBy = By.xpath(inputMaleGenderXpath);
        WebElement inputMaleGenderWebElement = webDriver.findElement(inputMaleGenderBy);
        inputMaleGenderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();
    }
}

package byITacademyMPA.svyatoslav.biz;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

    @Test
    public void test1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String xpathName = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By byXpathName = By.xpath(xpathName);
        WebElement webElementName = webDriver.findElement(byXpathName);
        webElementName.sendKeys("Gena");

        String xpathButton = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By by = By.xpath(xpathButton);
        WebElement webElement = webDriver.findElement(by);
        webElement.click();
    }
}

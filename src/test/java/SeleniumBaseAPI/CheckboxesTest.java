package SeleniumBaseAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckboxesTest {
    public ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\QA_Tools\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @DataProvider(name = "xPathDataProvider")
    public Object[][] dataProviderXPath() {
        return new Object[][]{
                {"//input[contains(@id, 'checkbox-1')]"},
                {"//input[contains(@id, 'checkbox-2')]"},
                {"//input[contains(@id, 'checkbox-3')]"},
        };
    }

    @DataProvider(name = "cssDataProvider")
    public Object[][] dataProviderCss() {
        return new Object[][]{
                {"#checkbox-1"},
                {"#checkbox-2"},
                {"#checkbox-3"},
        };
    }

    @Test(dataProvider = "xPathDataProvider")
    public void testCheckboxXPath(String data) {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.xpath(data)).click();
        System.out.println("Data is: " + data);
    }

    @Test(dataProvider = "cssDataProvider")
    public void testCheckboxCss(String data) {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.cssSelector(data)).click();
        System.out.println("Data is: " + data);
    }

    @AfterTest
    public void close() {
        driver.quit();
    }
}

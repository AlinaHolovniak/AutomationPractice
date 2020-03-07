package SeleniumBaseAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckboxesTestVerification {
    private ChromeDriver driver;

    @BeforeGroups(groups = "Checkboxes")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\QA_Tools\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");
    }

    @DataProvider
    public Object[][] dataProviderXPath() {
        return new Object[][]{
                {"//input[contains(@id, 'checkbox-1')]"},
                {"//input[contains(@id, 'checkbox-2')]"},
                {"//input[contains(@id, 'checkbox-3')]"},
        };
    }

    @DataProvider
    public Object[][] dataProviderCss() {
        return new Object[][]{
                {"#checkbox-1"},
                {"#checkbox-2"},
                {"#checkbox-3"},
        };
    }

    @Test(dataProvider = "dataProviderXPath", groups = "Checkboxes")
    public void testCheckboxXPath(String xPathLocator) {
        driver.findElement(By.xpath(xPathLocator)).click();
    }

    @Test(dataProvider = "dataProviderCss", groups = "Checkboxes")
    public void testCheckboxCss(String cssLocator) {
        driver.findElement(By.cssSelector(cssLocator)).click();
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}

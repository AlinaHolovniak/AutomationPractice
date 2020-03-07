package SeleniumBaseAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DropdownTestVerification {
    private ChromeDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\QA_Tools\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void clickDropdownButton() {
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropdownButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownButton.click();
    }

    @DataProvider
    public Object[][] dataProviderXPath() {
        return new Object[][]{
                {"1", "autocomplete"},
                {"2", "buttons"},
                {"3", "checkbox"},
                {"4", "datepicker"},
                {"5", "dragdrop"},
                {"6", "dropdown"},
                {"7", "enabled"},
                {"8", "fileupload"},
                {"9", "filedownload"},
                {"10", "keypress"},
                {"11", "modal"},
                {"12", "scroll"},
                {"13", "radiobutton"},
                {"14", "switch-window"},
                {"15", "form"},
        };
    }

    @Test(dataProvider = "dataProviderXPath")
    public void testClickButtons(String i, String expectedURL) {
        driver.findElement(By.xpath("//div[@class= 'dropdown-menu show']/a[" + i + "]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://formy-project.herokuapp.com/" + expectedURL, "URLs do not match");
    }

    @AfterMethod
    public void returnToDropdownButtonPage() {
        driver.navigate().back();
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}

package SeleniumBaseAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ButtonsTest {
    public ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\QA_Tools\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void testButtonPrimary() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[@class='btn btn-lg btn-primary']")).click();
    }

    @Test(priority = 2)
    public void testButtonSuccess() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[@class='btn btn-lg btn-success']")).click();
    }

    @Test(priority = 3)
    public void testButtonInfo() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[@class='btn btn-lg btn-info']")).click();
    }

    @Test(priority = 4)
    public void testButtonWarning() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[@class='btn btn-lg btn-warning']")).click();
    }

    @Test(priority = 5)
    public void testButtonDanger() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[@class='btn btn-lg btn-danger']")).click();
    }

    @Test(priority = 6)
    public void testButtonLink() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[@class='btn btn-lg btn-link']")).click();
    }

    @Test(priority = 7)
    public void testButtonLeft() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//div//button[contains(text(), 'Left')]")).click();
    }

    @Test(priority = 8)
    public void testButtonMiddle() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//div//button[contains(text(), 'Middle')]")).click();
    }

    @Test(priority = 10)
    public void testClickButtonRight() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//div//button[contains(text(), 'Right')]")).click();
    }

    @Test(priority = 11)
    public void testButton1() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//div//button[contains(text(), '1')]")).click();
    }

    @Test(priority = 12)
    public void testButton2() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//div//button[contains(text(), '2')]")).click();
    }

    @Test(priority = 13)
    public void testDropdown() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//button[contains(@id,'btnGroupDrop1')]")).click();
    }

    @Test(priority = 14)
    public void testDropdownFirstLink() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//button[contains(@id,'btnGroupDrop1')]")).click();
        driver.findElement(By.xpath("//div//a[contains(text(),'Dropdown link 1')]")).click();
    }

    @Test(priority = 15)
    public void testDropdownSecondLink() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//button[contains(@id,'btnGroupDrop1')]")).click();
        driver.findElement(By.xpath("//div//a[contains(text(),'Dropdown link 2')]")).click();
    }

    @AfterTest
    public void close() {
        driver.quit();
    }
}
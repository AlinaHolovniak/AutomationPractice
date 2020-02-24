import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UiTestCases {

        @Test
        public void verifyString() {
            System.setProperty("webdriver.chrome.driver", "D:\\QA_Tools\\Drivers\\chromedriver.exe");
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("https://www.youtube.com/");
        }
    }


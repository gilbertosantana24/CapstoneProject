package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver = get_driver();

    private WebDriver get_driver() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Localhost/IdeaProjects/CapstoneProject/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        return driver;
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("This is beforeTest");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        driver.quit();
    }

}

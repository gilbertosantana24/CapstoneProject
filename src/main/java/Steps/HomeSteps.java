package Steps;

import Pages.HomePage;
import Tests.CustomAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class HomeSteps extends BaseSteps {
    HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);

    public HomeSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void getSamsungGalaxy() throws InterruptedException {
        Thread.sleep(3000);
        homePage.getSamsungGalaxy().click();
    }

    public void getNokiaLumia() throws InterruptedException {
        Thread.sleep(3000);
        homePage.getNokiaLumia().click();
    }

    public void goHomePage() throws InterruptedException {
        Thread.sleep(3000);
        homePage.goHome().click();
    }

    public void getNumOfCategories() throws InterruptedException {
        Thread.sleep(3000);
        CustomAssertions.isElementDisplayed(homePage.getPhonesCtg().isDisplayed());
        CustomAssertions.isElementDisplayed(homePage.getLaptopsCtg().isDisplayed());
        CustomAssertions.isElementDisplayed(homePage.getMonitorsCtg().isDisplayed());
    }


}

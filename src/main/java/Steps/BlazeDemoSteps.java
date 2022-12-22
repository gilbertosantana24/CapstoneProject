package Steps;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemoSteps extends BaseSteps {
    HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);

    public BlazeDemoSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnProduct() throws InterruptedException {
        homePage.getSamsungGalaxy();
        //_webDriver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
        Thread.sleep(3000);
    }

    public void checkProductDetails() {
        webDriver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
        ).isDisplayed();
        System.out.println("everything appears on screen");

    }

    public void addToCart() {
        webDriver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
    }

    public void catchAlertMessage() {
        String alert = webDriver.switchTo().alert().getText();
        if(alert.equals("Product added")){
            webDriver.switchTo().alert().accept();
            System.out.println("Got the alert message from popup");
        }
    }


}

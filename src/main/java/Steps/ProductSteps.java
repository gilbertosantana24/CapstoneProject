package Steps;

import Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Tests.CustomAssertions;
import org.testng.Assert;

public class ProductSteps extends BaseSteps {
    ProductPage productPage = PageFactory.initElements(webDriver, ProductPage.class);

    public ProductSteps(WebDriver webDriver){
        super(webDriver);
    }

    public void getTitle() {
        productPage.getProdTitle().isDisplayed();
    }

    public void getImage() {
        productPage.getProdImg().isDisplayed();
    }

    public void getPrice() {
        productPage.getProdPrice().isDisplayed();
    }

    public void getDescription() {
        productPage.getProdDescription().isDisplayed();
    }

    public void getAddBtn() {
        productPage.getAddToCartBtn().isDisplayed();
    }

    public void clickAddToCart() throws InterruptedException {
        Thread.sleep(3000);
        productPage.getAddToCartBtn().click();
        Thread.sleep(1500);
    }

    public void getAllInfo() throws InterruptedException {
        Thread.sleep(3000);
        CustomAssertions.isElementDisplayed(productPage.getProdTitle().isDisplayed());
        CustomAssertions.isElementDisplayed(productPage.getProdImg().isDisplayed());
        CustomAssertions.isElementDisplayed(productPage.getProdPrice().isDisplayed());
        CustomAssertions.isElementDisplayed(productPage.getProdDescription().isDisplayed());
        CustomAssertions.isElementDisplayed(productPage.getAddToCartBtn().isDisplayed());
    }

    public void catchAlertMessage() throws InterruptedException {
        String alert = webDriver.switchTo().alert().getText();
        if(alert.equals("Product added")){
            webDriver.switchTo().alert().accept();
            System.out.println("Got the alert message from popup");
        }
    }


}

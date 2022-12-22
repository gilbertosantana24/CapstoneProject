package Steps;

import Pages.CartPage;

import Tests.CustomAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartSteps extends BaseSteps {
    CartPage cartPage = PageFactory.initElements(webDriver, CartPage.class);

    public CartSteps(WebDriver webDriver){
        super(webDriver);
    }


    public void goCartpage() throws InterruptedException {
        Thread.sleep(2000);
        cartPage.goCart().click();
    }

    public void checkCartInfo() throws InterruptedException {
        Thread.sleep(3000);
        CustomAssertions.isElementDisplayed(cartPage.getCartTotal().isDisplayed());
        CustomAssertions.isElementDisplayed(cartPage.getPlaceOrderBtn().isDisplayed());
        CustomAssertions.isElementDisplayed(cartPage.getTitleItemOne().isDisplayed());
        CustomAssertions.isElementDisplayed(cartPage.getImgItemOne().isDisplayed());
        CustomAssertions.isElementDisplayed(cartPage.getPriceItemOne().isDisplayed());
        CustomAssertions.isElementDisplayed(cartPage.getDeleteItemOne().isDisplayed());
        CustomAssertions.isElementDisplayed(cartPage.getTitleItemTwo().isDisplayed());
        CustomAssertions.isElementDisplayed(cartPage.getImgItemTwo().isDisplayed());
        CustomAssertions.isElementDisplayed(cartPage.getPriceItemTwo().isDisplayed());
        CustomAssertions.isElementDisplayed(cartPage.getDeleteItemTwo().isDisplayed());
    }
}
